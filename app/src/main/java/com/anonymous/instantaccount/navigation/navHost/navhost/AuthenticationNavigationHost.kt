package com.anonymous.instantaccount.navigation.navHost.navhost
//
//import androidx.compose.runtime.Composable
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import com.anonymous.instantaccount.ui.Login
//import com.anonymous.instantaccount.auth.screens.Register
//import com.anonymous.instantaccount.auth.viewmodels.AuthViewModel
//import com.anonymous.instantaccount.navigation.destinations.Destination
//
//@Composable
//fun AuthenticationNavigationHost(navHostController: NavHostController,authViewModel: AuthViewModel){ //NavHostController
//
//    NavHost(
//        navController = navHostController,
//        startDestination = Destination.LoginDestination.route){
//        composable(route = Destination.LoginDestination.route){
//
//            Login(navController = navHostController, authViewModel = authViewModel)
//        }
//        composable(route = Destination.SignUpDestination.route){
//
//            Register(navController = navHostController)
//        }
//    }
//}
