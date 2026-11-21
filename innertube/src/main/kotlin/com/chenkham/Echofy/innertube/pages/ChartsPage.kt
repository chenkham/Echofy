/*
 * Echofy Project (2026)
 * Echofy Project
 * Licensed Under GPL-3.0 | see git history for contributors
 */

package com.chenkham.Echofy.innertube.pages

import com.chenkham.Echofy.innertube.models.*

data class ChartsPage(
    val sections: List<ChartSection>,
    val continuation: String?,
) {
    data class ChartSection(
        val title: String,
        val items: List<YTItem>,
        val chartType: ChartType,
    )

    enum class ChartType {
        TRENDING,
        TOP,
        GENRE,
        NEW_RELEASES,
    }
}
