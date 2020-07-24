package com.brightmarket.mailchimp.api.stub;

import com.brightmarket.mailchimp.api.model.ecommerce.Product;
import com.brightmarket.mailchimp.api.model.ecommerce.Products;
import com.brightmarket.mailchimp.api.model.ecommerce.Variant;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface ProductsStub {

    // ----- Products ----- //

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/products")
    Products retrieveProductsFromStore(@Param("token") String token, @Param("store_id") String storeId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("POST /ecommerce/stores/{store_id}/products")
    Product addProductToStore(@Param("token") String token, @Param("store_id") String storeId, Product product);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/products/{product_id}")
    Product retrieveProductFromStore(@Param("token") String token,
                                     @Param("store_id") String storeId, @Param("product_id") String productId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("DELETE /ecommerce/stores/{store_id}/products/{product_id}")
    void deleteProductFromStore(@Param("token") String token,
                                @Param("store_id") String storeId, @Param("product_id") String productId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("PATCH /ecommerce/stores/{store_id}/products/{product_id}")
    Product updateProductToStore(@Param("token") String token,
                                   @Param("store_id") String storeId, @Param("product_id") String productId, Product product);


    // ----- Product Variants ----- //

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/products/{product_id}/variants")
    Variants retrieveProductVariantsFromStore(@Param("token") String token,
                                              @Param("store_id") String storeId, @Param("product_id") String productId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("POST /ecommerce/stores/{store_id}/products/{product_id}/variants")
    Variant addProductVariantToStore(@Param("token") String token,
                                     @Param("store_id") String storeId, @Param("product_id") String productId, Variant variant);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id}")
    Variant retrieveProductVariantFromStore(@Param("token") String token,
                                            @Param("store_id") String storeId, @Param("product_id") String productId,
                                            @Param("variant_id") String variantId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("DELETE /ecommerce/stores/{store_id}/products/{product_id}/variants/{}")
    void deleteProductVariantFromStore(@Param("token") String token,
                                       @Param("store_id") String storeId, @Param("product_id") String productId,
                                       @Param("variant_id") String variantId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("PUT /ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id}")
    Variant addOrUpdateProductVariantToStore(@Param("token") String token,
                                             @Param("store_id") String storeId, @Param("product_id") String productId,
                                             @Param("variant_id") String variantId, Variant variant);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("PATCH /ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id}")
    Variant updateProductVariantToStore(@Param("token") String token,
                                             @Param("store_id") String storeId, @Param("product_id") String productId,
                                             @Param("variant_id") String variantId, Variant variant);
}
