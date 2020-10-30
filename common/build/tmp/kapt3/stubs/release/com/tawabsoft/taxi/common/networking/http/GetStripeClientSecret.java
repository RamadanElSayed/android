package com.tawabsoft.taxi.common.networking.http;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/tawabsoft/taxi/common/networking/http/GetStripeClientSecret;", "Lcom/tawabsoft/taxi/common/networking/http/interfaces/HTTPRequest;", "gatewayId", "", "amount", "currency", "", "(IILjava/lang/String;)V", "path", "getPath", "()Ljava/lang/String;", "common_release"})
public final class GetStripeClientSecret extends com.tawabsoft.taxi.common.networking.http.interfaces.HTTPRequest {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String path = "stripe_client_secret";
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getPath() {
        return null;
    }
    
    public GetStripeClientSecret(int gatewayId, int amount, @org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
        super();
    }
}