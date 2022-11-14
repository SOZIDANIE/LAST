package com.example.izotov_jetpack_compose

import android.content.Intent
import android.os.Bundle
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.izotov_jetpack_compose.ui.theme.*

class UserLogin2 : ComponentActivity() {
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
                        ImageFor511()
                        TextFor511()
                        Row {
                            TrxtView11()
                        }
                        Row{
                            email()
                        }
                        Row {
                            pass()
                        }
                        Row {
                            ButtonFor511()
                        }
                    }
                }
            }
        }
    }
}
@Composable
fun pass() {
    Column(modifier = Modifier.padding(top = 10.dp, end = 20.dp).offset(x = 20.dp,y = 127.dp)) {
        val message = remember{mutableStateOf("")}
        TextField(
            message.value,
            {message.value = it},
            textStyle = TextStyle(fontSize =  18.sp),
            placeholder = { Text(text = "Пароль")},
            modifier = Modifier.size(350.dp, 60.dp)
                .clip(RoundedCornerShape(5.dp)), colors = TextFieldDefaults.textFieldColors(backgroundColor = White, cursorColor = Color.Black, unfocusedIndicatorColor = Color.Transparent, focusedIndicatorColor = Color.Transparent)
        )
    }
}

@Composable
fun TrxtView11() {
    Column(modifier = Modifier.padding(top = 10.dp, end = 20.dp).offset(x = 20.dp,y = 115.dp)) {
        val message = remember{mutableStateOf("")}
        TextField(
            message.value,
            {message.value = it},
            textStyle = TextStyle(fontSize =  18.sp),
            placeholder = { Text(text = "Имя пользователя")},
            modifier = Modifier.size(350.dp, 60.dp)
                .clip(RoundedCornerShape(5.dp)), colors = TextFieldDefaults.textFieldColors(backgroundColor = White, cursorColor = Color.Black, unfocusedIndicatorColor = Color.Transparent, focusedIndicatorColor = Color.Transparent)
        )
    }
}
@Composable
fun email() {
    Column(modifier = Modifier.padding(top = 10.dp, end = 20.dp).offset(x = 20.dp,y = 120.dp)) {
        val message = remember{ mutableStateOf("") }
        TextField(
            message.value,
            {message.value = it},
            textStyle = TextStyle(fontSize =  18.sp),
            placeholder = { Text(text = "Адрес электронной почты")},
            modifier = Modifier.size(350.dp, 60.dp)
                .clip(RoundedCornerShape(5.dp)), colors = TextFieldDefaults.textFieldColors(backgroundColor = White, cursorColor = Color.Black, unfocusedIndicatorColor = Color.Transparent, focusedIndicatorColor = Color.Transparent)
        )
    }
}

@Composable
fun ButtonFor511() {
    val context = LocalContext.current
    val White1: Color = White
    androidx.compose.material.Button(
        onClick = { val inte = Intent(context, Profile::class.java)
            ContextCompat.startActivity(context, inte, null) }, colors = ButtonDefaults.buttonColors(
            backgroundColor = LightGreen, contentColor = DarkGreen
        ), modifier = Modifier
            .size(350.dp, 60.dp)
            .offset(x = 20.dp, y = (150).dp)
            .background(color = Green1), shape = RoundedCornerShape(15.dp)
    ) {
        Text(
            "Регистрация",
            fontSize = 20.sp,
            color = White1
        )
    }
}


@Composable
fun ImageFor511() {
    val context = LocalContext.current
    androidx.compose.foundation.Image(
        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.backbutton)),
        contentDescription = "назад",
        modifier = Modifier
            .size(60.dp)
            .offset(x = (325).dp, y = (5).dp)
            .clickable(
                onClick = {
                    val inte = Intent(context, Profile::class.java)
                    ContextCompat.startActivity(context, inte, null )
                }
            )
    )
}


@Composable
fun TextFor511() {
    val White1: Color = White
    Text(
        "Регистрация",
        fontSize = 30.sp,
        modifier = Modifier.offset(x = 10.dp, y = (-50).dp),
        color = White1,
        fontWeight = FontWeight.Bold
    )
}