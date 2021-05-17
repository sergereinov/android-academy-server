package com.academy.android.server.model

import kotlinx.serialization.Serializable

@Serializable
data class Video(
    val id: Long = 0,
    val name: String = "",
    val date: String = "",
    val picture: String = "",
    val city: String = "",
    val level: String = "",
    val year: String = ""
)
