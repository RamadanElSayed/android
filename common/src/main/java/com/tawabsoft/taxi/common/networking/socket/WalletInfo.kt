package com.tawabsoft.taxi.common.networking.socket

import com.tawabsoft.taxi.common.models.PaymentGateway
import com.tawabsoft.taxi.common.models.WalletItem
import com.tawabsoft.taxi.common.networking.socket.interfaces.SocketRequest
import com.squareup.moshi.JsonClass

class WalletInfo : SocketRequest()

@JsonClass(generateAdapter = true)
data class WalletInfoResult(
    val gateways: List<PaymentGateway>,
    val wallet: List<WalletItem>
    )