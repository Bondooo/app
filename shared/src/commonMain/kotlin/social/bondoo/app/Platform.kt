package social.bondoo.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform