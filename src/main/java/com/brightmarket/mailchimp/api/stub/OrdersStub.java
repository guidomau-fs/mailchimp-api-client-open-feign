package com.brightmarket.mailchimp.api.stub;

import com.brightmarket.mailchimp.api.model.ecommerce.*;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface OrdersStub {

    // ----- Orders ----- //

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
    Order retrieveOrderFromStore(@Param("token") String token,
                                 @Param("store_id") String storeId, @Param("order_id") String orderId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("DELETE /ecommerce/stores/{store_id}/orders/{order_id}")
    void deleteOrderFromStore(@Param("token") String token,
                              @Param("store_id") String storeId, @Param("order_id") String orderId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("PATCH PATCH /ecommerce/stores/{store_id}/orders/{order_id}")
    Order updateOrderFromStore(@Param("token") String token,
                               @Param("store_id") String storeId, @Param("order_id") String orderId, Order order);

    // ----- Order Lines ----- //

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/orders/{order_id}/lines")
    OrderLines retrieveOrderLinesFromStore(@Param("token") String token,
                                           @Param("store_id") String storeId, @Param("order_id") String orderId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("POST /ecommerce/stores/{store_id}/orders/{order_id}/lines")
    OrderLine addOrderLineToStore(@Param("token") String token,
                                  @Param("store_id") String storeId, @Param("order_id") String orderId, OrderLine orderLine);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/orders/{order_id}/lines/{line_id}")
    OrderLine retrieveOrderLineFromStore(@Param("token") String token,
                                         @Param("store_id") String storeId, @Param("order_id") String orderId,
                                         @Param("line_id") String orderLineId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("DELETE /ecommerce/stores/{store_id}/orders/{order_id}/lines/{line_id}")
    void deleteOrderLineFromStore(@Param("token") String token,
                                  @Param("store_id") String storeId, @Param("order_id") String orderId,
                                  @Param("line_id") String orderLineId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("PATCH /ecommerce/stores/{store_id}/orders/{order_id}/lines/{line_id}")
    OrderLine updateOrderLineFromStore(@Param("token") String token,
                                       @Param("store_id") String storeId, @Param("order_id") String orderId,
                                       @Param("line_id") String orderLineId, OrderLine orderLine);
}
