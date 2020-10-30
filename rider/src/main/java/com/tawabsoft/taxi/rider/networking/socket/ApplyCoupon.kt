package com.tawabsoft.taxi.rider.networking.socket

import com.tawabsoft.taxi.common.networking.socket.interfaces.SocketRequest

class ApplyCoupon(code: String) : SocketRequest() {
    init {
        this.params = arrayOf(code)
    }
}