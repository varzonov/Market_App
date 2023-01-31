package com.petproject.market

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.petproject.market.navigation.SetupNavGraph
import com.petproject.market.ui.theme.TestOrange


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
                setContent {
                        val navController = rememberNavController()
                        SetupNavGraph(navController = navController)
//                     Column(modifier = Modifier.fillMaxSize()) {
//                      hotSales()
//                      bestSeller()
//                                }
//                    explorer()
       }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun BestSeller () {
    BoxWithConstraints(
        Modifier
            .fillMaxWidth()
            .padding(bottom = 80.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth() ,verticalAlignment = Alignment.CenterVertically) {
            Box(Modifier.fillMaxWidth(0.5f), contentAlignment = Alignment.CenterStart) {
                Text(text = "Best Seller", textAlign = TextAlign.Left, fontSize = 25.sp, color = Color.Black,fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 10.dp, bottom = 5.dp, start = 10.dp))
            }
            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
                Text(text = "see more", textAlign = TextAlign.Right, fontSize = 15.sp, color = TestOrange, modifier = Modifier.padding(top = 10.dp, bottom = 5.dp, end = 20.dp))
            }

        }
        LazyVerticalGrid(cells = GridCells.Fixed(2),
                modifier = Modifier
                .padding (top = 50.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(5.dp)
        ){
            items (4) {
                BestSellerModel()
            }
        }
    }
}

@Composable
fun HotSales () {
BoxWithConstraints(
    Modifier
        .fillMaxWidth()
) {
    Row(modifier = Modifier.fillMaxWidth() ,verticalAlignment = Alignment.CenterVertically) {
        Box(Modifier.fillMaxWidth(0.5f), contentAlignment = Alignment.CenterStart) {
            Text(
                text = "Hot sales",
                textAlign = TextAlign.Left,
                fontSize = 25.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 10.dp, bottom = 5.dp, start = 10.dp)
            )
        }
        Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
            Text(
                text = "see more",
                textAlign = TextAlign.Right,
                fontSize = 15.sp,
                color = TestOrange,
                modifier = Modifier.padding(top = 10.dp, bottom = 5.dp, end = 20.dp)
            )
        }
    }
        LazyRow(modifier = Modifier
            .padding (top = 40.dp)) {
            itemsIndexed(
                listOf(
                    productSpec(1, true, title = "Iphone 12", subtitle = "Súper. Mega. Rápido.", picture = "http://t.me/hasthur"),
                        productSpec(2,true, title = "Iphone 11", subtitle = "Súper. Mega. Rápido.", picture = "http://t.me/hasthur") ,
                            productSpec(3,true, title = "Iphone 10", subtitle = "Súper. Mega. Rápido.", picture = "http://t.me/hasthur")
                )
            ){
                _, item ->
                HotSalesModel(phone = item)
            }
       }
    }
}