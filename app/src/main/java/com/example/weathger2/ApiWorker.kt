package com.example.weathger2

import android.content.Context
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class ApiWorker(var applicationContext:Context) {
    private var volleyQueue = Volley.newRequestQueue(applicationContext)

    public fun makeGetRequest(url:String,headers:HashMap<String, String> = hashMapOf()){


        var request = object : StringRequest(
            Method.GET,
            url,
            Response.Listener {
                textViewGSon.text = it
            },
            Response.ErrorListener {
                textViewGSon.text = it.toString()
            }
        ) {
            override fun getHeaders(): MutableMap<String, String> {
                return headers
            }
        }
        volleyQueue.add(request)
    }
}