package com.example.logonrm.demoorderdbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

/**
 * Created by logonrm on 17/02/2018.
 */
class BootBroadcastReceiver: BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Terminei a Inicialização", Toast.LENGTH_SHORT).show()
    }

}