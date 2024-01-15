package com.example.buisnesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buisnesscard.ui.theme.BuisnessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuisnessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color=Color(0xFFCADBC8),
                ) {
                    Business()
                    Business2()
                }
            }
        }
    }
}

@Composable
fun Business() {
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally, modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)){
        Image(
            painter= painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
                .border(1.dp, MaterialTheme.colorScheme.secondary, CircleShape)
        )
        Text(
            text="Abhinav Singh",
            color= Color.Black,
            fontSize = 50.sp,
            fontWeight= androidx.compose.ui.text.font.FontWeight.Thin,
        )
        Text(
            text="Android Developer",
            color= Color(0xFF3ddc84),
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
        )
    }
}

@Composable
fun Business2() {
    Column(verticalArrangement=Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally, ){
    Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom ){
        Image(
            painter= painterResource(id = R.drawable.call_icon_2048x2048_9fglrllu),
            contentDescription = null,
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)

        )
        Text(
            text="+91 1234567890",
            color= Color.Black,
            fontSize = 20.sp,
            fontWeight= androidx.compose.ui.text.font.FontWeight.Thin,
        )

    }
    Row(){
        Image(
            painter= painterResource(id = R.drawable.images),
            contentDescription = null,
            modifier=Modifier
                .size(30.dp)
                .clip(CircleShape)

        )
        Text(
            text="abc@gmail.com",
            color=Color.Black,
            fontSize=20.sp,
            fontWeight = FontWeight.Thin,
        )
    }
}
}
@Preview(showBackground = true)
@Composable
fun BusinessPreview() {
    BuisnessCardTheme {
        Business()
        Business2()
    }
}