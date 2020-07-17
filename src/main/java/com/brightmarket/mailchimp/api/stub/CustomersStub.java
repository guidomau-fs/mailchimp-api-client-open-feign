package com.brightmarket.mailchimp.api.stub;

import com.brightmarket.mailchimp.api.model.ecommerce.Customer;
import com.brightmarket.mailchimp.api.model.ecommerce.Customers;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface CustomersStub {

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/customers")
    Customers retrieveCustomersFromStore(@Param("token") String token,
                                         @Param("store_id") String storeId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("POST /ecommerce/stores/{store_id}/customers")
    Customer addCustomerToStore(@Param("token") String token,
                                @Param("store_id") String storeId, Customer customer);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/customers/{customer_id}")
    Customer retrieveCustomerFromStore(@Param("token") String token,
                                       @Param("store_id") String storeId, @Param("customer_id") String customerId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("DELETE /ecommerce/stores/{store_id}/customers/{customer_id}")
    void deleteCustomerFromStore(@Param("token") String token,
                                 @Param("store_id") String storeId, @Param("customer_id") String customerId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("PUT /ecommerce/stores/{store_id}/customers/{customer_id}")
    Customer addOrUpdateCustomerFromStore(@Param("token") String token,
                                          @Param("store_id") String storeId, @Param("customer_id") String customerId, Customer customer);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("PATCH /ecommerce/stores/{store_id}/customers/{customer_id}")
    Customer updateCustomerFromStore(@Param("token") String token,
                                     @Param("store_id") String storeId, @Param("customer_id") String customerId, Customer customer);

}
