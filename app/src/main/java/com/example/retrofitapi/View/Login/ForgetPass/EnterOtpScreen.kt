package com.example.retrofitapi.View.Login.ForgetPass

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun EnterOtpScreen() {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Enter OTP")
        OtpInputRow()
        
        Button(onClick = { /*TODO*/ }) {
            Text("Submit")
        }
        Row {
            Text(text = "Didn't get otp?")
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Resend")
            } 
        }
        
    }
}

@Composable
fun OtpInputRow() {
    var text1 by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    var text3 by remember { mutableStateOf("") }
    var text4 by remember { mutableStateOf("") }

    val focusRequester1 = remember { FocusRequester() }
    val focusRequester2 = remember { FocusRequester() }
    val focusRequester3 = remember { FocusRequester() }
    val focusRequester4 = remember { FocusRequester() }

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        OtpTextField(
            value = text1,
            onValueChange = { newValue ->
                if (newValue.length <= 1) text1 = newValue
                if (newValue.isNotEmpty()) focusRequester2.requestFocus()
            },
            focusRequester = focusRequester1,
            onBackspace = { focusRequester1.requestFocus() }
        )
        OtpTextField(
            value = text2,
            onValueChange = { newValue ->
                if (newValue.length <= 1) text2 = newValue
                if (newValue.isNotEmpty()) focusRequester3.requestFocus()
            },
            focusRequester = focusRequester2,
            onBackspace = { focusRequester1.requestFocus() }
        )
        OtpTextField(
            value = text3,
            onValueChange = { newValue ->
                if (newValue.length <= 1) text3 = newValue
                if (newValue.isNotEmpty()) focusRequester4.requestFocus()
            },
            focusRequester = focusRequester3,
            onBackspace = { focusRequester2.requestFocus() }
        )
        OtpTextField(
            value = text4,
            onValueChange = { newValue ->
                if (newValue.length <= 1) text4 = newValue
            },
            focusRequester = focusRequester4,
            onBackspace = { focusRequester3.requestFocus() }
        )
    }
}

@Composable
fun OtpTextField(
    value: String,
    onValueChange: (String) -> Unit,
    focusRequester: FocusRequester,
    onBackspace: () -> Unit
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier
            .width(65.dp)
            .padding(8.dp)
            .focusRequester(focusRequester)
            .onKeyEvent { keyEvent ->
                if (keyEvent.key == Key.Backspace && value.isEmpty()) {
                    onBackspace()
                    true
                } else {
                    false
                }
            },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        singleLine = true
    )
}
