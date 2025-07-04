package com.hoseinvand.jetpack.myapplication.Screen.arowanaCatalog

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.hoseinvand.jetpack.myapplication.R

@Composable
fun Nav(modifier: Modifier = Modifier) {
    val navController= rememberNavController()

    NavHost(navController=navController, startDestination = "Home") {
        composable(route="Home") {
            MainArowana(navController=navController)
        }

        composable(route="Detail/{count}",

            arguments = listOf(
                navArgument(name = "count"){
                    type=NavType.IntType
                }
            )


            ){
            val count= it.arguments?.getInt("count")
            if (count!=null){
                val myData= listOf(
                    ArowanaDataClass(
                        image = R.drawable.pic1,
                        title = "Arowana Red",
                        description = stringResource(R.string.arowanaRed)
                    ),
                    ArowanaDataClass(
                        image = R.drawable.pic2,
                        title = "Arowana Red Chili",
                        description = stringResource(R.string.arowana_redChili)
                    ),
                    ArowanaDataClass(
                        image = R.drawable.pic3,
                        title = "Arowana Silver",
                        description = stringResource(R.string.arowana_Silver)
                    ),
                    ArowanaDataClass(
                        image = R.drawable.pic4,
                        title = "Arowana Albino",
                        description = stringResource(R.string.arowana_Albino)
                    ),
                    ArowanaDataClass(
                        image = R.drawable.pic5,
                        title = "Arowana Black",
                        description = stringResource(R.string.arowana_Black)
                    ),
                    ArowanaDataClass(
                        image = R.drawable.pic6,
                        title = "Arowana Gold",
                        description = stringResource(R.string.arowana_Gold)
                    )
                )
                 DetailArowana(count,myData)

            }
        }
    }

}