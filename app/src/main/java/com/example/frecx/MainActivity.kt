package com.example.frecx



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.example.frecx.auth.AuthViewModel
import com.example.frecx.databinding.ActivityMainBinding
import com.example.frecx.onboarding.SwipingImages
import com.example.frecx.onboarding.ViewPagerAdapter


class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private var viewPager2: ViewPager2? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setupViewPager(binding!!)

supportActionBar?.hide()

    }

    private val pager2Callback = object: ViewPager2.OnPageChangeCallback(){
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
            if(position== SwipingImages.introSlides.size -1)
                return finish()
        }
    }

    private fun setupViewPager(binding: ActivityMainBinding){
        val adapter = ViewPagerAdapter(SwipingImages.introSlides)
        viewPager2 = binding.viewPager
        viewPager2?.adapter = adapter
        viewPager2?.registerOnPageChangeCallback(pager2Callback)
        binding.dotsIndicator.setViewPager2(viewPager2!!)
    }

    override fun onDestroy() {
        super.onDestroy()
        viewPager2?.unregisterOnPageChangeCallback(pager2Callback)
    }

}