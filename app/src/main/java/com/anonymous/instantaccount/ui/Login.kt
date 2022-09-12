package com.anonymous.instantaccount.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.anonymous.instantaccount.R


@Composable
fun Login() {

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
    ) {
        var email by remember {
            mutableStateOf(TextFieldValue())
        }
        var password by remember {
            mutableStateOf(TextFieldValue())
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.2f),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = ""
            )
        }
        Text(
            text = "Login",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Enter your Email and Password",
            fontSize = 16.sp,
            color = Color(0xFF7C7C7C)
        )
        Spacer(modifier = Modifier.height(20.dp))

        TextField(value = email,
            onValueChange = {
                email = it
            },
            label = {Text(text = "Email Address")})
        Spacer(modifier = Modifier.height(20.dp))

        TextField(value = password,
            onValueChange = {
                password = it
            },
            label = {Text(text = "Password")})

        Spacer(modifier = Modifier.height(10.dp))
        TextButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Forgot Password ?")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {},
            modifier = Modifier.width(280.dp)) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(20.dp))
        TextButton(
            onClick = {},
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Don't have an account, Click to SignUp")

        }


    }

}
    @Preview(showBackground = true)
    @Composable
            fun PreviewLogin(){

                Login()
            }
