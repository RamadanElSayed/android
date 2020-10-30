package com.tawabsoft.taxi.rider.networking.socket

import com.tawabsoft.taxi.common.networking.socket.interfaces.SocketRequest

class DeleteAddress(id: Int): SocketRequest() {
    init {
        this.params = arrayOf(id)
    }
}