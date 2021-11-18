package com.example.weathger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    private lateinit var buttonLoadWeather:Button
    private lateinit var textViewGSon:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var url:String = "https://api.weather.yandex.ru/v2/forecast?lat=55.75396&lon=37.620393"

        buttonLoadWeather = findViewById(R.id.buttonLoadWeather)
        textViewGSon = findViewById(R.id.textViewGSon)

        var headers = HashMap<String, String>()
        headers["X-Yandex-API-Key"] = "9239e368-857d-4326-9121-0c0b37a74d0e"

        var apiWorker:ApiWorker = ApiWorker(applicationContext)
        buttonLoadWeather.setOnClickListener { LoadDataFromURL(url) }
    }


}