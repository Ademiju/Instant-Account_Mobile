package com.anonymous.instantaccount
//
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import com.anonymous.instantaccount.auth.AuthenticationWrapper
//import com.anonymous.instantaccount.auth.viewmodels.AuthViewModel
//import androidx.hilt.navigation.compose.hiltViewModel
//
//@Composable
//fun InstaAccountSwitch(
//    authViewModel: AuthViewModel = hiltViewModel()
//){
//    val isAuthenticated = authViewModel.state.value.isAuthenticated
//
//    if(isAuthenticated){
//        Column(
//            modifier = Modifier.fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ) {
//            Text(text = "Welcome")
//        }
//    } else {
//        AuthenticationWrapper(
//            viewModel = authViewModel
//        )
//    }
//}