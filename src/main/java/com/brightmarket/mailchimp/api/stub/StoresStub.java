package com.brightmarket.mailchimp.api.stub;

import com.brightmarket.mailchimp.api.model.ecommerce.Store;
import com.brightmarket.mailchimp.api.model.ecommerce.Stores;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface StoresStub {

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/stores/")
    Stores retrieveStores(@Param("token") String token);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("POST /ecommerce/stores")
    Store addStore(@Param("token") String token, Store store);


    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}")
    Store retrieveStore(@Param("token") String token, @Param("store_id") String storeId);
}
