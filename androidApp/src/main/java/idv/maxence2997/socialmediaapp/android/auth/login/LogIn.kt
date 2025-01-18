package idv.maxence2997.socialmediaapp.android.auth.login

import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import org.koin.androidx.compose.koinViewModel

@Destination<RootGraph>
@Composable
fun LogIn(
  navigator: DestinationsNavigator,
) {

  val viewModel: LogInViewModel = koinViewModel()
  LogInScreen(
    uiState = viewModel.uiState,
    onEmailChange = viewModel::updateEmail,
    onPasswordChange = viewModel::updatePassword,
  )
}