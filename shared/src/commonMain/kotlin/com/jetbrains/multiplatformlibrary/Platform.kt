package com.jetbrains.multiplatformlibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform