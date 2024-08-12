package com.example.sc_sdk

import android.content.Context
import android.util.Log
import com.google.gson.Gson

class SDKSingleton(context: Context) {
    companion object {
        private const val TAG = "SDKSingleton"
        private var BASE_URL = ""
        private var CLIENT_SECRET = ""
    }

    private val decodedConfig = "{\"clientId\":\"2sinv2ehqvkuucs52dqh8uc1ec\",\"domain\":\"prod-au-device-expertstack.auth.ap-southeast-2.amazoncognito.com\",\"baseUrl\":\"https://au.api.securedcalls.com\",\"contactCentreNumber\":\"12012413481\",\"bundleId\":\"com.es.sc\",\"showPermissionSheet\":true}"
    private val gson = Gson()
    private val configuration = gson.fromJson(decodedConfig, Configuration::class.java)

    init {
        if (configuration != null) {
                BASE_URL = configuration.baseUrl
        }
    }

        fun initializeSDK(clientSecret: String) {
            CLIENT_SECRET = clientSecret
            Log.d(TAG, "Secrete: $CLIENT_SECRET, BaseUrl: $BASE_URL")
        }


}
