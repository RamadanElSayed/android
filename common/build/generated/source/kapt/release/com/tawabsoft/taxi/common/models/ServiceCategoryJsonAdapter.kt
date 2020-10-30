// Code generated by moshi-kotlin-codegen. Do not edit.
package com.tawabsoft.taxi.common.models

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION")
class ServiceCategoryJsonAdapter(
  moshi: Moshi
) : JsonAdapter<ServiceCategory>() {
  private val options: JsonReader.Options = JsonReader.Options.of("id", "services", "title")

  private val intAdapter: JsonAdapter<Int> = moshi.adapter(Int::class.java, emptySet(), "id")

  private val nullableListOfServiceAdapter: JsonAdapter<List<Service>?> =
      moshi.adapter(Types.newParameterizedType(List::class.java, Service::class.java), emptySet(),
      "services")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "title")

  override fun toString(): String = buildString(37) {
      append("GeneratedJsonAdapter(").append("ServiceCategory").append(')') }

  override fun fromJson(reader: JsonReader): ServiceCategory {
    var id: Int? = null
    var services: List<Service>? = null
    var servicesSet: Boolean = false
    var title: String? = null
    var titleSet: Boolean = false
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> id = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("id", "id", reader)
        1 -> {
          services = nullableListOfServiceAdapter.fromJson(reader)
          servicesSet = true
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
    val result = ServiceCategory(
    )
    result.id = id ?: result.id
    result.services = if (servicesSet) services else result.services
    result.title = if (titleSet) title else result.title
    return result
  }

  override fun toJson(writer: JsonWriter, value: ServiceCategory?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("id")
    intAdapter.toJson(writer, value.id)
    writer.name("services")
    nullableListOfServiceAdapter.toJson(writer, value.services)
    writer.name("title")
    nullableStringAdapter.toJson(writer, value.title)
    writer.endObject()
  }
}
