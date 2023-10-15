package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Top
                    ) {
                        GreetingImage()
                        GreetingText(message = "Happy Birthday Carmen🌟!", from = "From Luis")
                    }
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )

        val image = painterResource(id = R.drawable.androidparty)
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
    }
}


@Composable
fun GreetingImage() {
    val image = painterResource(id = R.drawable.androidparty)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Crop,
    )
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    val image = painterResource(id = R.drawable.androidparty)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Crop,
    )
    HappyBirthdayTheme {
        GreetingText(message = "Happy Birthday Carmen!", from = "From Luis")
    }

}