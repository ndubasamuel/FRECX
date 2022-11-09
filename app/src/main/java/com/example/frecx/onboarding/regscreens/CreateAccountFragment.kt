package com.example.frecx.onboarding.regscreens

import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.frecx.MainActivity
import com.example.frecx.R
import com.example.frecx.auth.AuthViewModel
import com.example.frecx.databinding.ActivityMainBinding
import com.example.frecx.databinding.FragmentCreateAccountBinding
import kotlinx.android.synthetic.main.fragment_create_account.*
import kotlinx.android.synthetic.main.fragment_create_account.view.*
import java.util.zip.Inflater


class CreateAccountFragment : Fragment(R.layout.fragment_create_account) {

    private lateinit var binding : FragmentCreateAccountBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_create_account,
            container, false)
        val view = binding.root
        val viewModel = ViewModelProvider(this) [AuthViewModel::class.java]
        binding.viewmodel = viewModel
        return view
    }






}