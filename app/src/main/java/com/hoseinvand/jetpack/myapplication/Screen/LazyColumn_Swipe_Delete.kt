package com.hoseinvand.jetpack.myapplication.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.SwipeToDismissBox
import androidx.compose.material3.SwipeToDismissBoxValue
import androidx.compose.material3.Text
import androidx.compose.material3.rememberSwipeToDismissBoxState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    //یک لیست ساختیم که بهش میگن لیست واکنش گرا که هر آیتمی که ازش حذف شه. کامپوز مجدد خودشو می سازه
    var list = remember { mutableStateListOf("Saeid", "Alireza", "Karim", "Dariush") }

//ساخت یک لیزی کالوم
    LazyColumn(contentPadding = PaddingValues(10.dp), state = rememberLazyListState()) {


        items(
            count = list.size,
            key = { index ->
                list[index]
            }

        ) { index ->
            val item = list[index]
            val dissmissState = rememberSwipeToDismissBoxState(
                confirmValueChange = { value ->
                    if (value == SwipeToDismissBoxValue.EndToStart) {
                        list.remove(item)
                        true
                    } else false
                }

            )
            SwipeToDismissBox(
                state = dissmissState, backgroundContent = {
                   val direction=dissmissState.dismissDirection
                    val color=when(direction){
                        SwipeToDismissBoxValue.StartToEnd -> Color.Blue
                        SwipeToDismissBoxValue.EndToStart -> Color.Red
                        else->Color.Transparent
                    }

                    val icon=when(direction){
                        SwipeToDismissBoxValue.StartToEnd -> Icons.Default.Edit
                        SwipeToDismissBoxValue.EndToStart -> Icons.Default.Delete
                        else->null
                    }

                    val aligment=when(direction){
                        SwipeToDismissBoxValue.StartToEnd -> Alignment.CenterStart
                        SwipeToDismissBoxValue.EndToStart -> Alignment.CenterEnd
                       else->Alignment.Center
                    }
                    Box(
                        modifier=Modifier
                            .fillMaxSize()
                            .background(color)
                            .padding(16.dp),
                        contentAlignment = aligment


                    ){
                        icon?.let {
                            Icon(imageVector = it, contentDescription = "")
                        }
                    }
                }
            )

            {
                ColumnUi(itemName = item)

            }

        }
    }
}

@Composable
fun ColumnUi(itemName: String) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 6.dp),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp), contentAlignment = Alignment.Center
        ) {
            Text(text = itemName, fontSize = 35.sp)
        }

    }
}
