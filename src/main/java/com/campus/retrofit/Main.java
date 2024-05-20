package com.campus.retrofit;

import com.campus.retrofit.request.PostCreateRequest;
import com.campus.retrofit.request.PostUpdateRequest;
import com.campus.retrofit.response.PostResponse;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello Retrofit");

        JsonPlaceholderApi api = JsonPlaceHolderService.getInstance().api();

        System.out.println("GET: /posts ---------------");
        Response<List<PostResponse>> postsResponse = api.posts(null).execute();
        System.out.println(postsResponse.code());
        System.out.println(postsResponse.headers());
        List<PostResponse> posts = postsResponse.body();
        System.out.println(posts);


        System.out.println("GET: /posts ---------------");
        PostCreateRequest createRequest = new PostCreateRequest();
        createRequest.setBody("Body");
        createRequest.setTitle("title");
        createRequest.setUserid(1);
        Response<PostResponse> createResponse = api.create(createRequest).execute();
        System.out.println(createResponse);

        System.out.println("PUT: /posts ---------------");

        PostUpdateRequest upaateReauest = new PostUpdateRequest();
        upaateReauest.setBody("Body");
        upaateReauest.setTitle("title");
        upaateReauest.setUserid(1);
        upaateReauest.setId(1);
        Response<PostResponse> upaateResponse = api.update(1, upaateReauest).execute();
        System.out.println(upaateResponse.body());

        System.out.println("DELETE: /posts ---------------");
        Integer statusCode = api.delete(1).execute().code();
        System.out.println(statusCode);


    }
}
