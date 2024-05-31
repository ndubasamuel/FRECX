package com.example.frecx.ui.View.regscreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.frecx.R
import com.example.frecx.databinding.FragmentRecoverPassEmailBinding


class RecoverPassEmailFragment : Fragment() {

private lateinit var binding: FragmentRecoverPassEmailBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRecoverPassEmailBinding.inflate(inflater, container, false)

        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            userPhoneNumberInstead.setOnClickListener {
                findNavController().navigate(R.id.action_recoverPassEmailFragment_to_recoverPassPhoneFragment)
            }
            toolBar.setOnClickListener {
                findNavController().navigate(R.id.action_recoverPassEmailFragment_to_recoverPassPhoneFragment)
            }
        }
    }
}

