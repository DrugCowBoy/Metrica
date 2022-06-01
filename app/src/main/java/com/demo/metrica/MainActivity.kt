package com.demo.metrica

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.yandex.metrica.YandexMetrica


// key: , mail: platitsinegor@yandex.ru
// https://appmetrica.yandex.ru/docs/mobile-sdk-dg/android/about/android-initialize.html
// https://appmetrica.yandex.ru/docs/data-collection/events-android.html
// Чтобы отправить многоуровневое событие, передайте пару key:value в параметрах события.
// В интерфейсе key и value считаются уровнями вложенности. Параметры события можно отправить в виде JSON.

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)

        button.setOnClickListener {
            // Отправим событие в YandexMetrica
            val eventParameters = "{\"name\":\"Alice\", \"age\":\"25\"}"
            YandexMetrica.reportEvent("New person", eventParameters)
            Log.i("My", "Send event")
        }
    }
}