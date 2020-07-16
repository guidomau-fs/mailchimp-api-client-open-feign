package com.brightmarket.mailchimp.api;

import com.brightmarket.mailchimp.api.codec.DefaultErrorDecoder;
import com.brightmarket.mailchimp.api.model.ecommerce.*;
import com.brightmarket.mailchimp.api.model.error.CustomException;
import com.brightmarket.mailchimp.api.stub.CartsStub;
import com.brightmarket.mailchimp.api.stub.CustomersStub;
import com.brightmarket.mailchimp.api.stub.StoresStub;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import feign.Feign;
import feign.Logger.Level;
import feign.http2client.Http2Client;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.micrometer.MicrometerCapability;
import feign.slf4j.Slf4jLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

        try {

            // RETRIEVING THE STORES LIST
            StoresStub storesStub = StubFactory.createStoresStub();
            Stores stores = storesStub.retrieveStores();
            //System.out.println(objectMapper.writeValueAsString(stores));

            // RETRIEVING THE CUSTOMERS LIST BY STORE 123
            CustomersStub customersStub = StubFactory.createCustomersStub();
            Customers customers = customersStub.retrieveCustomersFromStore(stores.getStores().get(0).getId());
            //System.out.println(objectMapper.writeValueAsString(customers));

            // RETRIEVING THE CARTS LIST BY STORE 123
            CartsStub cartsStub = StubFactory.createCartsStub();
            Carts carts = cartsStub.retrieveCartsFromStore("123");
            //System.out.println(objectMapper.writeValueAsString(carts));


            // SAVING A CART IN THE STORE 123
            Customer customer = customers.getCustomers().get(0);
            customer.setCreatedAt(null);
            customer.setUpdatedAt(null);
            List<CartLine> lines = new ArrayList<>();

            Cart cart2save = EntityFactory.createCart(customer, lines);
            System.out.println(objectMapper.writeValueAsString(cart2save));

            Cart cartSaved = cartsStub.addCartToStore("123", cart2save);
            System.out.println(objectMapper.writeValueAsString(cartSaved));

        } catch (CustomException e) {
            System.out.println(objectMapper.writeValueAsString(e.getError()));
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
