package com.jetbrains.multiplatformlibrary

import kotlin.js.JsExport

// Actual implementation for JS
@JsExport
actual fun getPlatform(): Platform {
    return object : Platform {
        override val name: String = "Node.js"
    }
}


