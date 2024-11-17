package com.example.learning.Models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient{

    private static final String BASE_URL1="http://learning.webtechinfoway.in/";

    private static Retrofit retrofit = null;

    public static Retrofit getClient() {


        OkHttpClient.Builder client = new OkHttpClient.Builder();
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit1 = new Retrofit.Builder()
                .baseUrl(BASE_URL1)
                .client(client.build())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        return retrofit1;
    }
}
