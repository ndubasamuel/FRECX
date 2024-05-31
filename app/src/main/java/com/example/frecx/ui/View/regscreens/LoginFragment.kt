package com.example.frecx.ui.View.regscreens


import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.frecx.R
import com.example.frecx.ViewModel.AuthViewModel
import com.example.frecx.auth.network.MyApi
import com.example.frecx.auth.network.Resource
import com.example.frecx.databinding.FragmentLoginBinding
import com.example.frecx.repository.UserRepository
import com.example.frecx.ui.Base.BaseFragment
import com.example.frecx.utis.AuthListener
import com.example.frecx.utis.MainUiState


class LoginFragment : BaseFragment<AuthViewModel, FragmentLoginBinding, UserRepository>() , AuthListener {


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding?.apply {
            createAccount.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_createAccountFragment)
            }
            buttonLogin.setOnClickListener {
                userAuthentication()
            }
            forgotPassword.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_recoverPassPhoneFragment)
            }

        }

        viewModel.loginResponse.observe(viewLifecycleOwner, Observer {
            when (it) {
                is Resource.Success -> {
                    Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_SHORT).show()
                }

                is Resource.Failure -> {
                    Toast.makeText(requireContext(), "Login Failure", Toast.LENGTH_SHORT).show()
                }
            }
        })

    }
    override fun getViewModel() =  AuthViewModel::class.java

    override fun getFragmentBinding(inflater: LayoutInflater,
                                    container: ViewGroup?) = FragmentLoginBinding.inflate(inflater, container, false)

    override fun getFragmentRepository() = UserRepository(remoteDataSource.buildApi(MyApi::class.java))




    private fun userAuthentication() {
//        val userNameEditText = binding.etUsername
//        val passwordEditText = binding.etPassword

//        val email = userNameEditText.toString().trim()
//        val password = passwordEditText.toString().trim()
        val email = binding.etUsername.text?.trim().toString()
        val password = binding.etPassword.text?.trim().toString()
        viewModel.login(email, password)

//        if (email.isEmpty()) {
//            userNameEditText.error = "Required"
//            MainUiState.Error("Enter your User Name")
//        }
//        if (password.isEmpty() ||
//            !password.matches(Regex("^(?=.*\\d)(?=.*[a-zA-Z])(?=.*[A-Z])(?=.*[-\\#\\\$\\.\\%\\&\\*])(?=.*[a-zA-Z]).{8,16}\$"))) {
//            passwordEditText.error = "Required"
//            MainUiState.Error("Enter a Valid Password")
//
//        }


    }

    override fun onStarted() {
        TODO("Not yet implemented")
    }

    override fun onSuccess() {
        TODO("Not yet implemented")
    }

    override fun onFailure(message: String) {
        TODO("Not yet implemented")
    }
}

