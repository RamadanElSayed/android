package com.tawabsoft.taxi.rider.networking.http

import com.tawabsoft.taxi.common.models.Rider
import com.tawabsoft.taxi.common.networking.http.interfaces.HTTPRequest

class Login(fireBaseToken: String): HTTPRequest() {
    override val path: String = "rider/login"
    init {
        this.params = mapOf("token" to fireBaseToken)
    }
}

data class LoginResult(
    val token: String,
    val user: Rider
)