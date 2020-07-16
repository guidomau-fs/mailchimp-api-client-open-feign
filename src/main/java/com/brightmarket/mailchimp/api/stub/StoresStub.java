package com.brightmarket.mailchimp.api.stub;

import com.brightmarket.mailchimp.api.model.ecommerce.Stores;
import feign.Headers;
import feign.RequestLine;

public interface StoresStub {

    @Headers({
            "Authorization: apikey 52ee054d9d087df9c66cbf656aa6b8f3-us10"
    })
    @RequestLine("GET /ecommerce/stores/")
    Stores retrieveStores();
}
