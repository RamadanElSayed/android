package com.tawabsoft.taxi.common.networking.socket

import com.tawabsoft.taxi.common.networking.socket.interfaces.SocketRequest

class SendMessage(content: String) : SocketRequest() {
    init {
        this.params = arrayOf(content)
    }
}