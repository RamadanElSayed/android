package com.tawabsoft.taxi.driver.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import com.tawabsoft.taxi.common.components.BaseActivity
import com.tawabsoft.taxi.common.models.Request
import com.tawabsoft.taxi.common.networking.socket.interfaces.SocketNetworkDispatcher
import com.tawabsoft.taxi.common.utils.TravelRepository
import com.tawabsoft.taxi.common.utils.TravelRepository.get
import com.tawabsoft.taxi.common.utils.TravelRepository.set
import com.tawabsoft.taxi.driver.activities.splash.SplashActivity

@SuppressLint("Registered")
open class DriverBaseActivity : BaseActivity() {
    protected var travel: Request?
        get() = get(this, TravelRepository.AppType.DRIVER)
        protected set(request) {
            set(this, TravelRepository.AppType.DRIVER, request!!)
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        if(SocketNetworkDispatcher.instance.socket == null) {
//            startActivity(Intent(this, SplashActivity::class.java))
//            finish()
//            return
//        }
    }
}