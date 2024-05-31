package com.example.frecx



import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.frecx.ui.View.regscreens.ViewActivity
import dagger.hilt.android.AndroidEntryPoint

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
//        installSplashScreen()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        finish()
        startActivity( Intent(this, ViewActivity::class.java))

    }
}