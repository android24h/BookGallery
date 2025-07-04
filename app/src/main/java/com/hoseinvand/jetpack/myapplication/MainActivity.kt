package com.hoseinvand.jetpack.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.hoseinvand.jetpack.myapplication.Screen.BottomNavigasionEx
import com.hoseinvand.jetpack.myapplication.Screen.CheckBox.CheckBoxExample
import com.hoseinvand.jetpack.myapplication.Screen.DetailScreen
import com.hoseinvand.jetpack.myapplication.Screen.MyApp
import com.hoseinvand.jetpack.myapplication.Screen.MyBookApp
import com.hoseinvand.jetpack.myapplication.Screen.PizzaMenu
import com.hoseinvand.jetpack.myapplication.Screen.arowanaCatalog.MainArowana
import com.hoseinvand.jetpack.myapplication.Screen.arowanaCatalog.Nav
import com.hoseinvand.jetpack.myapplication.Screen.finalBook.PreviewBook
import com.hoseinvand.jetpack.myapplication.Screen.finalBook.loadingData
import com.hoseinvand.jetpack.myapplication.Screen.setData
import com.hoseinvand.jetpack.myapplication.data.DataModel

class MainActivity : ComponentActivity() {

    @SuppressLint("UnrememberedMutableState")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color(0xF11F1D1E)
            ) {
                loadingData()
                PreviewBook()

            }


        }
    }
}
