package com.brightmarket.mailchimp.api.stub;

import com.brightmarket.mailchimp.api.model.lists.List;
import com.brightmarket.mailchimp.api.model.lists.Lists;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface ListsStub {

    // ----- Lists ----- //

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /lists")
    Lists retrieveLists(@Param("token") String token);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("POST /lists")
    List addList(@Param("token") String token, List list);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("GET /lists/{list_id}")
    List retrieveList(@Param("token") String token, @Param("list_id") String listId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("DELETE /lists/{list_id}")
    void deleteList(@Param("token") String token, @Param("list_id") String listId);

    @Headers({
            "Authorization: {token}"
    })
    @RequestLine("PATCH /lists/{list_id}")
    List updateList(@Param("token") String token, @Param("list_id") String listId, List list);


    // ----- Members Lists ----- //
}
