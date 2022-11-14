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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import androidx.core.content.ContextCompat
import com.example.izotov_jetpack_compose.ui.theme.*

class SecondActivity : ComponentActivity() {
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
                        BottomPanelForSecond()
                        ImageForSecond()
                        TextForSecond()
                        Row {
                            Row1_1()
                            ImageVector()
                        }
                        Row {
                            Row1_2()
                            ImageVectorDateAndTime()
                        }
                        Row {
                            Row1_3()
                            ImageVectorSettingsSound()
                        }
                        Row {
                            Row1_4()
                            ImageVector()
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Row1_1() {
    val context = LocalContext.current
    val White1: Color = White
    Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier
        .offset(x = (0).dp, y = (-90).dp)
        .padding(5.dp)) {
        PrintAttributes.Margins(40, 0, 0, 0)
        Text("Профиль пользователя",
            fontSize = 25.sp,
            modifier = Modifier.padding(5.dp)
                .clickable { val inte = Intent(context, Profile::class.java)
                    ContextCompat.startActivity(context, inte, null) },
            color = White1,
            fontWeight = FontWeight.Light)
    }
}

@Preview(showBackground = true)
@Composable
fun Row1_2() {
    val White1: Color = White
    Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier
        .offset(x = (0).dp, y = (-90).dp)
        .padding(5.dp)) {
        PrintAttributes.Margins(40, 0, 0, 0)
        Text("Дата и время",
            fontSize = 25.sp,
            modifier = Modifier.padding(5.dp),
            color = White1,
            fontWeight = FontWeight.Light)
    }
}

@Preview(showBackground = true)
@Composable
fun Row1_3() {
    val White1: Color = White
    Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier
        .offset(x = (0).dp, y = (-90).dp)
        .padding(5.dp)) {
        PrintAttributes.Margins(40, 0, 0, 0)
        Text("Настройки звука",
            fontSize = 25.sp,
            modifier = Modifier.padding(5.dp),
            color = White1,
            fontWeight = FontWeight.Light)
    }
}

@Preview(showBackground = true)
@Composable
fun Row1_4() {
    val White1: Color = White
    Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier
        .offset(x = (0).dp, y = (-90).dp)
        .padding(5.dp)) {
        PrintAttributes.Margins(40, 0, 0, 0)
        Text("Проверить обновления",
            fontSize = 25.sp,
            modifier = Modifier.padding(5.dp),
            color = White1,
            fontWeight = FontWeight.Light)
    }
}



@Preview(showBackground = true)
@Composable
fun ImageVector() {
    val context = LocalContext.current
    androidx.compose.foundation.Image(
        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.vector)),
        contentDescription = "vector",
        modifier = Modifier
            .size(18.dp)
            .offset(x = 50.dp, y = (-70).dp)
            .clickable { val inte = Intent(context, Profile::class.java)
                ContextCompat.startActivity(context, inte, null) }
    )
}
@Preview(showBackground = true)
@Composable
fun ImageVectorDateAndTime() {
    androidx.compose.foundation.Image(
        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.vector)),
        contentDescription = "vector",
        modifier = Modifier
            .size(18.dp)
            .offset(x = 165.dp, y = (-70).dp)
    )
}

@Preview(showBackground = true)
@Composable
fun ImageVectorSettingsSound() {
    androidx.compose.foundation.Image(
        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.vector)),
        contentDescription = "vector",
        modifier = Modifier
            .size(18.dp)
            .offset(x = 124.dp, y = (-70).dp)
    )
}

@Preview(showBackground = true)
@Composable
fun ImageForSecond() {
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
                inte.putExtra("act", 4)
            })
    )
}

@Preview(showBackground = true)
@Composable
fun TextForSecond() {
    val White1: Color = White
    Text("Настройки",
        fontSize = 30.sp,
        modifier = Modifier.offset(x=10.dp,y=(-130).dp),
        color = White1,
        fontWeight = FontWeight.Bold)
}

@Preview(showBackground = true)
@Composable
fun BottomPanelForSecond() {
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
                            .clickable( onClick = { val inte = Intent(context, ThrirdActivity::class.java)
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
                        painter = painterResource(R.drawable.image2),
                        contentDescription = "Calendar",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable(onClick = { val inte = Intent(context, FourthActivity::class.java)
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
                        painter = painterResource(R.drawable.image4),
                        contentDescription = "Settings",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable(onClick = {
                            })
                    )
                    Text(
                        text = "Settings",
                        color = Green1,
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
