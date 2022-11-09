package com.example.frecx.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.frecx.R
import com.example.frecx.databinding.FragmentIndicatorViewPagerBinding
import kotlinx.android.synthetic.main.fragment_login.view.*


class IndicatorViewPagerFragment : Fragment() {

    private lateinit var binding: FragmentIndicatorViewPagerBinding
    private lateinit var getStarted: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_indicator_view_pager)


        binding.getStarted.buttonLogin
        getStarted.setOnClickListener {
            findNavController().navigate(R.id.action_indicatorViewPagerFragment_to_loginFragment)
        }
        return binding.root
    }

}