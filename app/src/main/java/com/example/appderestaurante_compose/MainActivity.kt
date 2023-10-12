package com.example.appderestaurante_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.example.appderestaurante_compose.list_item.FoodItem
import com.example.appderestaurante_compose.model.Food
import com.example.appderestaurante_compose.ui.theme.AppDeRestauranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodList()
        }
    }
}

@Composable
private fun FoodList() {
    val foodList: MutableList<Food> = mutableListOf(
        Food(
            imgFood = R.drawable.food1,
            foodName = "Food 1",
            foodDescription = "Loren ipsun wdwd dawdd wadwdwdd wdadwadw wdawdm wdaddwd, dwwdadw wd,d wdaw",
            price = "$ 120.00"
        ),
        Food(
            imgFood = R.drawable.food2,
            foodName = "Food 2",
            foodDescription = "Loren ipsun wdwd dawdd wadwdwdd wdadwadw wdawdm wdaddwd, dwwdadw wd,d wdaw",
            price = "$ 135.00"
        ),
        Food(
            imgFood = R.drawable.food3,
            foodName = "Food 3",
            foodDescription = "Loren ipsun wdwd dawdd wadwdwdd wdadwadw wdawdm wdaddwd, dwwdadw wd,d wdaw",
            price = "$ 110.00"
        ),
        Food(
            imgFood = R.drawable.food4,
            foodName = "Food 4",
            foodDescription = "Loren ipsun wdwd dawdd wadwdwdd wdadwadw wdawdm wdaddwd, dwwdadw wd,d wdaw",
            price = "$ 75.00"
        ),
        Food(
            imgFood = R.drawable.food5,
            foodName = "Food 5",
            foodDescription = "Loren ipsun wdwd dawdd wadwdwdd wdadwadw wdawdm wdaddwd, dwwdadw wd,d wdaw",
            price = "$ 112.00"
        )
    );
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        LazyColumn{
            itemsIndexed(foodList) { position, food ->
                FoodItem(food)
            }
        }
    }
}

