package idv.maxence2997.socialapp.android.auth.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import idv.maxence2997.socialapp.android.R
import idv.maxence2997.socialapp.android.common.components.CustomTextField
import idv.maxence2997.socialapp.android.common.theming.ButtonHeight
import idv.maxence2997.socialapp.android.common.theming.ExtraLargeSpacing
import idv.maxence2997.socialapp.android.common.theming.LargeSpacing
import idv.maxence2997.socialapp.android.common.theming.MediumSpacing
import idv.maxence2997.socialapp.android.common.theming.SocialAppTheme

@Composable
fun SignUpScreen(
  modifier: Modifier = Modifier,
  uiState: SignUpState,
  onUserNameChange: (String) -> Unit,
  onEmailChange: (String) -> Unit,
  onPasswordChange: (String) -> Unit,
) {
  Column(
    modifier = modifier
      .fillMaxSize()
      .verticalScroll(rememberScrollState())
      .background(
        color = if (isSystemInDarkTheme()) {
          MaterialTheme.colorScheme.background
        } else {
          MaterialTheme.colorScheme.surface
        }
      )
      .padding(
        top = ExtraLargeSpacing + LargeSpacing,
        start = LargeSpacing + MediumSpacing,
        end = LargeSpacing + MediumSpacing,
        bottom = LargeSpacing
      ),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.spacedBy(LargeSpacing)
  ) {
    CustomTextField(
      modifier = Modifier.fillMaxSize(),
      value = uiState.username,
      onValueChange = onUserNameChange,
      hint = R.string.username_hint
    )

    CustomTextField(
      modifier = Modifier.fillMaxSize(),
      value = uiState.email,
      onValueChange = onEmailChange,
      hint = R.string.email_hint,
      keyboardType = KeyboardType.Email
    )

    CustomTextField(
      modifier = Modifier.fillMaxSize(),
      value = uiState.password,
      onValueChange = onPasswordChange,
      hint = R.string.password_hint,
      keyboardType = KeyboardType.Password,
      isPasswordTextField = true
    )

    Button(
      onClick = {},
      modifier = modifier
        .fillMaxSize()
        .height(ButtonHeight),
      elevation = ButtonDefaults.elevatedButtonElevation(
        defaultElevation = 0.dp
      ),
      shape = MaterialTheme.shapes.medium,
    ) {
      Text(text = stringResource(id = R.string.sign_up_button_hint))
    }
  }
}

@Preview
@Composable
private fun SignUpScreenPreview() {
  SocialAppTheme {
    SignUpScreen(
      uiState = SignUpState(),
      onUserNameChange = {},
      onPasswordChange = {},
      onEmailChange = {})
  }
}