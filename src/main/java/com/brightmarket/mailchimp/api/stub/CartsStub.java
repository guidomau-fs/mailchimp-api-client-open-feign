package com.brightmarket.mailchimp.api.stub;

import com.brightmarket.mailchimp.api.model.ecommerce.Cart;
import com.brightmarket.mailchimp.api.model.ecommerce.CartLine;
import com.brightmarket.mailchimp.api.model.ecommerce.Carts;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface CartsStub {

    // ----- Carts ----- //

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/carts")
    Carts retrieveCartsFromStore(@Param("token") String token, @Param("store_id") String storeId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("POST /ecommerce/stores/{store_id}/carts")
    Cart addCartToStore(@Param("token") String token, @Param("store_id") String storeId, Cart cart);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/carts/{cart_id}")
    Cart retrieveCartFromStore(@Param("token") String token,
                               @Param("store_id") String storeId, @Param("cart_id") String cartId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("DELETE /ecommerce/stores/{store_id}/carts/{cart_id}")
    void deleteCartFromStore(@Param("token") String token,
                             @Param("store_id") String storeId, @Param("cart_id") String cartId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("PATCH /ecommerce/stores/{store_id}/carts/{cart_id}")
    Cart updateCartToStore(@Param("token") String token,
                             @Param("store_id") String storeId, @Param("cart_id") String cartId, Cart cart);


    // ----- Cart Lines ----- //

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/carts/{cart_id}/lines")
    CartLines retrieveCartLinesFromStore(@Param("token") String token,
                                         @Param("store_id") String storeId, @Param("cart_id") String cartId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("POST /ecommerce/stores/{store_id}/carts/{cart_id}/lines")
    CartLine addCartLineToStore(@Param("token") String token,
                                @Param("store_id") String storeId, @Param("cart_id") String cartId, CartLine cartLine);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id}")
    CartLine retrieveCartLineFromStore(@Param("token") String token,
                                       @Param("store_id") String storeId, @Param("cart_id") String cartId,
                                       @Param("line_id") String cartLineId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("DELETE /ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id}")
    void deleteCartLineFromStore(@Param("token") String token,
                                 @Param("store_id") String storeId, @Param("cart_id") String cartId,
                                 @Param("line_id") String cartLineId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("PATCH /ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id}")
    CartLine updateCartLineToStore(@Param("token") String token,
                                     @Param("store_id") String storeId, @Param("cart_id") String cartId,
                                     @Param("line_id") String cartLineId, CartLine cartLine);

}
