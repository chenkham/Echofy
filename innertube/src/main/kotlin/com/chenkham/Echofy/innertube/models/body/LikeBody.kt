/*
 * Echofy Project (2026)
 * Echofy Project
 * Licensed Under GPL-3.0 | see git history for contributors
 */

package com.chenkham.Echofy.innertube.models.body

import com.chenkham.Echofy.innertube.models.Context
import kotlinx.serialization.Serializable

@Serializable
data class LikeBody(
    val context: Context,
    val target: Target,
) {
    @Serializable
    sealed class Target {
        @Serializable
        data class VideoTarget(val videoId: String) : Target()

        @Serializable
        data class PlaylistTarget(val playlistId: String) : Target()
    }
}
