package com.example.logonrm.demoorderdbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

/**
 * Created by logonrm on 17/02/2018.
 */
class MeuOutroReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
       Log.i("DEMOORDERED", "Meu  outro receiver")
    }
}