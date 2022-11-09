package com.example.frecx.onboarding.regscreens


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.frecx.R
import com.example.frecx.auth.AuthViewModel
import com.example.frecx.auth.AuthViewModelFactory
import com.example.frecx.databinding.FragmentLoginBinding


class LoginFragment : Fragment(R.layout.fragment_login) {

    private lateinit var binding: FragmentLoginBinding
    private val loginViewModel: AuthViewModel by activityViewModels {
        AuthViewModelFactory()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        val view = binding.root
        binding.viewmodel = loginViewModel
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding?.apply {
            createAccount.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_createAccountFragment)
            }
            buttonLogin.setOnClickListener {
                validate()
                loginViewModel.onLoginButtonClick()
            }
            forgotPassword.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_recoverPassPhoneFragment)
            }

        }
    }
    fun validate(){
        if (loginViewModel.userName.isNullOrEmpty()){
            binding.etUsername.error = "Email "
            return
        }
        if (loginViewModel.password.matches(".*[0-9].*".toRegex())){

        }
    }
}

