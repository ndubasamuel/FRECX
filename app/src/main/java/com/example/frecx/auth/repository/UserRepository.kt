package com.example.frecx.auth.repository

import androidx.lifecycle.MutableLiveData
import com.example.frecx.auth.network.MyApi
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response

class UserRepository {

    fun userLogin(username: String, password: String): MutableLiveData<String> {
       val loginResponse = MutableLiveData<String>()

       MyApi().userLogin(username, password)
           (object : retrofit2.Callback<ResponseBody> {
               override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                   if (response.isSuccessful) {
                       loginResponse.value = response.body()?.string()
                   } else {
                       loginResponse.value = response.errorBody()?.string()
                   }
               }

               override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                   loginResponse.value = t.message
               }

           })
        return loginResponse
    }
}