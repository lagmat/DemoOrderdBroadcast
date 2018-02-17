package com.example.logonrm.demoorderdbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var receiver: BootBroadcastReceiver;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var filter = IntentFilter()
        filter.addAction(Intent.ACTION_POWER_CONNECTED)
        filter.addAction(Intent.ACTION_POWER_DISCONNECTED)

        val receiver = object: BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                when (intent?.action) {
                    Intent.ACTION_POWER_CONNECTED -> tvUSBStatus.text = "Cabo Conectado"
                    Intent.ACTION_POWER_DISCONNECTED -> tvUSBStatus.text = "Cabo Desconectado"
                }
            }
        }

        registerReceiver(receiver, filter)

        btEnviar.setOnClickListener{
            sendBroadcast(Intent("MeuOrderedBroadcast"))
        }

        fun onDestroy() {
           unregisterReceiver(receiver)
           super.onDestroy()
       }
    }
}
