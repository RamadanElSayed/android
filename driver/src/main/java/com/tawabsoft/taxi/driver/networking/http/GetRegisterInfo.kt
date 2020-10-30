package com.tawabsoft.taxi.driver.networking.http

import com.tawabsoft.taxi.common.models.Driver
import com.tawabsoft.taxi.common.models.Service
import com.tawabsoft.taxi.common.networking.http.interfaces.HTTPRequest
import com.squareup.moshi.JsonClass

class GetRegisterInfo(jwtToken: String): HTTPRequest() {
    override val path: String = "driver/get"
    init {
        this.params = mapOf("token" to jwtToken)
    }
}
@JsonClass(generateAdapter = true)
data class RegistrationInfo(
    val driver: Driver,
    val services: List<Service>
)