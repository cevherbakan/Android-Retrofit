package com.example.retrofit_uygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TextView textViewResult;
    private JsonPlaceHolderApi jsonPlaceHolderApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult = findViewById(R.id.text_view_result);
        
        Gson gson = new GsonBuilder().setLenient().create();

        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://www.cleanpagesoft.com/").addConverterFactory(GsonConverterFactory.create(gson)).build();
        jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        createPost();
    }

    private void createPost() {
        Post post = new Post("cevherPost", "soyisim", "parola","44");

        Call<Mesaj> call = jsonPlaceHolderApi.createPost(post.getName(),post.getSurname(),post.getPassword(),post.getNumber());

        call.enqueue(new Callback<Mesaj>() {
            @Override
            public void onResponse(Call<Mesaj> call, Response<Mesaj> response) {
                if (!response.isSuccessful()) {
                    textViewResult.setText("Code: " + response.code());
                    return;
                }

                textViewResult.setText(response.body().getMesaj()+"  "+response.body().getSoy_isim());

            }
            @Override
            public void onFailure(Call<Mesaj> call, Throwable t) {
                textViewResult.setText("hata"+t.getMessage());
            }
        });
    }
}