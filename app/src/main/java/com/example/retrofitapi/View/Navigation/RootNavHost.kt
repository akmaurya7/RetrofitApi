package com.example.retrofitapi.View.Navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.retrofitapi.View.GetStartedScreen
import com.example.retrofitapi.View.HomeScreen.AllCategoryScreen
import com.example.retrofitapi.View.HomeScreen.AllProductScreen
import com.example.retrofitapi.View.HomeScreen.HomePage
import com.example.retrofitapi.View.Login.LoginScreen
import com.example.retrofitapi.View.Login.SignUp.SignUpScreen
import com.example.retrofitapi.ViewModel.ProductViewModel

@Composable
fun RootNavHost(){
    val productVM: ProductViewModel = viewModel()
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.GetStartedScreen) {
        composable(Routes.GetStartedScreen){
            GetStartedScreen(navController = navController)
        }
        composable(Routes.LoginScreen){
            LoginScreen(navController = navController)
        }
        composable(Routes.SignUpScreen){
            SignUpScreen(navController = navController)
        }
        composable(Routes.HomeScreen){
            HomePage(navController = navController, viewModel = productVM)
        }
        composable(Routes.AllProductScreen) {
            AllProductScreen(navController = navController, viewModel = productVM)
        }
        composable(Routes.AllCategoryScreen + "/{data}"){
            val data = it.arguments?.getString("data")
            AllCategoryScreen(navController = navController, viewModel = productVM, data = data)
        }
    }
}
