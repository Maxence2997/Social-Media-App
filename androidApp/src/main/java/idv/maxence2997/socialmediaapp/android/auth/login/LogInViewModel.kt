package idv.maxence2997.socialmediaapp.android.auth.login

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LogInViewModel : ViewModel() {
  var uiState by mutableStateOf(LogInState())
    private set

  fun updateEmail(email: String) {
    uiState = uiState.copy(email = email)
  }

  fun updatePassword(password: String) {
    uiState = uiState.copy(password = password)
  }
}

data class LogInState(
  val email: String = "",
  val password: String = "",
)