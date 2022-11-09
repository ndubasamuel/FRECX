package com.example.frecx.onboarding.regscreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.frecx.R
import com.example.frecx.databinding.FragmentEmailVerificationBinding
import kotlinx.android.synthetic.main.fragment_create_account.*
import kotlinx.android.synthetic.main.fragment_email_verification.view.*


class EmailVerificationFragment : Fragment() {

    private lateinit var binding: FragmentEmailVerificationBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_email_verification,
            container,
            false
        )
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply{
            phoneNumber.setOnClickListener {
                findNavController().navigate(R.id.action_emailVerificationFragment_to_phoneVerification)
            }

        }
    }
}