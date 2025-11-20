package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.presentation.catalog.CatalogScreen
import com.example.myapplication.presentation.main.MainScreen
import com.example.myapplication.presentation.profile.ProfileScreen
import com.example.myapplication.presentation.projects.ProjectsScreen
import com.example.myapplication.presentation.signin.SignInScreen
import com.example.myapplication.ui.theme.MyApplicationTheme

sealed class Route(val route: String) {
    data object Main : Route("main")
    data object Catalog : Route("catalog")
    data object Projects : Route("projects")
    data object Profile : Route("profile")
    data object SignIn : Route("sign_in")
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                val navController = rememberNavController()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(navController, startDestination = Route.SignIn.route, modifier = Modifier.Companion.padding(innerPadding)) {
                        composable(Route.Main.route) {
                            MainScreen(navController)
                        }
                        composable(Route.Catalog.route) {
                            CatalogScreen(navController)
                        }
                        composable(Route.Projects.route) {
                            ProjectsScreen(navController)
                        }
                        composable(Route.Profile.route) {
                            ProfileScreen(navController)
                        }
                        composable(Route.SignIn.route) {
                            SignInScreen(navController)
                        }
                    }
                }
            }
        }
    }
}