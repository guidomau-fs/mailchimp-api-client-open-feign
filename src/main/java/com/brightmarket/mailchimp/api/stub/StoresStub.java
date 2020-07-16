package com.brightmarket.mailchimp.api.stub;

import com.brightmarket.mailchimp.api.model.ecommerce.Stores;
import feign.Headers;
import feign.RequestLine;

public interface StoresStub {

    @Headers({
            "Authorization: apikey a5c1547d8b131702938b148efd8b47ff-us10"
    })
    @RequestLine("GET /ecommerce/stores/")
    Stores retrieveStores();
}
