package com.example.alarm.view

import android.app.Activity
import android.content.Context
import android.icu.util.Calendar
import android.media.Ringtone
import android.media.RingtoneManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.example.alarm.R

class AlarmScreenActivity: ComponentActivity() {
    // TODO: code
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Log.d("AlarmScreenActivity","onCreate")
            val uri: Uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)
            val ringTone: Ringtone = RingtoneManager.getRingtone(applicationContext,uri)
            val activity = LocalContext.current as Activity
            ringTone.play()
            AlarmScreen(ringTone,applicationContext,activity)
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun AlarmScreen(
    ringtone: Ringtone,
    applicationContext: Context,
    activity: Activity
){
    val keyboardController = LocalSoftwareKeyboardController.current
    var inputDayOfWeek by remember { mutableStateOf("") }
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(R.color.crimson))
    )
    {
        Column() {
            Text(text = "今日は何曜日？")
            Row(
                horizontalArrangement = Arrangement.Center
            ){
                OutlinedTextField(
                    value = inputDayOfWeek,
                    onValueChange = { inputDayOfWeek = it },
                    modifier = Modifier
                        .weight(weight = 1f, fill = false)
                        .height(70.dp)
                        .width(100.dp),
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = {
                            keyboardController?.hide()
                        })
                )
                Text(text = "曜日")
            }
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    val calendar = Calendar.getInstance()
                    var todayOfWeek: String? = null
                    when(calendar.get(Calendar.DAY_OF_WEEK)) {
                        1 -> todayOfWeek = "日曜日"
                        2 -> todayOfWeek = "月曜日"
                        3 -> todayOfWeek = "火曜日"
                        4 -> todayOfWeek = "水曜日"
                        5 -> todayOfWeek = "木曜日"
                        6 -> todayOfWeek = "金曜日"
                        7 -> todayOfWeek = "土曜日"
                    }
                    if (inputDayOfWeek != ""){
                        if (todayOfWeek + R.string.week == inputDayOfWeek){
                            ringtone.stop()
                            activity.finish()
                        }
                        else{
                            val toast = Toast.makeText(applicationContext, R.string.youbi_is_different,Toast.LENGTH_SHORT)
                            toast.show()
                        }
                    }

                }
            ){Text(text = stringResource(R.string.stop))}
        }
    }
}