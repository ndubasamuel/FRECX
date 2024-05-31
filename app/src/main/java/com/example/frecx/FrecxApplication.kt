package com.example.frecx

import android.app.Application
import android.util.Log
import com.example.frecx.BuildConfig
import dagger.hilt.android.HiltAndroidApp



class FrecxApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Log.d("Hilt Android APP", "Application Build Error")
    }
}
