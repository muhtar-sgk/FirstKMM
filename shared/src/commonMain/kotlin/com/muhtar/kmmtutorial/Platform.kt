package com.muhtar.kmmtutorial

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform