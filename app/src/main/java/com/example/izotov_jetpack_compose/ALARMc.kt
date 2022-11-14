package com.example.izotov_jetpack_compose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.izotov_jetpack_compose.ui.theme.*

class ALARMc : ComponentActivity() {
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
                        ImageFor6l()
                        TextFor6l()
                        Row {
                            clock_a()
                            calend_a()
                        }
                        Row {
                            Cheks()
                        }
                        Row {
                            ButtonFor6l()
                        }
                        Row{
                            ButtonFor6_1l()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun clock_a() {
    Column(modifier = Modifier.padding(top = 10.dp, end = 20.dp).offset(x = 20.dp, (-30).dp)) {
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
fun calend_a() {
    Column(modifier = Modifier.padding(top = 10.dp, end = 20.dp).offset(x = 0.dp, (-45).dp)) {
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
fun Cheks() {
    Column(modifier = Modifier.offset(20.dp, (-30).dp)) {
        Text(
            "Повторять каждый",
            fontSize = 16.sp,
            color = Gray1,
            modifier = Modifier
                .padding(bottom = 20.dp, top = 20.dp)
                .offset(0.dp)
        )
        Row(modifier = Modifier.offset(y = 0.dp)) {
            val isChecked = remember { mutableStateOf(false) }
            Checkbox(
                checked = isChecked.value,
                onCheckedChange = { isChecked.value = it },
                enabled = true,
                modifier = Modifier
                    .border(3.dp, Orange, RoundedCornerShape(0.dp))
                    .background(White, RoundedCornerShape(0.dp))
                    .size(21.dp, 21.dp)
            )
            Text(
                text = "Понедельник",
                color = White,
                modifier = Modifier
                    .offset(x = 10.dp)
            )
        }
        Row(modifier = Modifier.offset(y = 10.dp)) {
            val isChecked2 = remember { mutableStateOf(false) }
            Checkbox(
                checked = isChecked2.value,
                onCheckedChange = { isChecked2.value = it },
                enabled = true,
                modifier = Modifier
                    .border(3.dp, Orange, RoundedCornerShape(0.dp))
                    .background(White, RoundedCornerShape(0.dp))
                    .size(21.dp, 21.dp)
            )
            Text(
                text = "Вторник",
                color = White,
                modifier = Modifier
                    .offset(x = 10.dp)
            )
        }
        Row(modifier = Modifier.offset(y = 20.dp)) {
            val isChecked3 = remember { mutableStateOf(false) }
            Checkbox(
                checked = isChecked3.value,
                onCheckedChange = { isChecked3.value = it },
                enabled = true,
                modifier = Modifier
                    .border(3.dp, Orange, RoundedCornerShape(0.dp))
                    .background(White, RoundedCornerShape(0.dp))
                    .size(21.dp, 21.dp)
            )
            Text(
                text = "Среда",
                color = White,
                modifier = Modifier
                    .offset(x = 10.dp)
            )
        }
        Row(modifier = Modifier.offset(y = 30.dp)) {
            val isChecked4 = remember { mutableStateOf(false) }
            Checkbox(
                checked = isChecked4.value,
                onCheckedChange = { isChecked4.value = it },
                enabled = true,
                modifier = Modifier
                    .border(3.dp, Orange, RoundedCornerShape(0.dp))
                    .background(White, RoundedCornerShape(0.dp))
                    .size(21.dp, 21.dp)
            )
            Text(
                text = "Четверг",
                color = White,
                modifier = Modifier
                    .offset(x = 10.dp)
            )
        }
        Row(modifier = Modifier.offset(y = 40.dp)) {
            val isChecked5 = remember { mutableStateOf(false) }
            Checkbox(
                checked = isChecked5.value,
                onCheckedChange = { isChecked5.value = it },
                enabled = true,
                modifier = Modifier
                    .border(3.dp, Orange, RoundedCornerShape(0.dp))
                    .background(White, RoundedCornerShape(0.dp))
                    .size(21.dp, 21.dp)
            )
            Text(
                text = "Пятница",
                color = White,
                modifier = Modifier
                    .offset(x = 10.dp))
        }
        Row(modifier = Modifier.offset(y = 50.dp)) {
            val isChecked6 = remember { mutableStateOf(false) }
            Checkbox(
                checked = isChecked6.value,
                onCheckedChange = { isChecked6.value = it },
                enabled = true,
                modifier = Modifier
                    .border(3.dp, Orange, RoundedCornerShape(0.dp))
                    .background(White, RoundedCornerShape(0.dp))
                    .size(21.dp, 21.dp)
            )
            Text(text = "Суббота",
                color = White,
                modifier = Modifier
                    .offset(x = 10.dp))
        }
        Row(modifier = Modifier.offset(y = 60.dp)) {
            val isChecked7 = remember { mutableStateOf(false) }
            Checkbox(
                checked = isChecked7.value,
                onCheckedChange = { isChecked7.value = it },
                enabled = true,
                modifier = Modifier
                    .border(3.dp, Orange, RoundedCornerShape(0.dp))
                    .background(White, RoundedCornerShape(0.dp))
                    .size(21.dp, 21.dp)
            )
            Text(text = "Воскресенье",
                color = White,
                modifier = Modifier
                    .offset(x = 10.dp))
        }
    }
}


@Composable
fun ButtonFor6l() {
    val context = LocalContext.current
    Button(
        onClick = { val inte = Intent(context, MainActivity::class.java)
            ContextCompat.startActivity(context, inte, null ) }, colors = ButtonDefaults.buttonColors(
            backgroundColor = LightGreen, contentColor = DarkGreen
        ), modifier = Modifier
            .size(350.dp, 60.dp)
            .offset(x = 23.dp, y = (190).dp)
            .background(color = Green1), shape = RoundedCornerShape(15.dp)
    ) {
        Text(
            "Сохранить будильник",
            fontSize = 20.sp,
            color = White
        )
    }
}

@Composable
fun ImageFor6l() {
    val context = LocalContext.current
    androidx.compose.foundation.Image(
        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.backbutton)),
        contentDescription = "аватар",
        modifier = Modifier
            .size(60.dp)
            .offset(x = (335).dp, y = (5).dp)
            .clickable(
                onClick = {
                    val inte = Intent(context, MainActivity::class.java)
                    ContextCompat.startActivity(context, inte, null )
                }
            )
    )
}


@Composable
fun TextFor6l() {
    Text(
        "Изменить будильник",
        fontSize = 25.sp,
        modifier = Modifier.offset(x = 24.dp, y = (-50).dp),
        color = White,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun ButtonFor6_1l() {
    val context = LocalContext.current
    Button(
        onClick = { val inte = Intent(context, MainActivity::class.java)
            ContextCompat.startActivity(context, inte, null ) }, colors = ButtonDefaults.buttonColors(
            backgroundColor = Red1, contentColor = Red2
        ), modifier = Modifier
            .size(350.dp, 60.dp)
            .offset(x = 23.dp, y = (60).dp)
            .background(color = Green1), shape = RoundedCornerShape(15.dp)
    ) {
        Text(
            "Удалить будильник",
            fontSize = 20.sp,
            color = White
        )
    }
}
