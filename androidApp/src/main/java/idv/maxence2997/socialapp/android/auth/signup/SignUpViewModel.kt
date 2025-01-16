package idv.maxence2997.socialapp.android.auth.signup

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class SignUpViewModel : ViewModel() {
  var uiState by mutableStateOf(SignUpState())
    private set

  fun updateUserName(userName: String) {
    uiState = uiState.copy(userName = userName)
  }

  fun updateEmail(email: String) {
    uiState = uiState.copy(email = email)
  }

  fun updatePassword(password: String) {
    uiState = uiState.copy(password = password)
  }
}

data class SignUpState(
  val userName: String = "",
  val email: String = "",
  val password: String = "",
)