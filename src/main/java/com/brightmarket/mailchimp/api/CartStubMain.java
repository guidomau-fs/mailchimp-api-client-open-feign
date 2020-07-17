package com.brightmarket.mailchimp.api;

import com.brightmarket.mailchimp.api.factory.ApiKeyFactory;
import com.brightmarket.mailchimp.api.factory.EntityFactory;
import com.brightmarket.mailchimp.api.factory.StubFactory;
import com.brightmarket.mailchimp.api.model.ecommerce.Cart;
import com.brightmarket.mailchimp.api.model.ecommerce.CartLine;
import com.brightmarket.mailchimp.api.model.ecommerce.Customer;
import com.brightmarket.mailchimp.api.model.ecommerce.Customers;
import com.brightmarket.mailchimp.api.model.ecommerce.Store;
import com.brightmarket.mailchimp.api.model.error.CustomException;
import com.brightmarket.mailchimp.api.stub.CartsStub;
import com.brightmarket.mailchimp.api.stub.CustomersStub;
import com.brightmarket.mailchimp.api.stub.StoresStub;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.ArrayList;
import java.util.List;

public class CartStubMain {

    public static void main(String[] args) throws JsonProcessingException {

        String apiKey = ApiKeyFactory.retrieveApiKey();
        String store_id = "123";

        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

        try {

            StoresStub storesStub = StubFactory.createStoresStub();
            CustomersStub customersStub = StubFactory.createCustomersStub();
            CartsStub cartsStub = StubFactory.createCartsStub();

            // RETRIEVING THE STORE FROM THE SERVER
            Store store = storesStub.retrieveStore(apiKey, store_id);

            // RETRIEVING THE CUSTOMERS FROM THE SERVER
            Customers customers = customersStub.retrieveCustomersFromStore(apiKey, store.getId());
            Customer customer = customers.getCustomers().get(0);
            customer.setCreatedAt(null);
            customer.setUpdatedAt(null);
            customer.setLinks(null);
            List<CartLine> lines = new ArrayList<>();

            // CREATING THE CART INTO THE STORE
            Cart cart2save = EntityFactory.createCart(customer, lines);
            Cart cartSaved = cartsStub.addCartToStore(apiKey, store.getId(), cart2save);
            System.out.println(objectMapper.writeValueAsString(cartSaved));

            // UPDATING THE CART INTO THE STORE
            cartSaved.setTaxTotal(cartSaved.getTaxTotal() + 1);
            Cart cartUpdated = cartsStub.addOrUpdateCartFromStore(apiKey, store.getId(), cartSaved.getId(), cartSaved);
            System.out.println(objectMapper.writeValueAsString(cartUpdated));

        } catch (CustomException exception) {
            System.out.println(objectMapper.writeValueAsString(exception.getError()));
        } catch (Exception exception) {
            exception.printStackTrace(System.out);
        }
    }
}

