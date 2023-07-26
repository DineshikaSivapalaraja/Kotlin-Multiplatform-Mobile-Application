package com.dineshi.seng31323_kmm

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, Welcome to the, ${platform.name}!"
    }
}