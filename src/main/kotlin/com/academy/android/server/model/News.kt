package com.academy.android.server.model

import com.academy.android.server.util.DateAsLongSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class News(
    val id: Long = 0,
    val text: String = "",
    val link: String = "",
    val picture: String = "",
    @Serializable(with = DateAsLongSerializer::class) val date: Date = Date(),
    @SerialName("chat_id") val chatId: Long = id,
)
