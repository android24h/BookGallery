package com.hoseinvand.jetpack.myapplication.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hoseinvand.jetpack.myapplication.R
import com.hoseinvand.jetpack.myapplication.data.ChildDataClass
import com.hoseinvand.jetpack.myapplication.data.ParentDataClass

private val parentItemList = ArrayList<ParentDataClass>()


fun setData() {

    val images = listOf(
        ChildDataClass(R.drawable.book1),
        ChildDataClass(R.drawable.book2),
        ChildDataClass(R.drawable.book3),
        ChildDataClass(
            R.drawable.book4
        ), ChildDataClass(
            R.drawable.book5
        ), ChildDataClass(
            R.drawable.book6
        ), ChildDataClass(
            R.drawable.book7
        ), ChildDataClass(
            R.drawable.book8
        ), ChildDataClass(
            R.drawable.book9
        ), ChildDataClass(
            R.drawable.book10
        ), ChildDataClass(
            R.drawable.book11
        ), ChildDataClass(
            R.drawable.book12
        ), ChildDataClass(
            R.drawable.book13
        ), ChildDataClass(
            R.drawable.book14
        )
    )

    parentItemList.add(ParentDataClass("Novel", images))
    parentItemList.add(ParentDataClass("Best Seller:", images.shuffled()))
    parentItemList.add(ParentDataClass("History:", images.reversed()))
    parentItemList.add(ParentDataClass("Favorite:", images.shuffled()))
    parentItemList.add(ParentDataClass("Drama:", images))
    parentItemList.add(ParentDataClass("Crime:", images.reversed()))

}

@Composable
fun MyBookApp(modifier: Modifier = Modifier) {
    LazyColumn {
        items(parentItemList.size) { itemList ->
            CreateColumnUi( itemCount = itemList)

        }
    }

}

@Composable
fun CreateColumnUi(itemCount: Int) {
    Card(
        modifier=Modifier.padding(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.DarkGray)
    ) {
        Text(
            text = parentItemList[itemCount].title,
            modifier=Modifier.padding(12.dp),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFFFC107)
        )
        LazyRow(contentPadding = PaddingValues(12.dp)) {
            items(parentItemList[itemCount].childDataList.size) { itemChild ->
                CreateRowItem(itemChild, childList = parentItemList[itemCount].childDataList)

            }

        }

    }

}

@Composable
fun CreateRowItem(itemChild: Int,childList:List<ChildDataClass>) {
    Box(modifier = Modifier
        .height(200.dp)
        .width(160.dp)
        .padding(horizontal = 10.dp).clip(RoundedCornerShape(12.dp)).background(Color(0xF1201E1F))){
        Image(painter = painterResource(childList[itemChild].image),"", modifier = Modifier.fillMaxSize())

    }


    }


