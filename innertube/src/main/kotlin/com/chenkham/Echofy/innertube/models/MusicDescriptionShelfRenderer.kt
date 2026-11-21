/*
 * Echofy Project (2026)
 * Echofy Project
 * Licensed Under GPL-3.0 | see git history for contributors
 */

package com.chenkham.Echofy.innertube.models

import kotlinx.serialization.Serializable

@Serializable
data class MusicDescriptionShelfRenderer(
    val header: Runs?,
    val subheader: Runs?,
    val description: Runs,
    val footer: Runs?,
)
