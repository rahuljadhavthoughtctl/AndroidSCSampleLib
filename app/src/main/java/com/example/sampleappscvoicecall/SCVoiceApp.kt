package com.example.sampleappscvoicecall

import android.app.Application
import android.content.Context
import android.util.Log
/*import com.calls.sdk.SecuredCalls
import com.calls.sdk.User*/

//import com.example.sc_sdk.SDKSingleton
//import com.sc.sdk.SecuredCalls

//import com.example.sc_sdk.SDKSingleton

//import com.es.sc.voice.main.SecuredVoiceCallSDK

class SCVoiceApp: Application() {

    companion object {
        val TAG = "SCVoiceApp"
        lateinit var instance: SCVoiceApp
        val context: Context
            get() {
                return instance
            }
    }
    init {
        instance = this
    }

   // val sdkSingleton: SDKSingleton = SDKSingleton(context = context)

    override fun onCreate() {
        super.onCreate()
        //val scCalls = SecuredCalls()
        //scCalls.fromJson("{}")
       // sdkSingleton.initializeSDK("172osffa2e4v6uors1i4lckf2i3j9e2ur7sd4572l9mgm82gg6q6")
    }


  /*  val securedVoiceCallSDK: SecuredVoiceCallSDK = SecuredVoiceCallSDK(context = context)

    override fun onCreate() {
        super.onCreate()
        securedVoiceCallSDK.initializeSDK("172osffa2e4v6uors1i4lckf2i3j9e2ur7sd4572l9mgm82gg6q6")
        Log.d("SCVoiceApp","Privacy Url :"+securedVoiceCallSDK.getPrivacyPolicyUrl())
    }*/
}