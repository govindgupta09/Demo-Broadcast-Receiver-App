package com.example.demobroadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var receiver: AirplaneModeReceiver = AirplaneModeReceiver()
    private var wifiReceiver: WifiConnectivityReceiver = WifiConnectivityReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(receiver,it)
        }

        IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION).also {
            registerReceiver(wifiReceiver,it)
        }

    }

    override fun onStop(){
        super.onStop()
        unregisterReceiver(receiver)
        unregisterReceiver(wifiReceiver)
    }
}