package com.hoseinvand.jetpack.myapplication.Screen.CheckBox

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


data class ItemCheckBox(
    val id: Int,
    val name: String
)

@Composable
fun CheckBoxExample(modifier: Modifier = Modifier) {
    val state = remember { mutableStateListOf<Int>(0) }

    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val myData = listOf(
            ItemCheckBox(
                id = 1,
                name = "Alireza"
            ),
            ItemCheckBox(
                id = 2,
                name = "Saeid"
            ),
            ItemCheckBox(
                id = 3,
                name = "Vahid"
            ),
            ItemCheckBox(
                id = 4,
                name = "Morteza"
            )
        )

        myData.forEach {
            Row(
                modifier
                    .fillMaxWidth()
                    .toggleable(
                        value = state.contains(it.id),
                        onValueChange = { checked ->
                            if (checked) {
                                state.add(it.id)
                            } else {
                                state.remove(it.id)
                            }
                        }
                    )

            ) {
                Checkbox(
                    checked = state.contains(it.id),
                    onCheckedChange = null
                )
                Text(it.name)

            }
        }

    }


}

@Composable
fun RadioExample(modifier: Modifier = Modifier) {


}