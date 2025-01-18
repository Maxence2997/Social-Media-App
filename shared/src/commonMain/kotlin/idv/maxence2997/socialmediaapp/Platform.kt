package idv.maxence2997.socialmediaapp

interface Platform {
  val name: String
}

expect fun getPlatform(): Platform