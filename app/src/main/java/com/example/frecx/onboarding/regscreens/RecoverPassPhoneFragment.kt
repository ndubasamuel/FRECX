package com.example.frecx.onboarding.regscreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.frecx.R
import com.example.frecx.databinding.FragmentRecoverPassPhoneBinding
import kotlinx.android.synthetic.main.fragment_recover_pass_phone.*
import kotlinx.android.synthetic.main.fragment_recover_pass_phone.view.*
import java.util.zip.Inflater


class RecoverPassPhoneFragment : Fragment() {

    private lateinit var binding: FragmentRecoverPassPhoneBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_recover_pass_phone,
            container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

      binding?.apply {
          usePhoneNumber.setOnClickListener {
              findNavController().navigate(R.id.action_recoverPassPhoneFragment_to_recoverPassEmailFragment)
          }
      }
      }
}