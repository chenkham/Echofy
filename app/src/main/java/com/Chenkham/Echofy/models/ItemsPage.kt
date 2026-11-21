package com.Chenkham.Echofy.models

import com.chenkham.Echofy.innertube.models.YTItem

data class ItemsPage(
    val items: List<YTItem>,
    val continuation: String?,
)
