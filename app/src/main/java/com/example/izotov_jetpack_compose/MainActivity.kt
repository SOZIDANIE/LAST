package com.example.izotov_jetpack_compose

import android.content.Intent
import android.os.Bundle
import android.print.PrintAttributes
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.izotov_jetpack_compose.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val myColor: Color = Green1
            Izotov_Jetpack_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = myColor
                ) {
                    Column (modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)) {
                        Text()
                        Row1()
                        Row2()
                        Image()
                        Button()
                        BottomPanel()
                        }
                    }
                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun Button() {
    val context = LocalContext.current
    Button(onClick = { val inte = Intent(context, ALARMtrueC::class.java)
        startActivity(context, inte, null) },colors = ButtonDefaults.buttonColors(backgroundColor = LightGreen, contentColor = DarkGreen
    ), modifier = Modifier
        .size(365.dp, 60.dp)
        .offset(x = 12.dp, y = 169.dp)
        .background(color = Green1), shape = RoundedCornerShape(15.dp)) {
        Text("Добавить будильник",
            fontSize = 20.sp,
            color = White)
    }
}

@Preview(showBackground = true)
@Composable
fun Image() {
    val context = LocalContext.current
    Image(
        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.avatar)),
        contentDescription = "аватар",
        modifier = Modifier
            .size(60.dp)
            .offset(x = 305.dp, y = -(245).dp)
            .clickable ( onClick = {
                val inte = Intent(context, Profile::class.java)
                startActivity(context, inte, null)
                inte.putExtra("act", 2)
            } )
    )
}

@Preview(showBackground = true)
@Composable
fun Text() {
    Text("Будильник",
        fontSize = 30.sp,
        modifier = Modifier.padding(20.dp),
        color = White,
        fontWeight = FontWeight.Bold)
}

@Preview(showBackground = true)
@Composable
fun Row1() {
    val context = LocalContext.current
    val checkedState = remember { mutableStateOf(false) }
    Row (verticalAlignment = Alignment.CenterVertically ) {
        PrintAttributes.Margins(40, 0, 0, 0)
        Text("07:30",
            fontSize = 60.sp,
            modifier = Modifier.padding(5.dp)
                .clickable { val inte = Intent(context, ALARMc::class.java)
                    startActivity(context, inte, null) },
            color = White,
            fontWeight = FontWeight.Light)
        Switch(
            checked = checkedState.value,
            onCheckedChange = {
                checkedState.value = it
            },
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color(0xFFFFFFFF),
                checkedTrackColor = Color(0xFFAAF683),
                uncheckedThumbColor = Color(0xFFFFFFFF),
                uncheckedTrackColor = Color(0xFFFF9B85)
            ),
            modifier = Modifier
                .size(90.dp, 45.dp)
                .offset(x = 125.dp, y = 5.dp)
                .background(
                    color = (if (checkedState.value) {
                        Color(0xFFAAF683)
                    } else {
                        Color(0xFFFF9B85)
                    }), shape = RoundedCornerShape(25.dp)
                )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Row2() {
    val context = LocalContext.current
    val checkedState1 = remember { mutableStateOf(false) }
    Row (verticalAlignment = Alignment.CenterVertically ) {
        Text("08:00",
            fontSize = 60.sp,
            modifier = Modifier.padding(5.dp)
                .clickable { val inte = Intent(context, ALARMc::class.java)
                startActivity(context, inte, null) },
            color = White,
            fontWeight = FontWeight.Light)
        Switch(
            checked = checkedState1.value,
            onCheckedChange = {
                checkedState1.value = it
            },
            colors = SwitchDefaults.colors(
                checkedThumbColor = White,
                checkedTrackColor = LightGreen,
                uncheckedThumbColor = White,
                uncheckedTrackColor = Red2
            ),
            modifier = Modifier
                .size(90.dp, 45.dp)
                .offset(x = 125.dp, y = 5.dp)
                .background(
                    color = (if (checkedState1.value) {
                        LightGreen
                    } else {
                        Red2
                    }), shape = RoundedCornerShape(25.dp)
                )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SwitcherView() {
    var checkedState by remember {
        mutableStateOf(true)
    }
    Switch(
        checked = checkedState, onCheckedChange = { checkedState = it },
        modifier = Modifier
            .background(color = Color(0xFFAAF683), shape = RoundedCornerShape(15.dp))
            .size(60.dp, 35.dp),
        colors = SwitchDefaults.colors(
            checkedThumbColor = White,
            checkedTrackColor = LightGreen,
            uncheckedThumbColor = White,
            uncheckedTrackColor = Red1
        )
    )
}

@Preview(showBackground = true)
@Composable
fun BottomPanel() {
    val context = LocalContext.current
    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center).offset(y = 190.dp)) {
        Box(modifier = Modifier
            .size(320.dp, 80.dp)
            .clip(
                RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 30.dp,
                    bottomEnd = 0.dp,
                    bottomStart = 0.dp,
                )
            ).background(LightGreen),
        ){
            Row(modifier = Modifier.padding(all = 8.dp)) {
                Column (modifier = Modifier.padding(start = 24.dp, top = 8.dp)) {
                    Image(
                        painter = painterResource(R.drawable.image),
                        contentDescription = "List",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable ( onClick = { val inte = Intent(context, ThrirdActivity::class.java)
                                startActivity(context, inte, null)} )
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
                    Image(
                        painter = painterResource(R.drawable.image1),
                        contentDescription = "Alarm",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable ( onClick = { Log.d("p", "pressed1") } )
                    )
                    Text(
                        text = "Alarm",
                        color = Green1,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center),
                        fontSize = 10.sp
                    )
                }
                Column (modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                    Image(
                        painter = painterResource(R.drawable.image2),
                        contentDescription = "Calendar",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable ( onClick = { val inte = Intent(context, FourthActivity::class.java)
                                startActivity(context, inte, null) } )
                    )
                    Text(
                        text = "Calendar",
                        color = Red1,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center),
                        fontSize = 10.sp
                    )
                }
                Column (modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                    Image(
                        painter = painterResource(R.drawable.image3),
                        contentDescription = "Settings",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable ( onClick = { val inte = Intent(context, SecondActivity::class.java)
                            startActivity(context, inte, null)})
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



