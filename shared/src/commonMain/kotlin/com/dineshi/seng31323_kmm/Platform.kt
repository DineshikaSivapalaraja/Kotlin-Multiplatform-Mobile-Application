package com.dineshi.seng31323_kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform