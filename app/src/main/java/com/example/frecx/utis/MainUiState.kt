package com.example.frecx.utis

import com.example.frecx.responses.LoginResponse

sealed class MainUiState {
    object Init : MainUiState()
    object Loading : MainUiState()

    data class Success(val loginResponse: LoginResponse) : MainUiState()
    data class Error(val message: String) : MainUiState()
}