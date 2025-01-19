package idv.maxence2997.socialmediaapp.android.common.theming

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun SocialMediaAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = if (darkTheme) DarkColors else LightColors
    MaterialTheme(
        colorScheme = colors, // 替換 colors 為 colorScheme
        typography = Typography,
        shapes = Shapes,
        content = content,
    )
}
