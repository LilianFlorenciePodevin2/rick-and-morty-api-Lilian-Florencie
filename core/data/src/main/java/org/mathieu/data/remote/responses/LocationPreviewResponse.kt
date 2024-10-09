package org.mathieu.data.remote.responses

import kotlinx.serialization.Serializable

@Serializable
data class LocationPreviewResponse(
    val id: Int,
    val name: String,
    val type: String,
    val dimension: String,
    val residents: List<String>? = null
)