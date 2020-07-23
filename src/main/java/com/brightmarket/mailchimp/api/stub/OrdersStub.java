package com.brightmarket.mailchimp.api.stub;

import com.brightmarket.mailchimp.api.model.ecommerce.Order;
import com.brightmarket.mailchimp.api.model.ecommerce.Orders;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface OrdersStub {

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/orders")
    Orders retrieveOrders(@Param("token") String token);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/orders")
    Orders retrieveOrdersFromStore(@Param("token") String token, @Param("store_id") String storeId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("POST /ecommerce/stores/{store_id}/orders")
    Order addOrderToStore(@Param("token") String token, @Param("store_id") String storeId, Order order);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/orders/{order_id}")
    Order retrievOrderFromStore(@Param("token") String token,
                                @Param("store_id") String storeId, @Param("order_id") String orderId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("DELETE /ecommerce/stores/{store_id}/orders/{order_id}")
    void deleteOrderFromStore(@Param("token") String token,
                              @Param("store_id") String storeId, @Param("order_id") String orderId);
}
