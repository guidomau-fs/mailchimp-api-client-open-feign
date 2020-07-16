package com.brightmarket.mailchimp.api;

import com.brightmarket.mailchimp.api.model.ecommerce.Customer;
import com.brightmarket.mailchimp.api.model.ecommerce.Stores;
import com.brightmarket.mailchimp.api.model.error.CustomException;
import com.brightmarket.mailchimp.api.stub.CustomersStub;
import com.brightmarket.mailchimp.api.stub.StoresStub;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class CustomerStubMain {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

        try {
            // RETRIEVING THE STORE LIST
            StoresStub storesStub = StubFactory.createStoresStub();
            Stores stores = storesStub.retrieveStores();

            CustomersStub customersStub = StubFactory.createCustomersStub();

            Customer customerToSave = EntityFactory.createCustomer();
            Customer customerSaved = customersStub.addCustomerToStore(stores.getStores().get(0).getId(), customerToSave);
            System.out.println(objectMapper.writeValueAsString(customerSaved));
        } catch (CustomException exception) {
            System.out.println(objectMapper.writeValueAsString(exception.getError()));
        } catch (Exception exception) {
            exception.printStackTrace(System.out);
        }
    }
}
