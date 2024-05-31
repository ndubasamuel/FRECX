package com.example.frecx.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.frecx.repository.BaseRepository
import com.example.frecx.repository.UserRepository

class ViewModelFactory(private val repository: BaseRepository): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(AuthViewModel::class.java) -> AuthViewModel(repository as UserRepository) as T

            else -> throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}