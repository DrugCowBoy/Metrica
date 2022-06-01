package com.demo.metrica

import android.app.Application
import android.util.Log
import com.yandex.metrica.YandexMetrica
import com.yandex.metrica.YandexMetricaConfig


class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        // Creating an extended library configuration.
        val config = YandexMetricaConfig.newConfigBuilder("здесь был мой API key (для использования в SDK)").build()
        // Initializing the AppMetrica SDK.
        YandexMetrica.activate(applicationContext, config)
        Log.i("My", "YandexMetrica activated")

    }

}