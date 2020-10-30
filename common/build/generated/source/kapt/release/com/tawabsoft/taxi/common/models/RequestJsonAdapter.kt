// Code generated by moshi-kotlin-codegen. Do not edit.
package com.tawabsoft.taxi.common.models

import com.google.android.gms.maps.model.LatLng
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import java.lang.reflect.Constructor
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.jvm.Volatile
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION")
class RequestJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Request>() {
  private val options: JsonReader.Options = JsonReader.Options.of("driver", "rider", "cost",
      "startTimestamp", "log", "distanceBest", "rating", "isHidden", "addresses", "points",
      "finishTimestamp", "requestTimestamp", "etaPickup", "durationBest", "costBest",
      "costAfterCoupon", "currency", "durationReal", "distanceReal", "id", "status", "imageUrl",
      "service", "confirmationCode")

  private val nullableDriverAdapter: JsonAdapter<Driver?> = moshi.adapter(Driver::class.java,
      emptySet(), "driver")

  private val nullableRiderAdapter: JsonAdapter<Rider?> = moshi.adapter(Rider::class.java,
      emptySet(), "rider")

  private val nullableDoubleAdapter: JsonAdapter<Double?> =
      moshi.adapter(Double::class.javaObjectType, emptySet(), "cost")

  private val nullableLongAdapter: JsonAdapter<Long?> = moshi.adapter(Long::class.javaObjectType,
      emptySet(), "startTimestamp")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "log")

  private val nullableIntAdapter: JsonAdapter<Int?> = moshi.adapter(Int::class.javaObjectType,
      emptySet(), "distanceBest")

  private val listOfStringAdapter: JsonAdapter<List<String>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, String::class.java), emptySet(),
      "addresses")

  private val listOfLatLngAdapter: JsonAdapter<List<LatLng>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, LatLng::class.java), emptySet(),
      "points")

  private val nullableStatusAdapter: JsonAdapter<Request.Status?> =
      moshi.adapter(Request.Status::class.java, emptySet(), "status")

  private val nullableServiceAdapter: JsonAdapter<Service?> = moshi.adapter(Service::class.java,
      emptySet(), "service")

  @Volatile
  private var constructorRef: Constructor<Request>? = null

  override fun toString(): String = buildString(29) {
      append("GeneratedJsonAdapter(").append("Request").append(')') }

  override fun fromJson(reader: JsonReader): Request {
    var driver: Driver? = null
    var rider: Rider? = null
    var cost: Double? = null
    var startTimestamp: Long? = null
    var log: String? = null
    var distanceBest: Int? = null
    var rating: Int? = null
    var isHidden: Int? = null
    var addresses: List<String>? = null
    var points: List<LatLng>? = null
    var finishTimestamp: Long? = null
    var requestTimestamp: Long? = null
    var etaPickup: Long? = null
    var durationBest: Int? = null
    var costBest: Double? = null
    var costAfterCoupon: Double? = null
    var currency: String? = null
    var durationReal: Long? = null
    var distanceReal: Long? = null
    var id: Long? = null
    var status: Request.Status? = null
    var imageUrl: String? = null
    var service: Service? = null
    var confirmationCode: Int? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          driver = nullableDriverAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        1 -> {
          rider = nullableRiderAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
        }
        2 -> {
          cost = nullableDoubleAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 2).inv()
          mask0 = mask0 and 0xfffffffb.toInt()
        }
        3 -> {
          startTimestamp = nullableLongAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 3).inv()
          mask0 = mask0 and 0xfffffff7.toInt()
        }
        4 -> {
          log = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 4).inv()
          mask0 = mask0 and 0xffffffef.toInt()
        }
        5 -> {
          distanceBest = nullableIntAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 5).inv()
          mask0 = mask0 and 0xffffffdf.toInt()
        }
        6 -> {
          rating = nullableIntAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 6).inv()
          mask0 = mask0 and 0xffffffbf.toInt()
        }
        7 -> {
          isHidden = nullableIntAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 7).inv()
          mask0 = mask0 and 0xffffff7f.toInt()
        }
        8 -> {
          addresses = listOfStringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("addresses",
              "addresses", reader)
          // $mask = $mask and (1 shl 8).inv()
          mask0 = mask0 and 0xfffffeff.toInt()
        }
        9 -> {
          points = listOfLatLngAdapter.fromJson(reader) ?: throw Util.unexpectedNull("points",
              "points", reader)
          // $mask = $mask and (1 shl 9).inv()
          mask0 = mask0 and 0xfffffdff.toInt()
        }
        10 -> {
          finishTimestamp = nullableLongAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 10).inv()
          mask0 = mask0 and 0xfffffbff.toInt()
        }
        11 -> {
          requestTimestamp = nullableLongAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 11).inv()
          mask0 = mask0 and 0xfffff7ff.toInt()
        }
        12 -> {
          etaPickup = nullableLongAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 12).inv()
          mask0 = mask0 and 0xffffefff.toInt()
        }
        13 -> {
          durationBest = nullableIntAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 13).inv()
          mask0 = mask0 and 0xffffdfff.toInt()
        }
        14 -> {
          costBest = nullableDoubleAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 14).inv()
          mask0 = mask0 and 0xffffbfff.toInt()
        }
        15 -> {
          costAfterCoupon = nullableDoubleAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 15).inv()
          mask0 = mask0 and 0xffff7fff.toInt()
        }
        16 -> {
          currency = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 16).inv()
          mask0 = mask0 and 0xfffeffff.toInt()
        }
        17 -> {
          durationReal = nullableLongAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 17).inv()
          mask0 = mask0 and 0xfffdffff.toInt()
        }
        18 -> {
          distanceReal = nullableLongAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 18).inv()
          mask0 = mask0 and 0xfffbffff.toInt()
        }
        19 -> {
          id = nullableLongAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 19).inv()
          mask0 = mask0 and 0xfff7ffff.toInt()
        }
        20 -> {
          status = nullableStatusAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 20).inv()
          mask0 = mask0 and 0xffefffff.toInt()
        }
        21 -> {
          imageUrl = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 21).inv()
          mask0 = mask0 and 0xffdfffff.toInt()
        }
        22 -> {
          service = nullableServiceAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 22).inv()
          mask0 = mask0 and 0xffbfffff.toInt()
        }
        23 -> {
          confirmationCode = nullableIntAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 23).inv()
          mask0 = mask0 and 0xff7fffff.toInt()
        }
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    @Suppress("UNCHECKED_CAST")
    val localConstructor: Constructor<Request> = this.constructorRef ?:
        Request::class.java.getDeclaredConstructor(Driver::class.java, Rider::class.java,
        Double::class.javaObjectType, Long::class.javaObjectType, String::class.java,
        Int::class.javaObjectType, Int::class.javaObjectType, Int::class.javaObjectType,
        List::class.java, List::class.java, Long::class.javaObjectType, Long::class.javaObjectType,
        Long::class.javaObjectType, Int::class.javaObjectType, Double::class.javaObjectType,
        Double::class.javaObjectType, String::class.java, Long::class.javaObjectType,
        Long::class.javaObjectType, Long::class.javaObjectType, Request.Status::class.java,
        String::class.java, Service::class.java, Int::class.javaObjectType,
        Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef =
        it }
    return localConstructor.newInstance(
        driver,
        rider,
        cost,
        startTimestamp,
        log,
        distanceBest,
        rating,
        isHidden,
        addresses,
        points,
        finishTimestamp,
        requestTimestamp,
        etaPickup,
        durationBest,
        costBest,
        costAfterCoupon,
        currency,
        durationReal,
        distanceReal,
        id,
        status,
        imageUrl,
        service,
        confirmationCode,
        mask0,
        null
    )
  }

  override fun toJson(writer: JsonWriter, value: Request?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("driver")
    nullableDriverAdapter.toJson(writer, value.driver)
    writer.name("rider")
    nullableRiderAdapter.toJson(writer, value.rider)
    writer.name("cost")
    nullableDoubleAdapter.toJson(writer, value.cost)
    writer.name("startTimestamp")
    nullableLongAdapter.toJson(writer, value.startTimestamp)
    writer.name("log")
    nullableStringAdapter.toJson(writer, value.log)
    writer.name("distanceBest")
    nullableIntAdapter.toJson(writer, value.distanceBest)
    writer.name("rating")
    nullableIntAdapter.toJson(writer, value.rating)
    writer.name("isHidden")
    nullableIntAdapter.toJson(writer, value.isHidden)
    writer.name("addresses")
    listOfStringAdapter.toJson(writer, value.addresses)
    writer.name("points")
    listOfLatLngAdapter.toJson(writer, value.points)
    writer.name("finishTimestamp")
    nullableLongAdapter.toJson(writer, value.finishTimestamp)
    writer.name("requestTimestamp")
    nullableLongAdapter.toJson(writer, value.requestTimestamp)
    writer.name("etaPickup")
    nullableLongAdapter.toJson(writer, value.etaPickup)
    writer.name("durationBest")
    nullableIntAdapter.toJson(writer, value.durationBest)
    writer.name("costBest")
    nullableDoubleAdapter.toJson(writer, value.costBest)
    writer.name("costAfterCoupon")
    nullableDoubleAdapter.toJson(writer, value.costAfterCoupon)
    writer.name("currency")
    nullableStringAdapter.toJson(writer, value.currency)
    writer.name("durationReal")
    nullableLongAdapter.toJson(writer, value.durationReal)
    writer.name("distanceReal")
    nullableLongAdapter.toJson(writer, value.distanceReal)
    writer.name("id")
    nullableLongAdapter.toJson(writer, value.id)
    writer.name("status")
    nullableStatusAdapter.toJson(writer, value.status)
    writer.name("imageUrl")
    nullableStringAdapter.toJson(writer, value.imageUrl)
    writer.name("service")
    nullableServiceAdapter.toJson(writer, value.service)
    writer.name("confirmationCode")
    nullableIntAdapter.toJson(writer, value.confirmationCode)
    writer.endObject()
  }
}
