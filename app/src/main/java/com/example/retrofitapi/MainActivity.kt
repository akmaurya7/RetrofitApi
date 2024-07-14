package com.example.retrofitapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.retrofitapi.View.Navigation.RootNavHost
import com.example.retrofitapi.ViewModel.ProductViewModel
import com.example.retrofitapi.ui.theme.RetrofitApiTheme


class MainActivity : ComponentActivity() {
    private val productVM : ProductViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            RetrofitApiTheme {
                RootNavHost()
            }
        }
    }
}

