package com.metehanbolat.isscrolledlazyliststatecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.isscrolledlazyliststatecompose.ui.theme.IsScrolledLazyListStateComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IsScrolledLazyListStateComposeTheme {

            }
        }
    }
}
