package com.example.learning.Models;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("api.php")
    Call<Add_user_data> add_user_data
            (@Field("action") String add_user ,
             @Field("user_email") String user_mail ,
             @Field("user_device") String user_device);

    @FormUrlEncoded
    @POST("api.php")
    Call<Get_course_category> get_course_category(@Field("action") String get_catagory);

    @FormUrlEncoded
    @POST("api.php")
    Call<Get_course> get_course(
            @Field("action") String get_course ,
            @Field("cat_id") String categoryId  // Add parameter for category ID
    );

    @FormUrlEncoded
    @POST("api.php")
    Call<Add_Enroll> add_enroll(
            @Field("action") String add_enroll ,
            @Field("user_email") String user_mail ,
            @Field("enrooll_course_id") String enroll_course_id
    );

    @FormUrlEncoded
    @POST("api.php")
    Call<Get_enrolled_course> get_enroll_course(@Field("action") String get_enroll_course ,
                                                @Field("user_email") String user_mail);

    @FormUrlEncoded
    @POST("api.php")
    Call<Get_quiz> get_quiz(@Field("action") String get_quiz , @Field("category") String course_name);

    @FormUrlEncoded
    @POST("api.php")
    Call<Store_score> add_quiz_score(@Field("action") String add_quiz_score ,
                                     @Field("user_email") String user_email ,
                                     @Field("course_id") String course_id ,
                                     @Field("total_score") String total_score);

    @FormUrlEncoded
    @POST("api.php")
    Call<Get_score> get_score(@Field("action") String get_quiz_score ,
                              @Field("user_email") String user_email ,
                              @Field("course_id") String course_id);

    @FormUrlEncoded
    @POST("api.php")
    Call<Add_certificate> add_certificate(@Field("action") String add_certificate ,
                                          @Field("user_email") String user_email ,
                                          @Field("course_id") String course_id);

    @FormUrlEncoded
    @POST("api.php")
    Call<Get_certificate> get_certificate(@Field("action") String get_certificate ,
                                          @Field("user_email") String user_email ,
                                          @Field("course_id") String course_id);

    @FormUrlEncoded
    @POST("api.php")
    Call<Get_user> get_user(@Field("action") String get_user ,
                            @Field("user_email") String user_email);

}