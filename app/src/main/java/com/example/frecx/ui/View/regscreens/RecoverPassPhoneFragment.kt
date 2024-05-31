package com.example.frecx.ui.View.regscreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.frecx.R
import com.example.frecx.databinding.FragmentRecoverPassPhoneBinding


class RecoverPassPhoneFragment : Fragment() {
    private lateinit var binding: FragmentRecoverPassPhoneBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRecoverPassPhoneBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

      binding?.apply {
          userEmailInstead.setOnClickListener {
              findNavController().navigate(R.id.action_recoverPassPhoneFragment_to_recoverPassEmailFragment)
          }
          toolBar.setOnClickListener {
              findNavController().navigate(R.id.action_recoverPassPhoneFragment_to_loginFragment)
          }
      }
      }
}