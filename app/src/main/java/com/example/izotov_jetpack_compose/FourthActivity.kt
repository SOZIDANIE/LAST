package com.example.izotov_jetpack_compose

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.CalendarView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import com.example.izotov_jetpack_compose.ui.theme.*

class FourthActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Izotov_Jetpack_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Green1
                ) {
                    Column (modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)) {
                        BottomPanelFor4()
                        ImageFor4()
                        TextFor4()
                        Row {
                            Calendar()
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ImageFor4() {
    val context = LocalContext.current
    androidx.compose.foundation.Image(
        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.avatar)),
        contentDescription = "аватар",
        modifier = Modifier
            .size(60.dp)
            .offset(x = 325.dp, y = (-75).dp)
            .clickable ( onClick = {
                val inte = Intent(context, Profile::class.java)
                ContextCompat.startActivity(context, inte, null)
                inte.putExtra("act", 3)
            })
    )
}

@Preview(showBackground = true)
@Composable
fun Calendar(){
    AndroidView({ CalendarView(it)},
        modifier = Modifier
            .wrapContentWidth()
            .offset(x = 0.dp, y = (-100).dp)
            .size(450.dp),
        update = {
                views ->
            views.setOnDateChangeListener{calendarView, i, i2, i3 ->
            }
        })
}

@Preview(showBackground = true)
@Composable
fun TextFor4() {
    val White1: Color = White
    Text("Настройки",
        fontSize = 30.sp,
        modifier = Modifier.offset(x=10.dp,y=(-130).dp),
        color = White1,
        fontWeight = FontWeight.Bold)
}

@Preview(showBackground = true)
@Composable
fun BottomPanelFor4() {
    val context = LocalContext.current
    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)
        .offset(y = 570.dp)) {
        Box(modifier = Modifier
            .size(320.dp, 80.dp)
            .clip(
                RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 30.dp,
                    bottomEnd = 0.dp,
                    bottomStart = 0.dp,
                )
            )
            .background(LightGreen),
        ){
            Row(modifier = Modifier.padding(all = 8.dp)) {
                Column (modifier = Modifier.padding(start = 24.dp, top = 8.dp)) {
                    androidx.compose.foundation.Image(
                        painter = painterResource(R.drawable.image),
                        contentDescription = "List",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable(onClick = {
                                val inte = Intent(context, ThrirdActivity::class.java)
                                ContextCompat.startActivity(context, inte, null)
                            })
                    )
                    Text(
                        text = "List",
                        color = Red1,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center),
                        fontSize = 10.sp
                    )
                }
                Column (modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                    androidx.compose.foundation.Image(
                        painter = painterResource(R.drawable.clockred),
                        contentDescription = "Alarm",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable(onClick = {
                                val inte = Intent(context, MainActivity::class.java)
                                ContextCompat.startActivity(context, inte, null)
                            })
                    )
                    Text(
                        text = "Alarm",
                        color = Red1,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center),
                        fontSize = 10.sp
                    )
                }
                Column (modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                    androidx.compose.foundation.Image(
                        painter = painterResource(R.drawable.calendgreen),
                        contentDescription = "Calendar",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable(onClick = { Log.d("p", "pressed2") })
                    )
                    Text(
                        text = "Calendar",
                        color = Green1,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center),
                        fontSize = 10.sp
                    )
                }
                Column (modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                    androidx.compose.foundation.Image(
                        painter = painterResource(R.drawable.image3),
                        contentDescription = "Settings",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable(onClick = {
                                val inte = Intent(context, SecondActivity::class.java)
                                ContextCompat.startActivity(context, inte, null)
                            })
                    )
                    Text(
                        text = "Settings",
                        color = Red1,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center),
                        fontSize = 10.sp
                    )
                }
            }
        }
    }
}