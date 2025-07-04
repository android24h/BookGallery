package com.hoseinvand.jetpack.myapplication.Screen.arowanaCatalog

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.hoseinvand.jetpack.myapplication.R

data class ArowanaDataClass(
    val image:Int,
    val title:String,
    val description:String
)

@Composable
fun MainArowana(modifier: Modifier = Modifier, navController: NavHostController) {

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

    LazyColumn {
        items(myData.size){itemData->
            ColumnDesign(count=itemData,data=myData,navController=navController)

        }

    }

}

@Composable
fun ColumnDesign(
    count: Int,
    data: List<ArowanaDataClass>,
    navController: NavHostController
) {
    Card(
        modifier = Modifier
            .clickable {
                navController.navigate("Detail/$count")

            }
            .padding(10.dp)
            .wrapContentSize(),
        colors = CardDefaults.cardColors(containerColor = Color(0xffffffff)),
        elevation = CardDefaults.cardElevation(10.dp)

    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(data[count].image),"", modifier = Modifier.size(140.dp))
            Column(modifier = Modifier.fillMaxSize().padding(10.dp)) {
                Text(text = data[count].title, fontSize = 25.sp, fontWeight = FontWeight.Bold)
                Text(text = data[count].description, fontSize = 18.sp)
            }
        }
    }

}
