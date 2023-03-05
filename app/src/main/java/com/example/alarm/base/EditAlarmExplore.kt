/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.alarm.base

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.*
import com.example.alarm.R
import com.example.alarm.data.ExploreModel
import com.example.alarm.data.EditAlarmModel
import com.example.alarm.home.OnExploreItemClicked
import com.example.alarm.ui.theme.crane_caption
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getSystemService
import coil.compose.AsyncImagePainter.State.Loading
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.example.alarm.data.AlarmData
import com.example.alarm.home.OnEditAlarmExploreItemClicked
import com.example.alarm.model.AlarmReceiver
import java.util.*

@Composable
fun EditAlarmExploreSection(
    widthSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier,
    title: String,
//    exploreList: List<EditAlarmModel>,
    onItemClicked: OnEditAlarmExploreItemClicked
) {
    var hour by remember { mutableStateOf("") }
    var minute by remember { mutableStateOf("") }
    val context: Context = LocalContext.current
    Surface(modifier = modifier.fillMaxSize(), color = Color.White) {
        Column(modifier = Modifier.padding(start = 24.dp, top = 20.dp, end = 24.dp)) {
            Text(
                text = title,
                style = MaterialTheme.typography.caption.copy(color = crane_caption)
            )
            Spacer(Modifier.height(8.dp))
            Text(text = stringResource(R.string.set_time))
            Row (
                horizontalArrangement = Arrangement.Center
            ) {
                OutlinedTextField(
                    value = hour,
                    onValueChange = { hour = it },
                    modifier = Modifier
                        .weight(weight = 1f, fill = false)
                        .height(70.dp)
                        .width(100.dp),
                    label = { Text(text=stringResource(R.string.hour)) },
                    textStyle = MaterialTheme.typography.body1.copy(
                        textAlign = TextAlign.Center
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Black,
                        unfocusedBorderColor = Color.Gray
                    ),
                    singleLine = true
                )

                Text(
                    modifier = Modifier
                        .width(35.dp)
                        .align(Alignment.CenterVertically),
                    fontSize = 30.sp,
                    text = stringResource(R.string.colon),
                    textAlign = TextAlign.Center
                )

                OutlinedTextField(
                    value = minute,
                    onValueChange = { minute = it},
                    modifier = Modifier
                        .weight(weight = 1f, fill = false)
                        .height(70.dp)
                        .width(100.dp),
                    label = { Text(text=stringResource(R.string.minute)) },
                    textStyle = MaterialTheme.typography.body1.copy(
                        textAlign = TextAlign.Center
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Black,
                        unfocusedBorderColor = Color.Gray
                    ),
                    singleLine = true
                )
            }
//                    item { Text(text = "Week") }
            Row (
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        Log.d("hour:minute", "$hour:$minute")
                        val calendar: Calendar = Calendar.getInstance().apply {
                            timeInMillis = System.currentTimeMillis()
                            set(Calendar.HOUR_OF_DAY, Integer.parseInt(hour))
                            set(Calendar.MINUTE, Integer.parseInt(minute))
                            set(Calendar.SECOND,0)
                        }
                        val alarmIntent = Intent(context, AlarmReceiver::class.java)
                        val pendingIntent: PendingIntent = PendingIntent.getBroadcast(context, 0, alarmIntent, PendingIntent.FLAG_IMMUTABLE)
                        val alarmManager: AlarmManager = ContextCompat.getSystemService(context,AlarmManager::class.java) as AlarmManager
                        alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.timeInMillis,pendingIntent)
                    }
                ) {
                    Text(text = stringResource(R.string.set))
                }
            }
        }
    }
}