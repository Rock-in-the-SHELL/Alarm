package com.example.alarm.model

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import com.example.alarm.view.AlarmScreenActivity

class AlarmReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d("AlarmReceiver_onReceive","Alarm is received!")
        if(context != null) {
//            val toast = Toast.makeText(context, "アラーム処理なう",Toast.LENGTH_SHORT)
//            toast.show()
            // Start Activity
            val toAlarmScreenIntent: Intent = Intent(context, AlarmScreenActivity::class.java)
            toAlarmScreenIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(toAlarmScreenIntent)
        }
    }
}