/*
 * Echofy Project Original (2026)
 * Echofy Project
 * Licensed Under GPL-3.0 | see git history for contributors
 */

package com.Chenkham.Echofy.extensions

fun <T> tryOrNull(block: () -> T): T? =
    try {
        block()
    } catch (e: Exception) {
        null
    }
