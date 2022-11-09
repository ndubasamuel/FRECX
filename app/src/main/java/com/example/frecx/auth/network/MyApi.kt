package com.example.frecx.auth.network


import okhttp3.Call
import okhttp3.ResponseBody
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface MyApi {
    @FormUrlEncoded
    @POST("login")
    fun userLogin(
        @Field("username") useName1: String,
        @Field("email") email: String,

        )

    companion object {
        operator fun invoke(): MyApi{
        return Retrofit.Builder()
            .baseUrl("https://verifyaccounts.herokuapp.com/auth/login")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(MyApi::class.java)
    }

}


}