package com.example.frecx.ui.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.frecx.R
import com.example.frecx.databinding.ActivityMainBinding
import com.example.frecx.databinding.FragmentIndicatorViewPagerBinding


class IndicatorViewPagerFragment : Fragment() {

    private lateinit var binding: FragmentIndicatorViewPagerBinding
    private var viewPager: ViewPager2? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIndicatorViewPagerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.getStarted.setOnClickListener {
            findNavController().navigate(R.id.action_indicatorViewPagerFragment_to_loginFragment)
        }
        setupViewPager()
    }

    private val pager2Callback = object: ViewPager2.OnPageChangeCallback(){
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
            if(position== SwipingImages.introSlides.size -1)
                return
        }
    }
    private fun setupViewPager(){
        val adapter = ViewPagerAdapter(SwipingImages.introSlides)
        viewPager = binding.viewPager
        viewPager?.adapter = adapter
        viewPager?.registerOnPageChangeCallback(pager2Callback)
        binding.dotsIndicator.setViewPager2(viewPager!!)
    }

    override fun onDestroy() {
        super.onDestroy()
        viewPager?.unregisterOnPageChangeCallback(pager2Callback)
    }

}