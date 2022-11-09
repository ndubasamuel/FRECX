package com.example.frecx.onboarding.regscreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.example.frecx.R
import com.example.frecx.databinding.FragmentChangePasswordBinding
import com.example.frecx.databinding.FragmentRecoverPassEmailBinding
import kotlinx.android.synthetic.main.fragment_create_account.view.*


class ChangePasswordFragment : Fragment() {
    private lateinit var binding: FragmentChangePasswordBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = DataBindingUtil.inflate(
           inflater, R.layout.fragment_change_password,
           container, false)
        return binding.root

    }
}