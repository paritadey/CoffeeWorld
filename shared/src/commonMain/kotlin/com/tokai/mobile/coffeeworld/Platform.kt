package com.tokai.mobile.coffeeworld

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform