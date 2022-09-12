package com.anonymous.instantaccount.navigation.navHost.navhost

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.anonymous.instantaccount.navigation.destinations.PrimaryDestination
//import com.example.instantaccount.Cart.screens.Cart
//import com.example.instantaccount.Explore.screen.Explore
//import com.example.instantaccount.Favorite.screens.Favorite
//import com.example.instantaccount.Profile.screens.Profile
//import com.anonymous.instantaccount.general.components.BottomNavBar

//
//@Composable
//fun ApplicationNavigationHost(){
//    val navController = rememberNavController()    //creating the navigation controller instance
//    Scaffold(
//        bottomBar = {
//            BottomNavBar(
//                modifier = Modifier.fillMaxWidth(),
//                navController = navController) //passing the controlling to the bottom Navbar
//        }
//    ) {
//        NavHost(
//            navController = navController,
//            startDestination =  PrimaryDestination.Store.startRoute
//
//        ){
//            composable(route = PrimaryDestination.Store.startRoute){
//                Store()
//            }
//            composable(route = PrimaryDestination.Explore.startRoute){
//                Explore()
//            }
//            composable(route = PrimaryDestination.Favorite.startRoute){
//                Favorite()
//            }
//            composable(route = PrimaryDestination.Cart.startRoute){
//                Cart()
//            }
//            composable(route = PrimaryDestination.Profile.startRoute){
//                Profile()
//            }
//        }
//    }
//}
//
//@Composable
//fun Favorite() {
//    Column(
//        modifier = Modifier.fillMaxWidth(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment =  Alignment.CenterHorizontally
//    ) {
//        Text(text = "Favorite")
//
//    }
//}
//
//@Composable
//fun Profile() {
//    Column(
//        modifier = Modifier.fillMaxWidth(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment =  Alignment.CenterHorizontally
//    ) {
//        Text(text = "Profile")
//
//    }
//}
//
//@Composable
//fun Cart() {
//    Column(
//        modifier = Modifier.fillMaxWidth(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment =  Alignment.CenterHorizontally
//    ) {
//        Text(text = "Cart")
//
//    }
//}
//
//@Composable
//fun Explore() {
//    Column(
//        modifier = Modifier.fillMaxWidth(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment =  Alignment.CenterHorizontally
//    ) {
//        Text(text = "Explore")
//
//    }
//}
//
//@Composable
//fun Store() {
//    Column(
//        modifier = Modifier.fillMaxWidth(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment =  Alignment.CenterHorizontally
//    ) {
//        Text(text = "Store")
//
//    }
//}
