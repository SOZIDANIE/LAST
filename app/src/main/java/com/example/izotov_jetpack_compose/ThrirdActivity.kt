package com.example.izotov_jetpack_compose

import android.content.Intent
import android.os.Bundle
import android.print.PrintAttributes
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.izotov_jetpack_compose.ui.theme.*

class ThrirdActivity : ComponentActivity() {
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
                        BottomPanelFor3()
                        ImageFor3()
                        TextFor3()
                        Row{
                            Tasks(shape = RoundedCornerShape(20.dp), style = Stroke(width=30f))
                        }
                        Row {
                            ButtonFor3()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Tasks(shape: RoundedCornerShape, style: DrawStyle) {
    val context = LocalContext.current
    Column(
        Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center).offset(x=0.dp, y = (-190).dp)){
        Spacer(modifier = Modifier.size(100.dp))
        Box(modifier = Modifier
            .size(340.dp, 90.dp)
            .shadow(
                10.dp, RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 0.dp,
                    bottomEnd = 30.dp,
                    bottomStart = 0.dp
                )
            )
            .clip(
                RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 0.dp,
                    bottomEnd = 30.dp,
                    bottomStart = 0.dp
                )
            )
            .background(Orange).clickable (onClick = { val inte = Intent(context, SixthActivity::class.java)
                ContextCompat.startActivity(context, inte, null) } )){
            Text(text = "Вечерний поход в кино", fontSize = 20.sp, color = White, modifier = Modifier.offset(x = 15.dp, y=15.dp))
            Text(text = "Идем в кино с коллегами!", fontSize = 13.sp, color = Gray1, modifier = Modifier.offset(x=15.dp, y=45.dp))
            Text(text = "10.02.2021\n 19:40", fontSize = 13.sp, color = Gray1, modifier = Modifier.offset(x=260.dp, y=25.dp))
        }
        Spacer(modifier = Modifier.size(20.dp))
        Box(modifier = Modifier
            .size(340.dp, 90.dp)
            .shadow(
                10.dp, RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 0.dp,
                    bottomEnd = 30.dp,
                    bottomStart = 0.dp
                )
            )
            .clip(
                RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 0.dp,
                    bottomEnd = 30.dp,
                    bottomStart = 0.dp
                )
            )
            .background(Orange).clickable (onClick = { val inte = Intent(context, SixthActivity::class.java)
                ContextCompat.startActivity(context, inte, null) } )){
            Row(){}
            Text(text = "Забрать заказ Ozon", fontSize = 20.sp, color = White, modifier = Modifier.padding(15.dp))
            Text(text = "Пункт выдачи на ул. Ленина, 103", fontSize = 13.sp, color = Gray1, modifier = Modifier.offset(x=15.dp, y=45.dp))
            Text(text = "10.02.2021\n 19:40", fontSize = 13.sp, color = Gray1, modifier = Modifier.offset(x=260.dp, y=25.dp))
        }
        Spacer(modifier = Modifier.size(20.dp))
        Box(modifier = Modifier
            .size(340.dp, 90.dp)
            .shadow(
                10.dp, RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 0.dp,
                    bottomEnd = 30.dp,
                    bottomStart = 0.dp
                )
            )
            .clip(
                RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 0.dp,
                    bottomEnd = 30.dp,
                    bottomStart = 0.dp
                )
            )
            .background(Orange).clickable (onClick = { val inte = Intent(context, SixthActivity::class.java)
                ContextCompat.startActivity(context, inte, null) } )){
            Text(text = "Запись в автосервис", fontSize = 20.sp, color = White, modifier = Modifier.padding(15.dp))
            Text(text = "Сдать автомобиль в автосервис на ул.\n" +
                    "Бисертская, д. 14. Замена масла", fontSize = 13.sp, color = Gray1, modifier = Modifier.offset(x=15.dp, y=45.dp))
            Text(text = "10.02.2021\n 19:40", fontSize = 13.sp, color = Gray1, modifier = Modifier.offset(x=260.dp, y=25.dp))
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ButtonFor3() {
    val context = LocalContext.current
    val White1: Color = White
    Button(onClick = {  val inte = Intent(context, FifthActivity::class.java)
        ContextCompat.startActivity(context, inte, null) },colors = ButtonDefaults.buttonColors(backgroundColor = LightGreen, contentColor = DarkGreen
    ), modifier = Modifier
        .size(350.dp, 60.dp)
        .offset(x = 23.dp, y = (-100).dp)
        .background(color = Green1), shape = RoundedCornerShape(15.dp)
    ) {
        Text("Добавить задачу",
            fontSize = 20.sp,
            color = White1)
    }
}

@Preview(showBackground = true)
@Composable
fun ImageFor3() {
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
                inte.putExtra("act", 1)
            })
    )
}


@Preview(showBackground = true)
@Composable
fun TextFor3() {
    val White1: Color = White
    Text("Список дел",
        fontSize = 30.sp,
        modifier = Modifier.offset(x=10.dp,y=(-130).dp),
        color = White1,
        fontWeight = FontWeight.Bold)
}

@Preview(showBackground = true)
@Composable
fun BottomPanelFor3() {
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
                        painter = painterResource(R.drawable.listfor3),
                        contentDescription = "List",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable(onClick = { Log.d("p", "pressed") })
                    )
                    Text(
                        text = "List",
                        color = Green1,
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
                        painter = painterResource(R.drawable.image2),
                        contentDescription = "Calendar",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable(onClick = {  val inte = Intent(context, FourthActivity::class.java)
                                ContextCompat.startActivity(context, inte, null)
                             })
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
