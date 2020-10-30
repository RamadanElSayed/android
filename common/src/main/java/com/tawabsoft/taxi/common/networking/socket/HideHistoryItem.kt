package com.tawabsoft.taxi.common.networking.socket

import com.tawabsoft.taxi.common.networking.socket.interfaces.SocketRequest

class HideHistoryItem(requestId: Long) : SocketRequest() {
    init {
        this.params = arrayOf(requestId)
    }
}