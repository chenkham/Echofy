package com.Chenkham.Echofy.models

import com.Chenkham.Echofy.db.entities.LocalItem
import com.chenkham.Echofy.innertube.models.YTItem

data class SimilarRecommendation(
    val title: LocalItem,
    val items: List<YTItem>,
)
