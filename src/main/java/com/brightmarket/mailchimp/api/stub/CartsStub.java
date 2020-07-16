package com.brightmarket.mailchimp.api.stub;

import com.brightmarket.mailchimp.api.model.ecommerce.Cart;
import com.brightmarket.mailchimp.api.model.ecommerce.Carts;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface CartsStub {

    @Headers({
            "Authorization: apikey 52ee054d9d087df9c66cbf656aa6b8f3-us10"
    })
    @RequestLine("POST /ecommerce/stores/{store_id}/carts")
    Cart addCartToStore(@Param("store_id") String storeId, Cart cart);

    @Headers({
            "Authorization: apikey 52ee054d9d087df9c66cbf656aa6b8f3-us10"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/carts")
    Carts retrieveCartsFromStore(@Param("store_id") String storeId);
}
