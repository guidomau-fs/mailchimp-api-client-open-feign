package com.brightmarket.mailchimp.api;

import com.brightmarket.mailchimp.api.exception.MailChimpAPIException;
import com.brightmarket.mailchimp.api.factory.AuthFactory;
import com.brightmarket.mailchimp.api.factory.EntityFactory;
import com.brightmarket.mailchimp.api.factory.StubFactory;
import com.brightmarket.mailchimp.api.model.ecommerce.*;
import com.brightmarket.mailchimp.api.stub.CustomersStub;
import com.brightmarket.mailchimp.api.stub.OrdersStub;
import com.brightmarket.mailchimp.api.stub.ProductsStub;
import com.brightmarket.mailchimp.api.stub.StoresStub;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.ArrayList;
import java.util.List;

public class OrderStubMain {

    public static void main(String[] args) throws JsonProcessingException {

        String apiKey = AuthFactory.retrieveAuth();
        String store_id = "123";
        String customer_id = "661";
        String product_id = "123";

        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

        try {

            StoresStub storesStub = StubFactory.createStub(StoresStub.class);
            OrdersStub ordersStub = StubFactory.createStub(OrdersStub.class);
            CustomersStub customersStub = StubFactory.createStub(CustomersStub.class);
            ProductsStub productsStub = StubFactory.createStub(ProductsStub.class);

            // RETRIEVING THE STORE FROM THE SERVER
            Store store = storesStub.retrieveStore(apiKey, store_id);

            // RETRIEVING THE CUSTOMERS FROM THE SERVER
            Customer customer = customersStub.retrieveCustomerFromStore(apiKey, store.getId(), customer_id);
            customer.setCreatedAt(null);
            customer.setUpdatedAt(null);

            Product product = productsStub.retrieveProductFromStore(apiKey, store.getId(), product_id);
            OrderLine orderLine = EntityFactory.createOrderLine(product);
            List<OrderLine> lines = new ArrayList<>();
            lines.add(orderLine);

            System.out.println("\n//------------- CREATING THE ORDER INTO THE STORE -------------//");
            Order order2save = EntityFactory.createOrder(customer, lines);
            Order orderSaved = ordersStub.addOrderToStore(apiKey, store.getId(), order2save);
            orderSaved.setCampaignId(null);
            orderSaved.getCustomer().setCreatedAt(null);
            orderSaved.getCustomer().setUpdatedAt(null);
            System.out.println(objectMapper.writeValueAsString(orderSaved));

            // DELETING THE CART INTO THE STORE
            ordersStub.deleteOrderFromStore(apiKey, store.getId(), orderSaved.getId());
            System.out.println(objectMapper.writeValueAsString(orderSaved));
            System.out.println("\n//------------- DELETING THE ORDER INTO THE STORE -------------//");

        } catch (MailChimpAPIException exception) {
            System.out.println(objectMapper.writeValueAsString(exception.getError()));
        } catch (Exception exception) {
            exception.printStackTrace(System.out);
        }
    }
}

