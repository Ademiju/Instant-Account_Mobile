package com.anonymous.instantaccount

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.anonymous.instantaccount.ui.Signup
import com.anonymous.instantaccount.ui.theme.InstantAccountTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstantAccountTheme {
                Signup()
            }
        }
    }
}


