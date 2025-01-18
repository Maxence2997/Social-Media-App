package idv.maxence2997.socialmediaapp.android.common.theming

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import idv.maxence2997.socialmediaapp.android.R

val Lexend = FontFamily(
  Font(R.font.lexend_medium, FontWeight.Medium),
  Font(R.font.lexend_semi_bold, FontWeight.SemiBold),
  Font(R.font.lexend_bold, FontWeight.Bold)
)
val OpenSans = FontFamily(
  Font(R.font.open_sans_light, FontWeight.Light),
  Font(R.font.open_sans_regular, FontWeight.Normal)
)

val Typography = Typography(
  headlineSmall = TextStyle( // 替代 h6
    fontFamily = Lexend,
    fontWeight = FontWeight.Bold,
    fontSize = 21.sp
  ),
  titleMedium = TextStyle( // 替代 subtitle1
    fontFamily = Lexend,
    fontWeight = FontWeight.SemiBold,
    fontSize = 18.sp
  ),
  titleSmall = TextStyle( // 替代 subtitle2
    fontFamily = Lexend,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp
  ),
  bodyLarge = TextStyle( // 替代 body1
    fontFamily = OpenSans,
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp
  ),
  bodyMedium = TextStyle( // 替代 body2
    fontFamily = OpenSans,
    fontWeight = FontWeight.Normal,
    fontSize = 14.sp
  ),
  labelLarge = TextStyle( // 替代 button
    fontFamily = Lexend,
    fontWeight = FontWeight.SemiBold,
    fontSize = 15.sp
  ),
  bodySmall = TextStyle( // 替代 caption
    fontFamily = OpenSans
  ),
  labelSmall = TextStyle( // 替代 overline
    fontFamily = OpenSans
  )
)








