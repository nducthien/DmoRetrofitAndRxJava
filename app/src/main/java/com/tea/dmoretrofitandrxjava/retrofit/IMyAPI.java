package com.tea.dmoretrofitandrxjava.retrofit;


import com.tea.dmoretrofitandrxjava.model.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IMyAPI {
    @GET("posts")
    Observable<List<Post>> getPosts() ;

    // have to import io.
}
