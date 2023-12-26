package com.ke.music.api.response

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SimiArtistResponse(
    val artists: List<Artist>,
)
