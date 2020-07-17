package com.brightmarket.mailchimp.api.stub;

import com.brightmarket.mailchimp.api.model.ecommerce.Cart;
import com.brightmarket.mailchimp.api.model.ecommerce.Carts;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface CartsStub {

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("POST /ecommerce/stores/{store_id}/carts")
    Cart addCartToStore(@Param("token") String token, @Param("store_id") String storeId, Cart cart);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/carts")
    Carts retrieveCartsFromStore(@Param("token") String token, @Param("store_id") String storeId);
}
