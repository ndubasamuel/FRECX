package com.example.frecx.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.frecx.auth.repository.UserRepository

class AuthViewModel() : ViewModel() {

    var userName: String = "null"
    var password: String = "null"
    var userpassword: String = "null"
    var confirmpassword: String = "null"
    var signupemail: String = "null"
    var signupuserName: String ="null"
    var phoneNumber: String = "null"





    fun onLoginButtonClick() {
//        repository.userLogin(userName,password)
    }

   fun onSignUpButtonClick(){

}
}

class AuthViewModelFactory(): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AuthViewModel::class.java)){
            @Suppress("UNCHECKED_CAST")
            return AuthViewModel() as T
        }
        throw IllegalArgumentException ("Error message")
    }
}