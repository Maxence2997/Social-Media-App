package idv.maxence2997.socialmediaapp.android.di

import idv.maxence2997.socialmediaapp.android.auth.login.LogInViewModel
import idv.maxence2997.socialmediaapp.android.auth.signup.SignUpViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule =
  module {
    viewModel { LogInViewModel() }
    viewModel { SignUpViewModel() }
  }
