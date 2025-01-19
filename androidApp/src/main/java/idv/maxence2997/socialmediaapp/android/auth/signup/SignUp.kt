package idv.maxence2997.socialmediaapp.android.auth.signup

import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootGraph
import com.ramcosta.composedestinations.generated.destinations.LogInDestination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import org.koin.androidx.compose.koinViewModel

@Destination<RootGraph>(start = true)
@Composable
fun SignUpState(
  navigator: DestinationsNavigator,
) {
  val viewModel: SignUpViewModel = koinViewModel()
  SignUpScreen(
    uiState = viewModel.uiState,
    onUserNameChange = viewModel::updateUsername,
    onEmailChange = viewModel::updateEmail,
    onPasswordChange = viewModel::updatePassword,
    onNavigateToLogin = {
      navigator.navigate(LogInDestination)
    }
  )
}