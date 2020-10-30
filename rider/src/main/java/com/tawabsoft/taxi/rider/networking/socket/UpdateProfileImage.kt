package com.tawabsoft.taxi.rider.networking.socket

import com.tawabsoft.taxi.common.networking.socket.interfaces.SocketRequest

class UpdateProfileImage(data: ByteArray): SocketRequest() {
    init {
        this.params = arrayOf(data)
    }
}