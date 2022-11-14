package com.example.izotov_jetpack_compose

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.izotov_jetpack_compose.ui.theme.*

class FifthActivity : ComponentActivity() {

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
                        ImageFor5()
                        TextFor5()
                        Row {
                            nameTask()
                        }
                        Row{
                            clock()
                            calend()
                        }
                        Row{
                            task()
                        }
                        Row {
                            ButtonFor5()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun nameTask() {
    Column(modifier = Modifier.padding(top = 10.dp, end = 20.dp).offset(x = 20.dp, 0.dp)) {
        val message = remember{mutableStateOf("")}
        TextField(
            message.value,
            {message.value = it},
            textStyle = TextStyle(fontSize =  18.sp),
            placeholder = { Text(text = "Заголовок задачи")},
                //leadingIcon = { Icon(painter = painterResource(R.drawable.greyclock), contentDescription = "clock", modifier = Modifier.size(20.dp)) },
            modifier = Modifier.size(350.dp, 60.dp)
                .clip(RoundedCornerShape(5.dp)), colors = TextFieldDefaults.textFieldColors(backgroundColor = White, cursorColor = Color.Black, unfocusedIndicatorColor = Color.Transparent, focusedIndicatorColor = Color.Transparent)
            )
        /*
        Box(
            modifier = Modifier
                .size(350.dp, 32.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 5.dp,
                        topEnd = 5.dp,
                        bottomEnd = 5.dp,
                        bottomStart = 5.dp,
                    )
                )
                .background(White)
        ) {
            Text(
                "Заголовок задачи",
                fontSize = 20.sp,
                color = Gray1,
                modifier = Modifier.padding(5.dp)
            )
        }
         */
    }
}

@Composable
fun clock() {
    Column(modifier = Modifier.padding(top = 10.dp, end = 20.dp).offset(x = 20.dp, 4.dp)) {
        val message = remember{mutableStateOf("")}
        TextField(
            message.value,
            {message.value = it},
            textStyle = TextStyle(fontSize =  18.sp),
            placeholder = { Text(text = "16:30")},
            leadingIcon = { Icon(painter = painterResource(R.drawable.greyclock), contentDescription = "clock", modifier = Modifier.size(20.dp)) },
            modifier = Modifier.size(165.dp, 60.dp)
                .clip(RoundedCornerShape(5.dp)), colors = TextFieldDefaults.textFieldColors(backgroundColor = White, cursorColor = Color.Black, unfocusedIndicatorColor = Color.Transparent, focusedIndicatorColor = Color.Transparent)
        )
        /*
        Box(
            modifier = Modifier
                .size(165.dp, 32.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 5.dp,
                        topEnd = 5.dp,
                        bottomEnd = 5.dp,
                        bottomStart = 5.dp,
                    )
                )
                .background(White)
        ) {
            Row() {
                androidx.compose.foundation.Image(
                    painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.greyclock)),
                    contentDescription = "clock",
                    modifier = Modifier
                        .size(17.dp)
                        .offset(x = (7).dp, y = (8).dp)
                )
                Text(
                    "16:30",
                    fontSize = 20.sp,
                    color = Gray1,
                    modifier = Modifier
                        .padding(5.dp)
                        .offset(10.dp)
                )
            }
         */
    }
}


@Composable
fun calend() {
    Column(modifier = Modifier.padding(top = 10.dp, end = 20.dp).offset(x = 0.dp, (-10).dp)) {
        Column(modifier = Modifier.padding(top = 10.dp, end = 20.dp).offset(x = 20.dp, 4.dp)) {
            val message = remember{mutableStateOf("")}
            TextField(
                message.value,
                {message.value = it},
                textStyle = TextStyle(fontSize =  18.sp),
                placeholder = { Text(text = "14.01.2021")},
                leadingIcon = { Icon(painter = painterResource(R.drawable.graycalend), contentDescription = "clock", modifier = Modifier.size(20.dp)) },
                modifier = Modifier.size(165.dp, 60.dp)
                    .clip(RoundedCornerShape(5.dp)), colors = TextFieldDefaults.textFieldColors(backgroundColor = White, cursorColor = Color.Black, unfocusedIndicatorColor = Color.Transparent, focusedIndicatorColor = Color.Transparent)
            )
        /*
        Box(
            modifier = Modifier
                .size(165.dp, 32.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 5.dp,
                        topEnd = 5.dp,
                        bottomEnd = 5.dp,
                        bottomStart = 5.dp,
                    )
                )
                .background(White)
        ) {
            Row() {
                androidx.compose.foundation.Image(
                    painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.graycalend)),
                    contentDescription = "clock",
                    modifier = Modifier
                        .size(17.dp)
                        .offset(x = (7).dp, y = (8).dp)
                )
                Text(
                    "14.01.2021",
                    fontSize = 20.sp,
                    color = Gray1,
                    modifier = Modifier
                        .padding(5.dp)
                        .offset(10.dp)
                )
            }

         */
        }
    }
}

@Composable
fun task() {
    Column(modifier = Modifier.padding(top = 10.dp, end = 20.dp).offset(x = 20.dp, 0.dp)) {
        val message = remember{mutableStateOf("")}
        TextField(
            message.value,
            {message.value = it},
            textStyle = TextStyle(fontSize =  18.sp),
            placeholder = { Text(text = "Описание задачи")},
            //leadingIcon = { Icon(painter = painterResource(R.drawable.greyclock), contentDescription = "clock", modifier = Modifier.size(20.dp)) },
            modifier = Modifier.size(350.dp, 150.dp)
                .clip(RoundedCornerShape(5.dp)), colors = TextFieldDefaults.textFieldColors(backgroundColor = White, cursorColor = Color.Black, unfocusedIndicatorColor = Color.Transparent, focusedIndicatorColor = Color.Transparent)
        )
    /*
        Row(modifier = Modifier.offset(y = 10.dp)) {
            Box(
                modifier = Modifier
                    .size(350.dp, 96.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 5.dp,
                            topEnd = 5.dp,
                            bottomEnd = 5.dp,
                            bottomStart = 5.dp,
                        )
                    )
                    .background(White),
            ) {
                Text(
                    "Описание задачи",
                    fontSize = 20.sp,
                    color = Gray1,
                    modifier = Modifier.padding(5.dp)
                )
            }

         */
    }
}

@Composable
fun ButtonFor5() {
    val context = LocalContext.current
    val White1: Color = White
    androidx.compose.material.Button(
        onClick = { val inte = Intent(context, ThrirdActivity::class.java)
            ContextCompat.startActivity(context, inte, null ) }, colors = ButtonDefaults.buttonColors(
            backgroundColor = LightGreen, contentColor = DarkGreen
        ), modifier = Modifier
            .size(350.dp, 60.dp)
            .offset(x = 23.dp, y = (150).dp)
            .background(color = Green1), shape = RoundedCornerShape(15.dp)
    ) {
        Text(
            "Записать задачу",
            fontSize = 20.sp,
            color = White1
        )
    }
}


@Composable
fun ImageFor5() {
    val context = LocalContext.current
    androidx.compose.foundation.Image(
        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.backbutton)),
        contentDescription = "аватар",
        modifier = Modifier
            .size(60.dp)
            .offset(x = (325).dp, y = (5).dp)
            .clickable(
                onClick = {
                    val inte = Intent(context, ThrirdActivity::class.java)
                    ContextCompat.startActivity(context, inte, null )
                }
            )
    )
}


@Composable
fun TextFor5() {
    val White1: Color = White
    Text(
        "Добавить задачу",
        fontSize = 30.sp,
        modifier = Modifier.offset(x = 10.dp, y = (-50).dp),
        color = White1,
        fontWeight = FontWeight.Bold
    )
}

