package com.brightmarket.mailchimp.api;

import com.brightmarket.mailchimp.api.factory.ApiKeyFactory;
import com.brightmarket.mailchimp.api.factory.EntityFactory;
import com.brightmarket.mailchimp.api.factory.StubFactory;
import com.brightmarket.mailchimp.api.model.ecommerce.Customer;
import com.brightmarket.mailchimp.api.model.ecommerce.Store;
import com.brightmarket.mailchimp.api.model.error.CustomException;
import com.brightmarket.mailchimp.api.stub.CustomersStub;
import com.brightmarket.mailchimp.api.stub.StoresStub;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class CustomerStubMain {

    public static void main(String[] args) throws JsonProcessingException {

        String apiKey = ApiKeyFactory.retrieveApiKey();
        String store_id = "123";

        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

        try {

            StoresStub storesStub = StubFactory.createStoresStub();
            CustomersStub customersStub = StubFactory.createCustomersStub();

            // RETRIEVING THE STORE FROM THE SERVER
            Store store = storesStub.retrieveStore(apiKey, store_id);

            System.out.println("\n//------------- CREATING THE CUSTOMER INTO THE STORE -------------//");
            Customer customerToSave = EntityFactory.createCustomer();
            Customer customerSaved = customersStub.addCustomerToStore(apiKey, store.getId(), customerToSave);
            System.out.println(objectMapper.writeValueAsString(customerSaved));

            System.out.println("\n//------------- UPDATING THE CUSTOMER INTO THE STORE -------------//");
            customerSaved.setFirstName(customerSaved.getFirstName() + " UPDATED");
            customerSaved.setCreatedAt(null);
            customerSaved.setUpdatedAt(null);
            Customer customerUpdated = customersStub.addOrUpdateCustomerFromStore(apiKey, store.getId(), customerSaved.getId(), customerSaved);
            System.out.println(objectMapper.writeValueAsString(customerUpdated));

        } catch (CustomException exception) {
            System.out.println(objectMapper.writeValueAsString(exception.getError()));
        } catch (Exception exception) {
            exception.printStackTrace(System.out);
        }
    }
}
