package com.example.frecx.ui.View.regscreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.frecx.R
import com.example.frecx.databinding.FragmentChangePasswordBinding
import kotlinx.coroutines.NonDisposableHandle.parent


class ChangePasswordFragment : Fragment() {
    private lateinit var binding: FragmentChangePasswordBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = FragmentChangePasswordBinding.inflate(inflater, container,false)
        return binding.root

    }
}