/*
 * Echofy Project (2026)
 * Echofy Project
 * Licensed Under GPL-3.0 | see git history for contributors
 */

package com.chenkham.Echofy.innertube.models.response

import com.chenkham.Echofy.innertube.models.MusicShelfRenderer
import kotlinx.serialization.Serializable

@Serializable
data class ContinuationResponse(
    val onResponseReceivedActions: List<ResponseAction>?,
) {
    @Serializable
    data class ResponseAction(
        val appendContinuationItemsAction: ContinuationItems?,
    )

    @Serializable
    data class ContinuationItems(
        val continuationItems: List<MusicShelfRenderer.Content>?,
    )
}
