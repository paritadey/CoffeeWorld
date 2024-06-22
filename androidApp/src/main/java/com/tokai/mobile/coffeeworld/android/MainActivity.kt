package com.tokai.mobile.coffeeworld.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import com.tokai.mobile.coffeeworld.Strings
import dev.icerock.moko.resources.StringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFFFFFFF)// MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(
                                id = com.tokai.mobile.coffeeworld.R.drawable.coffee
                            ),
                            contentDescription = null
                        )
                        /*Text(
                            text = stringResource(
                                id = SharedRes.strings.hello_world
                            )
                        )
                       */
                        TypewriterText(
                            texts = listOf(
                                "Hello Coffee-holics! 💜",
                                "Let's have a cup of coffee" ,
                                "And make your soul happy ! 👋 " ,
                                "\uD83E\uDD0E ☕ \uD83E\uDDCB "
                            ),
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun stringResource(id: StringResource, vararg args: Any): String {
    return Strings(LocalContext.current).get(id, args.toList())
}

