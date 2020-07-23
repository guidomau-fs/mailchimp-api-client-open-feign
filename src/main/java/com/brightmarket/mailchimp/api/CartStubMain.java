package com.brightmarket.mailchimp.api;

import com.brightmarket.mailchimp.api.exception.MailChimpAPIException;
import com.brightmarket.mailchimp.api.factory.AuthFactory;
import com.brightmarket.mailchimp.api.factory.EntityFactory;
import com.brightmarket.mailchimp.api.factory.StubFactory;
import com.brightmarket.mailchimp.api.model.ecommerce.*;
import com.brightmarket.mailchimp.api.stub.CartsStub;
import com.brightmarket.mailchimp.api.stub.CustomersStub;
import com.brightmarket.mailchimp.api.stub.ProductsStub;
import com.brightmarket.mailchimp.api.stub.StoresStub;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.ArrayList;
import java.util.List;

public class CartStubMain {

    public static void main(String[] args) throws JsonProcessingException {

        String apiKey = AuthFactory.retrieveAuth();
        String store_id = "123";
        String customer_id = "661";
        String product_id = "123";

        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

        try {

            StoresStub storesStub = StubFactory.createStub(StoresStub.class);
            CustomersStub customersStub = StubFactory.createStub(CustomersStub.class);
            CartsStub cartsStub = StubFactory.createStub(CartsStub.class);
            ProductsStub productsStub = StubFactory.createStub(ProductsStub.class);

            // RETRIEVING THE STORE FROM THE SERVER
            Store store = storesStub.retrieveStore(apiKey, store_id);

            // RETRIEVING THE CUSTOMERS FROM THE SERVER
            Customer customer = customersStub.retrieveCustomerFromStore(apiKey, store.getId(), customer_id);
            customer.setCreatedAt(null);
            customer.setUpdatedAt(null);

            Product product = productsStub.retrieveProductFromStore(apiKey, store.getId(), product_id);
            CartLine cartLine = EntityFactory.createCartLine(product);
            List<CartLine> lines = new ArrayList<>();
            lines.add(cartLine);

            // CREATING THE CART INTO THE STORE
            Cart cart2save = EntityFactory.createCart(customer, lines);
            cart2save.setCreatedAt(null);
            cart2save.setUpdatedAt(null);

            System.out.println("\n//------------- CREATING THE CART INTO THE STORE -------------//");
            Cart cartSaved = cartsStub.addCartToStore(apiKey, store.getId(), cart2save);
            cartSaved.setCampaignId(null);
            cartSaved.setCreatedAt(null);
            cartSaved.setUpdatedAt(null);
            cartSaved.getCustomer().setCreatedAt(null);
            cartSaved.getCustomer().setUpdatedAt(null);
            System.out.println(objectMapper.writeValueAsString(cartSaved));

            // DELETING THE CART INTO THE STORE
            cartsStub.deleteCartFromStore(apiKey, store.getId(), cartSaved.getId());
            System.out.println(objectMapper.writeValueAsString(cartSaved));
            System.out.println("\n//------------- DELETING THE CART INTO THE STORE -------------//");

        } catch (MailChimpAPIException exception) {
            System.out.println(objectMapper.writeValueAsString(exception.getError()));
        } catch (Exception exception) {
            exception.printStackTrace(System.out);
        }
    }
}

