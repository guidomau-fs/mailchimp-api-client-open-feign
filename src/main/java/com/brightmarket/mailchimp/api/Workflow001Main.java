package com.brightmarket.mailchimp.api;

import com.brightmarket.mailchimp.api.exception.MailChimpAPIException;
import com.brightmarket.mailchimp.api.factory.AuthFactory;
import com.brightmarket.mailchimp.api.factory.EntityFactory;
import com.brightmarket.mailchimp.api.factory.StubFactory;
import com.brightmarket.mailchimp.api.model.ecommerce.Store;
import com.brightmarket.mailchimp.api.model.lists.List;
import com.brightmarket.mailchimp.api.stub.ListsStub;
import com.brightmarket.mailchimp.api.stub.StoresStub;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Workflow001Main {

    public static void main(String[] args) throws JsonProcessingException {

        String token = AuthFactory.retrieveAuth();
        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        ListsStub listsStub = StubFactory.createStub(ListsStub.class);
        StoresStub storesStub = StubFactory.createStub(StoresStub.class);

        try {

            List listSaved = listCreation(token, listsStub);
            System.out.println(objectMapper.writeValueAsString(listSaved));

            Store storeSaved = storeCreation(token, storesStub, listSaved);
            System.out.println(objectMapper.writeValueAsString(storeSaved));

        } catch (MailChimpAPIException exception) {
            System.out.println(objectMapper.writeValueAsString(exception.getError()));
        } catch (Exception exception) {
            exception.printStackTrace(System.out);
        }
    }

    private static List listCreation(String token, ListsStub listsStub) {
        List list2save = EntityFactory.createList();
        List listSaved = listsStub.addList(token, list2save);
        return listSaved;
    }

    private static Store storeCreation(String token, StoresStub storesStub, List list) {
        Store store2save = EntityFactory.createStore(list);
        Store storeSaved = storesStub.addStore(token, store2save);
        return storeSaved;
    }
}
