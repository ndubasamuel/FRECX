package com.example.frecx.ui.View.regscreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.frecx.R
import com.example.frecx.ViewModel.AuthViewModel
import com.example.frecx.databinding.FragmentCreateAccountBinding
import com.example.frecx.responses.User
import com.example.frecx.utis.MainUiState
import kotlinx.coroutines.flow.MutableStateFlow


class CreateAccountFragment : Fragment() {

    private lateinit var binding : FragmentCreateAccountBinding
    private lateinit var viewModel: AuthViewModel
    private val user: User? = null




    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCreateAccountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.apply {
            toolBar.setOnClickListener {
                findNavController().navigate(R.id.action_createAccountFragment_to_loginFragment)
            }
            signUpButton.setOnClickListener {
                handleSignUp()
            }
        }
    }

    private fun handleSignUp() {
        val fullNameEditText = binding.fullName
        val emailAddressEditText = binding.signupEmail
        val phoneNumberEditText = binding.phoneNumber
        val passwordEditText = binding.userPassword
        val confirmPasswordEditText = binding.confirmPasswordLayout


        val fullName = fullNameEditText.text.toString().trim()
        val emailAddress = emailAddressEditText.text.toString().trim()
        val phoneNumber = phoneNumberEditText.text.toString().trim()
        val password = passwordEditText.text.toString().trim()
        val confirmPassword = confirmPasswordEditText.toString().trim()

        if (fullName.isEmpty()) {
            fullNameEditText.error =("Full Name Required")
            MainUiState.Error("Required")
        }
        if (emailAddress.isEmpty() || !emailAddress.matches(Regex("^[a-zA-Z0-9_.±]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$"))) {
            MainUiState.Error("Enter a valid Email Address")
            emailAddressEditText.error = "Invalid"
        }
        if (phoneNumber.isEmpty() || !phoneNumber.matches(Regex("^(254|0)([7][0-9]|[1][0-1]){1}[0-9]{1}[0-9]{6}\$"))) {
            MainUiState.Error("Enter a valid Phone number")
            phoneNumberEditText.error = "Invalid"
        }
        if (password.isEmpty() || !password.matches(Regex("^(?=.*\\d)(?=.*[a-zA-Z])(?=.*[A-Z])(?=.*[-\\#\\\$\\.\\%\\&\\*])(?=.*[a-zA-Z]).{8,16}\$"))) {
            MainUiState.Error("Enter a Strong Password")
            passwordEditText.error = "Weak"
        }
        if  (confirmPassword.isEmpty() || !confirmPassword.matches(Regex("^(?=.*\\d)(?=.*[a-zA-Z])(?=.*[A-Z])(?=.*[-\\#\\\$\\.\\%\\&\\*])(?=.*[a-zA-Z]).{8,16}\$"))  ){
            MainUiState.Error("Confirmation Failed")
            confirmPasswordEditText.error = "Does Not Match"
        }
        if (password.length != confirmPassword.length) {
            MainUiState.Error("Password Conformation Failed")
            confirmPasswordEditText.error = "Password has to Match"
        }

    }






}