package com.example.retrofitapi.View.Login.ForgetPass

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ForgetPasswordScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Forget Password?")
        var email by remember { mutableStateOf("") }
        TextField(
            value = email,
            onValueChange = {email = it},
            label = { Text(text = "Email")}
        )
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Send OTP")
        }
        TextButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription ="" )
            Text(text = "Back to Login")

        }
    }
}