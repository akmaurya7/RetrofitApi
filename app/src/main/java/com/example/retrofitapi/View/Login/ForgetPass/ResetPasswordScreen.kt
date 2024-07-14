package com.example.retrofitapi.View.Login.ForgetPass

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ResetPasswordScreen() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Text(text = "Reset Password")

        var newPass by remember  { mutableStateOf("") }
        OutlinedTextField(
            value = newPass,
            onValueChange = {newPass = it},
            label = { Text(text = "New Password")}
        )
        
        var confirmPass by remember  { mutableStateOf("") }
        OutlinedTextField(
            value = newPass,
            onValueChange = {confirmPass = it},
            label = { Text(text = "Confirm Password")}
        )
        
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Continue")
        }

    }
}