package com.brightmarket.mailchimp.api;

import com.brightmarket.mailchimp.api.factory.ApiKeyFactory;
import com.brightmarket.mailchimp.api.factory.EntityFactory;
import com.brightmarket.mailchimp.api.factory.StubFactory;
import com.brightmarket.mailchimp.api.model.ecommerce.Product;
import com.brightmarket.mailchimp.api.model.ecommerce.Store;
import com.brightmarket.mailchimp.api.model.ecommerce.Variant;
import com.brightmarket.mailchimp.api.model.error.CustomException;
import com.brightmarket.mailchimp.api.stub.ProductsStub;
import com.brightmarket.mailchimp.api.stub.StoresStub;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ProductStubMain {

    public static void main(String[] args) throws JsonProcessingException {

        String apiKey = ApiKeyFactory.retrieveApiKey();
        String store_id = "123";

        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

        try {

            StoresStub storesStub = StubFactory.createStoresStub();
            ProductsStub productsStub = StubFactory.createProductsStub();

            //RETRIEVING THE STORE FROM THE SERVER
            Store store = storesStub.retrieveStore(apiKey, store_id);
            System.out.println(objectMapper.writeValueAsString(store));

            //CREATING THE PRODUCT INTO THE STORE
            Product productToSave = EntityFactory.createProduct();
            Product productSaved = productsStub.addProductToStore(apiKey, store.getId(), productToSave);
            System.out.println("PRODUCT SAVED");
            System.out.println(objectMapper.writeValueAsString(productSaved));

            //ADDING A NEW VARIANT TO THE PRODUCT
            Variant variantToAdd = EntityFactory.createProductVariant();
            Variant variantAdded = productsStub.addProductVariantToStore(apiKey, store_id,
                    productSaved.getId(), variantToAdd);
            System.out.println("VARIANT ADDED");
            System.out.println(objectMapper.writeValueAsString(variantAdded));

        } catch (CustomException exception) {
            System.out.println(objectMapper.writeValueAsString(exception.getError()));
        } catch (Exception exception) {
            exception.printStackTrace(System.out);
        }
    }
}
