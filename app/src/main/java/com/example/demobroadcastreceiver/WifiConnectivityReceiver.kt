package com.example.demobroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class WifiConnectivityReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        if (intent?.action == ConnectivityManager.CONNECTIVITY_ACTION) {

            val isWifiEnabled =
                intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY, false)

            if (isWifiEnabled) {
                Toast.makeText(context, "Wifi Connected", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Wifi disconnected", Toast.LENGTH_SHORT).show()
            }
        }
    }
}