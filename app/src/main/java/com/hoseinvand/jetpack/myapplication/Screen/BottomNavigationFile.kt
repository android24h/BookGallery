package com.hoseinvand.jetpack.myapplication.Screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

data class NavItem(
    val title: String,
    val selectedIcon: ImageVector,
    val route: String,
    val unSelectedIcon: ImageVector,
    val hasBadge: Boolean,
    val badgeNumber: Int
)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BottomNavigasionEx(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    val myData = listOf(
        NavItem(
            title = "Home",
            route = "Home",
            selectedIcon = Icons.Default.Home,
            unSelectedIcon = Icons.Outlined.Home,
            hasBadge = false,
            badgeNumber = 0
        ),
        NavItem(
            title = "Face",
            route = "Face",
            selectedIcon = Icons.Default.Home,
            unSelectedIcon = Icons.Outlined.Home,
            hasBadge = false,
            badgeNumber = 0
        ),
        NavItem(
            title = "Basket",
            route = "Basket",
            selectedIcon = Icons.Default.Home,
            unSelectedIcon = Icons.Outlined.Home,
            hasBadge = false,
            badgeNumber = 0
        )
    )



    Scaffold(
        bottomBar = {
            NavigationBar(modifier.padding(10.dp),containerColor = Color(0xFFFFD600)) {
                val backStack = navController.currentBackStackEntryAsState()
                val currentRoue = backStack.value?.destination?.route
                myData.forEach {
                    NavigationBarItem(
                        selected = currentRoue == it.route,
                        onClick = {
                            if (currentRoue != it.route) {
                                navController.navigate(it.route)
                            }
                        },
                        icon = {
                            Icon(
                                imageVector = if (currentRoue == it.route) it.selectedIcon else it.unSelectedIcon,
                                ""
                            )

                        },
                        label = {
                            Text(text = it.route)
                        },
                        colors =NavigationBarItemDefaults.colors(
                            indicatorColor = Color(0xFF9E8E3D)
                        )
                    )
                }
            }
        }
    ) {
        NavHost(navController=navController, startDestination = "Home") {
            composable(route="Home"){
                Page1()

            }
            composable(route="Face"){
                Page2()
            }

            composable(route="Basket"){
                Page3()
            }
        }

    }

}