package com.hoseinvand.jetpack.myapplication.Screen.finalBook

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
fun loadingData() {
    val image = listOf(
        ChildDataClass(R.drawable.book1),
        ChildDataClass(R.drawable.book2),
        ChildDataClass(R.drawable.book3),
        ChildDataClass(R.drawable.book4),
        ChildDataClass(R.drawable.book5),
        ChildDataClass(R.drawable.book6),
        ChildDataClass(R.drawable.book7),
        ChildDataClass(R.drawable.book8),
        ChildDataClass(R.drawable.book9),
        ChildDataClass(R.drawable.book10),
        ChildDataClass(R.drawable.book11),
        ChildDataClass(R.drawable.book12),
        ChildDataClass(R.drawable.book13),
        ChildDataClass(R.drawable.book14)
    )
    parentItemList.add(ParentDataClass("Novel:", image))
    parentItemList.add(ParentDataClass("Best Seller:", image.shuffled()))
    parentItemList.add(ParentDataClass("History:", image.reversed()))
    parentItemList.add(ParentDataClass("Favorite:", image))
    parentItemList.add(ParentDataClass("Drama:", image.shuffled()))
    parentItemList.add(ParentDataClass("Crime:", image.reversed()))
}

@Composable
fun PreviewBook(modifier: Modifier = Modifier) {
    LazyColumn() {
        items(parentItemList.size) { itemParent ->
            CreateColumUi(itemCount = itemParent, parentItemList = parentItemList)

        }
    }

}

@Composable
fun CreateColumUi(itemCount: Int, parentItemList: java.util.ArrayList<ParentDataClass>) {

    Card(
        modifier = Modifier.padding(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.DarkGray)
    ) {
        Text(
            modifier = Modifier.padding(12.dp),
            text = parentItemList[itemCount].title,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = Color(
                0xFFFFC107
            )
        )
        LazyRow(contentPadding = PaddingValues(12.dp)) {
            items(parentItemList[itemCount].childDataList.size) { itemChild ->
                CreateRowImage(itemChild, parentItemList[itemCount].childDataList)

            }
        }


    }
}

@Composable
fun CreateRowImage(itemChild: Int, childDataList: List<ChildDataClass>) {
    Box(modifier = Modifier
        .height(200.dp)
        .width(160.dp)
        .padding(horizontal = 10.dp)
        .clip(RoundedCornerShape(12.dp))
        .background(Color(0xF1201E1F))) {
        Image(
            painter = painterResource(childDataList[itemChild].image),
            "",
            modifier = Modifier.fillMaxSize()
        )
    }

}

