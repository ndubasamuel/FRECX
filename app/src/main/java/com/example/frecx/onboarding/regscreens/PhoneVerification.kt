package com.example.frecx.onboarding.regscreens

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment

import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.frecx.R
import com.example.frecx.databinding.FragmentPhoneVerificationBinding
import kotlinx.android.synthetic.main.fragment_create_account.*


class PhoneVerification : Fragment() {

private lateinit var binding : FragmentPhoneVerificationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_phone_verification,
            container,
            false
        )

        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply{
            phoneNumber.setOnClickListener {
                findNavController().navigate(R.id.action_phoneVerification_to_emailVerificationFragment)
            }

        }
    }

}