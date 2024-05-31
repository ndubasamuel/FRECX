package com.example.frecx.ViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.frecx.auth.network.Resource
import com.example.frecx.repository.UserRepository
import com.example.frecx.responses.LoginResponse
import com.example.frecx.utis.MainUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


class AuthViewModel (private val repository: UserRepository): ViewModel() {


    private var _userRegState = MutableStateFlow<MainUiState>(MainUiState.Init)
    var regState: StateFlow<MainUiState> = _userRegState

    private val _loginResponse: MutableLiveData<Resource<LoginResponse>> = MutableLiveData()
    val loginResponse: LiveData<Resource<LoginResponse>>
        get() = _loginResponse


    fun login(email: String, password: String) {
        Log.d("ViewModel", "$email, $password")
        viewModelScope.launch {
            _loginResponse.value = repository.userLogin(email, password)
        }
    }
}

