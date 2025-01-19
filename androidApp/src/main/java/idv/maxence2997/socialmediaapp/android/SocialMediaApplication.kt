package idv.maxence2997.socialmediaapp.android

import android.app.Application
import idv.maxence2997.socialmediaapp.android.di.appModule
import org.koin.core.context.startKoin

class SocialMediaApplication : Application() {
  override fun onCreate() {
    super.onCreate()
    startKoin {
      modules(appModule)
    }
  }
}
