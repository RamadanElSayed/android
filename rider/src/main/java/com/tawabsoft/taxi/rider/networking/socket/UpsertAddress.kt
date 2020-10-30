package com.tawabsoft.taxi.rider.networking.socket

import com.tawabsoft.taxi.common.models.Address
import com.tawabsoft.taxi.common.networking.socket.interfaces.SocketRequest
import com.tawabsoft.taxi.common.utils.Adapters
import org.json.JSONObject

class UpsertAddress(address: Address): SocketRequest() {
    init {
        val add = JSONObject(Adapters.moshi.adapter<Address>(Address::class.java).toJson(address))
        this.params = arrayOf(add)
    }
}