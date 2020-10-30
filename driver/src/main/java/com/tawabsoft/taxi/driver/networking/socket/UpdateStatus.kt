package com.tawabsoft.taxi.driver.networking.socket

import com.tawabsoft.taxi.common.networking.socket.interfaces.SocketRequest

class UpdateStatus(turnOnline: Boolean): SocketRequest() {
    init {
        this.params = arrayOf(turnOnline)
    }
}