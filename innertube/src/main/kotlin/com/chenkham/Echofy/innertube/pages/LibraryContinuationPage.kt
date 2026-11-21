/*
 * Echofy Project (2026)
 * Echofy Project
 * Licensed Under GPL-3.0 | see git history for contributors
 */

package com.chenkham.Echofy.innertube.pages

import com.chenkham.Echofy.innertube.models.YTItem

data class LibraryContinuationPage(
    val items: List<YTItem>,
    val continuation: String?,
)
