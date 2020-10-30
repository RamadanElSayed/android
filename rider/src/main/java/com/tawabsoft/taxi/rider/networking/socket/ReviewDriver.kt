package com.tawabsoft.taxi.rider.networking.socket

import com.tawabsoft.taxi.common.models.Review
import com.tawabsoft.taxi.common.networking.socket.interfaces.SocketRequest
import com.tawabsoft.taxi.common.utils.Adapters
import org.json.JSONObject

class ReviewDriver(review: Review): SocketRequest() {
    init {
        val obj = JSONObject(Adapters.moshi.adapter<Review>(Review::class.java).toJson(review))
        this.params = arrayOf(obj)
    }
}