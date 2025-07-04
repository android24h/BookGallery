package com.hoseinvand.jetpack.myapplication.Me

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.hoseinvand.jetpack.myapplication.R
import com.hoseinvand.jetpack.myapplication.data.DataModel

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    val myData = listOf(
        DataModel(
            image = R.drawable.acd1,
            name = "SUPREME",
            material = "Pizza Supreme usually includes a combination of meat, vegetables, and cheese"
        ),
        DataModel(
            image = R.drawable.acd2,
            name = "SUPER SUPREME",
            material = "Pizza Supreme is typically made with pizza dough, special sauce, pizza cheese, and a combination of various meat and non-meat ingredients"
        ),
        DataModel(
            image = R.drawable.acd3,
            name = "CHEESE LOVER'S",
            material = "The main ingredients of a vegetable love pizza include pizza dough, marinara sauce or tomato sauce, pizza cheese (such as mozzarella and parmesan), and various vegetables"
        ),
        DataModel(
            image = R.drawable.acd4,
            name = "VEGGIE LOVER'S",
            material = "A \"cheese love\" pizza (probably meaning a pizza with a lot of cheese) generally consists of the following main ingredients: pizza dough, tomato sauce, mozzarella cheese"
        ),
        DataModel(
            image = R.drawable.acd5,
            name = "MEAT LOVER'S",
            material = "Meat Lover's Pizza is usually made with a combination of meat and cheese. The main ingredients of this pizza include pizza dough, tomato sauce, and meat"
        ),
        DataModel(
            image = R.drawable.acd6,
            name = "HAWAIIAN",
            material = "The main ingredients of Hawaiian pizza are pizza dough, tomato sauce, mozzarella cheese, ham (or bacon), and pineapple"
        )
    )

    LazyColumn {
        items(myData.size){items->
            ColumnItemUi(data=items,item=myData)
        }
    }
}

@Composable
fun ColumnItemUi(data: Int, item: List<DataModel>) {
    Card(modifier = Modifier.fillMaxSize()) {

    }
}












