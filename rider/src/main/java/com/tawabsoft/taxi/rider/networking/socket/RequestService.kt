package com.tawabsoft.taxi.rider.networking.socket

import com.tawabsoft.taxi.common.networking.socket.interfaces.SocketRequest
import com.tawabsoft.taxi.common.utils.Adapters
import com.tawabsoft.taxi.rider.models.RequestDTO
import org.json.JSONObject

class RequestService(requestDto: RequestDTO): SocketRequest() {
    init {
        val dto = JSONObject(Adapters.moshi.adapter<RequestDTO>(RequestDTO::class.java).toJson(requestDto))
        this.params = arrayOf(dto)
    }
}


