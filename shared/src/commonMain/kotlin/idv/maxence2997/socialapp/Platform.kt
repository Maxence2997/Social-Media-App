package idv.maxence2997.socialapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform