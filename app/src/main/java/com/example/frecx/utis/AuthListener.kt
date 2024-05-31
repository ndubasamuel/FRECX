package com.example.frecx.utis

interface AuthListener {
    fun onStarted()

    fun onSuccess()

    fun onFailure(message: String)


}