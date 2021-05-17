package com.academy.android.server.util

import kotlinx.serialization.descriptors.*
import kotlinx.serialization.*
import kotlinx.serialization.encoding.*
import java.util.*

object DateAsLongSerializer : KSerializer<Date> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("Date", PrimitiveKind.LONG)
    override fun serialize(encoder: Encoder, value: Date) = encoder.encodeLong(value.time)
    override fun deserialize(decoder: Decoder): Date = Date(decoder.decodeLong())
}
