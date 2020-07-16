package com.brightmarket.mailchimp.api.stub;

import com.brightmarket.mailchimp.api.model.ecommerce.Customers;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface CustomersStub {

    @Headers({
            "Authorization: apikey 52ee054d9d087df9c66cbf656aa6b8f3-us10"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/customers")
    Customers retrieveCustomersFromStore(@Param("store_id") String storeId);
}
