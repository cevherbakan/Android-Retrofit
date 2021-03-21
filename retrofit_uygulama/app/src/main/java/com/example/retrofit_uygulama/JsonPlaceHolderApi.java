package com.example.retrofit_uygulama;

import org.json.JSONObject;

import java.util.List;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface JsonPlaceHolderApi {



    //Call<ResponseBody> createPost(@Body Post post);


    @POST("index.php")
    @FormUrlEncoded
    Call<Mesaj> createPost(
            @Field("name") String name,
            @Field("surname") String surname,
            @Field("password") String password,
            @Field("number") String number
    );

}