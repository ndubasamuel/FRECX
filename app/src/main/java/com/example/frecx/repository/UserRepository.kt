package com.example.frecx.repository

import android.util.Log
import com.example.frecx.auth.network.MyApi


class UserRepository (private val api: MyApi): BaseRepository() {

    suspend fun userLogin(email: String, password: String) = safeApiCall{
        Log.d("User Repo", "Repo Data $email, $password")
         api.login(email, password)

     }
}