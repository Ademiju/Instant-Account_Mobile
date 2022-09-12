package com.anonymous.instantaccount.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import com.anonymous.instantaccount.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable

fun Signup() {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center) {
        var firstName by remember {
            mutableStateOf(TextFieldValue())
        }
        
        var confirmPassword by remember {
            mutableStateOf(TextFieldValue())
        }

        var lastName by remember {
            mutableStateOf(TextFieldValue())
        }

        var email by remember {
            mutableStateOf(TextFieldValue())
        }
        var password by remember {
            mutableStateOf(TextFieldValue())
        }

        Image(
            painter = painterResource(id = R.drawable.insta_account),
            contentDescription = "prof_pic",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(
                    width = 2.dp,
                    color = Color.Blue,
                    shape = CircleShape
                ),
            contentScale = ContentScale.Crop //makes the image fit into the circularShape

        )

        Text(text = "Register",
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold )
        Spacer(modifier = Modifier.height(30.dp))
        TextField(value = firstName,
            onValueChange = {
                firstName = it
            },
        label = {Text(text = "Firstname")}
        )
        Spacer(modifier = Modifier.height(10.dp))
        
        TextField(value = lastName,
            onValueChange = {
                lastName = it
            },
            label = {Text(text = "Lastname")})
        Spacer(modifier = Modifier.height(10.dp))
        
        TextField(value = email,
            onValueChange = {
                email = it
            },
            label = {Text(text = "Email address")})
        Spacer(modifier = Modifier.height(10.dp))
       
        TextField(value = password,
            onValueChange = {
                password = it
            },
            label = {Text(text = "Password")}
        )
        Spacer(modifier = Modifier.height(10.dp))
        
        TextField(value = confirmPassword,
            onValueChange = {
                confirmPassword = it
            },
            label = {Text(text = "Confirm password")}
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { /*TODO*/ },
        modifier = Modifier.width(280.dp)){
            Text(text = "Register")
        }
    }
    
    }

@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    Signup()
}
    
