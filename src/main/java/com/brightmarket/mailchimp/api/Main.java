package com.brightmarket.mailchimp.api;

import com.brightmarket.mailchimp.api.factory.ApiKeyFactory;
import com.brightmarket.mailchimp.api.factory.EntityFactory;
import com.brightmarket.mailchimp.api.factory.StubFactory;
import com.brightmarket.mailchimp.api.model.ecommerce.*;
import com.brightmarket.mailchimp.api.model.error.CustomException;
import com.brightmarket.mailchimp.api.stub.CartsStub;
import com.brightmarket.mailchimp.api.stub.CustomersStub;
import com.brightmarket.mailchimp.api.stub.StoresStub;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws JsonProcessingException {

        String apiKey = ApiKeyFactory.retrieveApiKey();
        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

        try {

            // RETRIEVING THE STORES LIST
            StoresStub storesStub = StubFactory.createStoresStub();
            Stores stores = storesStub.retrieveStores(apiKey);
            //System.out.println(objectMapper.writeValueAsString(stores));

            // RETRIEVING THE CUSTOMERS LIST BY STORE 123
            CustomersStub customersStub = StubFactory.createCustomersStub();
            Customers customers = customersStub.retrieveCustomersFromStore(apiKey, stores.getStores().get(0).getId());
            //System.out.println(objectMapper.writeValueAsString(customers));

            // RETRIEVING THE CARTS LIST BY STORE 123
            CartsStub cartsStub = StubFactory.createCartsStub();
            Carts carts = cartsStub.retrieveCartsFromStore(apiKey, stores.getStores().get(0).getId());
            //System.out.println(objectMapper.writeValueAsString(carts));


            // SAVING A CART IN THE STORE 123
            Customer customer = customers.getCustomers().get(0);
            customer.setCreatedAt(null);
            customer.setUpdatedAt(null);
            customer.setLinks(null);
            List<CartLine> lines = new ArrayList<>();

            Cart cart2save = EntityFactory.createCart(customer, lines);
            System.out.println(objectMapper.writeValueAsString(cart2save));

            Cart cartSaved = cartsStub.addCartToStore(apiKey, stores.getStores().get(0).getId(), cart2save);
            System.out.println(objectMapper.writeValueAsString(cartSaved));

        } catch (CustomException e) {
            System.out.println(objectMapper.writeValueAsString(e.getError()));
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
