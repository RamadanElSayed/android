// Code generated by moshi-kotlin-codegen. Do not edit.
package com.tawabsoft.taxi.common.models

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.emptySet
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION")
class CarJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Car>() {
  private val options: JsonReader.Options = JsonReader.Options.of("id", "media", "title")

  private val intAdapter: JsonAdapter<Int> = moshi.adapter(Int::class.java, emptySet(), "id")

  private val nullableMediaAdapter: JsonAdapter<Media?> = moshi.adapter(Media::class.java,
      emptySet(), "media")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "title")

  override fun toString(): String = buildString(25) {
      append("GeneratedJsonAdapter(").append("Car").append(')') }

  override fun fromJson(reader: JsonReader): Car {
    var id: Int? = null
    var media: Media? = null
    var mediaSet: Boolean = false
    var title: String? = null
    var titleSet: Boolean = false
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> id = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("id", "id", reader)
        1 -> {
          media = nullableMediaAdapter.fromJson(reader)
          mediaSet = true
        }
        2 -> {
          title = nullableStringAdapter.fromJson(reader)
          titleSet = true
        }
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    val result = Car(
    )
    result.id = id ?: result.id
    result.media = if (mediaSet) media else result.media
    result.title = if (titleSet) title else result.title
    return result
  }

  override fun toJson(writer: JsonWriter, value: Car?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("id")
    intAdapter.toJson(writer, value.id)
    writer.name("media")
    nullableMediaAdapter.toJson(writer, value.media)
    writer.name("title")
    nullableStringAdapter.toJson(writer, value.title)
    writer.endObject()
  }
}
