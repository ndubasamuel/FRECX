package com.example.frecx.auth.network


import com.example.frecx.responses.LoginResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface MyApi {
    @FormUrlEncoded
    @POST("")
    suspend fun login(
        @Field("email") email : String,
        @Field("password") password: String
    ): LoginResponse

}