package com.tawabsoft.taxi.driver.networking.socket

import com.tawabsoft.taxi.common.networking.socket.interfaces.SocketRequest

class AcceptOrder(requestId: Long) : SocketRequest() {
    init {
        this.params = arrayOf(requestId)
    }
}