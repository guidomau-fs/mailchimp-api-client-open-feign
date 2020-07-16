package com.brightmarket.mailchimp.api.stub;

import com.brightmarket.mailchimp.api.model.ecommerce.Customer;
import com.brightmarket.mailchimp.api.model.ecommerce.Customers;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface CustomersStub {

    @Headers({
            "Authorization: apikey a5c1547d8b131702938b148efd8b47ff-us10"
    })
    @RequestLine("POST /ecommerce/stores/{store_id}/customers")
    Customer addCustomerToStore(@Param("store_id") String storeId, Customer customer);

    @Headers({
            "Authorization: apikey 52ee054d9d087df9c66cbf656aa6b8f3-us10"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/customers")
    Customers retrieveCustomersFromStore(@Param("store_id") String storeId);
}
