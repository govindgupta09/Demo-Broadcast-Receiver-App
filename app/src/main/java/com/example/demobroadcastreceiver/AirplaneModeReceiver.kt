package com.example.demobroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        val isAirplaneEnabled = intent?.getBooleanExtra("state", false) ?: return

        if (isAirplaneEnabled) {
            Toast.makeText(context, "Airplane mode is Enabled", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, "Airplane mode is disabled", Toast.LENGTH_SHORT).show()
        }
    }
}