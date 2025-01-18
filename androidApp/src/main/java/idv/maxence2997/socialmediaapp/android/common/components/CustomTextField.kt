package idv.maxence2997.socialmediaapp.android.common.components

import androidx.annotation.StringRes
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import idv.maxence2997.socialmediaapp.android.R
import idv.maxence2997.socialmediaapp.android.common.theming.Gray
import idv.maxence2997.socialmediaapp.android.common.theming.SocialAppTheme

@Composable
fun CustomTextField(
  modifier: Modifier = Modifier,
  value: String,
  onValueChange: (String) -> Unit,
  keyboardType: KeyboardType = KeyboardType.Text,
  isPasswordTextField: Boolean = false,
  isSingleLine: Boolean = true,
  @StringRes hint: Int,
) {

  var isPasswordVisible by remember { mutableStateOf(false) }

  TextField(
    value = value,
    onValueChange = onValueChange,
    modifier = modifier,
    textStyle = MaterialTheme.typography.bodyMedium,
    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = keyboardType),
    singleLine = isSingleLine,
    colors = TextFieldDefaults.colors(
      // 背景顏色（TextField 聚焦狀態）
      focusedContainerColor = if (isSystemInDarkTheme()) {
        MaterialTheme.colorScheme.surface
      } else {
        Gray
      },
      // 背景顏色（TextField 未聚焦狀態）
      unfocusedContainerColor = if (isSystemInDarkTheme()) {
        MaterialTheme.colorScheme.surface
      } else {
        Gray
      },
      // 背景顏色（TextField 顯示錯誤時的狀態）
//      errorContainerColor = MaterialTheme.colorScheme.errorContainer,
      // 指示器顏色（TextField 未聚焦狀態）
      unfocusedIndicatorColor = Color.Transparent, // 聚焦時指示器顏色
      // 指示器顏色（TextField 聚焦狀態）
      focusedIndicatorColor = Color.Transparent,
      // 指示器顏色（TextField 禁用狀態）
//      disabledIndicatorColor = Color.Transparent,
      // 指示器顏色（TextField 顯示錯誤時的狀態）
//      errorIndicatorColor = MaterialTheme.colorScheme.error,
    ),
    trailingIcon = if (isPasswordTextField) {
      {
        PasswordEyeIcon(isPasswordVisible) {
          isPasswordVisible = !isPasswordVisible
        }
      }
    } else null,
    visualTransformation = if (isPasswordTextField) {
      if (isPasswordVisible) {
        VisualTransformation.None
      } else {
        PasswordVisualTransformation()
      }
    } else VisualTransformation.None,
    placeholder = {
      Text(text = stringResource(id = hint), style = MaterialTheme.typography.bodyMedium)
    },
    shape = MaterialTheme.shapes.medium,
  )
}

@Composable
fun PasswordEyeIcon(
  isPasswordVisible: Boolean, onPasswordVisibilityToggle: () -> Unit,
) {

  val image = if (isPasswordVisible) {
    // 顯示密碼
    painterResource(R.drawable.show_eye_icon_filled)
  } else {
    // 隱藏密碼
    painterResource(R.drawable.hide_eye_icon_filled)
  }
  IconButton(onClick = onPasswordVisibilityToggle) {
    Icon(
      painter = image,
      contentDescription = null,
    )
  }
}

@Preview
@Composable
fun CustomTextFieldPreview() {
  SocialAppTheme {
    CustomTextField(
      value = "",
      onValueChange = {},
      hint = androidx.compose.ui.R.string.default_error_message
    )
  }
}