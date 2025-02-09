package com.jetbrains.multiplatformlibrary

import kotlin.random.Random
import kotlin.js.JsExport

@JsExport // Ensures it's accessible from JavaScript
class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        val firstWord = if (Random.nextBoolean()) "Hi!" else "Hello!"

        return "$firstWord Guess what this is! > ${platform.name.reversed()}!"
    }
}