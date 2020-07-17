package com.brightmarket.mailchimp.api;

import com.brightmarket.mailchimp.api.factory.ApiKeyFactory;
import com.brightmarket.mailchimp.api.factory.StubFactory;
import com.brightmarket.mailchimp.api.model.ecommerce.Carts;
import com.brightmarket.mailchimp.api.model.ecommerce.Customers;
import com.brightmarket.mailchimp.api.model.ecommerce.Store;
import com.brightmarket.mailchimp.api.model.ecommerce.Stores;
import com.brightmarket.mailchimp.api.model.error.CustomException;
import com.brightmarket.mailchimp.api.stub.CartsStub;
import com.brightmarket.mailchimp.api.stub.CustomersStub;
import com.brightmarket.mailchimp.api.stub.StoresStub;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GETMain {

    private static Logger logger = LoggerFactory.getLogger(GETMain.class);

    public static void main(String[] args) throws JsonProcessingException {

        String apiKey = ApiKeyFactory.retrieveApiKey();
        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

        try {

            StoresStub storesStub = StubFactory.createStoresStub();
            CustomersStub customersStub = StubFactory.createCustomersStub();
            CartsStub cartsStub = StubFactory.createCartsStub();

            System.out.println("\n//------------- RETRIEVING THE STORES LIST -------------//");
            Stores stores = storesStub.retrieveStores(apiKey);
            System.out.println(objectMapper.writeValueAsString(stores));

            System.out.println("\n//------------- RETRIEVING THE CUSTOMERS LIST BY STORE -------------//");
            for (Store store : stores.getStores()) {

                Customers customers = customersStub.retrieveCustomersFromStore(apiKey, store.getId());
                System.out.println(objectMapper.writeValueAsString(customers));
            }

            System.out.println("\n//------------- RETRIEVING THE CARTS LIST BY STORE -------------//");
            for (Store store : stores.getStores()) {

                Carts carts = cartsStub.retrieveCartsFromStore(apiKey, store.getId());
                System.out.println(objectMapper.writeValueAsString(carts));
            }


        } catch (CustomException e) {
            System.out.println(objectMapper.writeValueAsString(e.getError()));
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
