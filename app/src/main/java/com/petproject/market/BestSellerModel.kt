package com.petproject.market

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.LayoutInfo
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BestSellerModel (){
    Card(modifier = Modifier
        .fillMaxWidth()
        .clip(shape = RoundedCornerShape(10.dp))

    ) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
        ) {
            Column() {
              Box(Modifier.size(168.dp))  {
                    Image(
                        painter = painterResource(id = R.drawable.image_2),
                        contentDescription = "Iphone 12",
                        contentScale = ContentScale.Fit
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "$3000", fontSize = 13.sp, color = Color.Black, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 5.dp))
                    Text(text = "$4000", fontSize = 7.sp, color = Color.Gray, modifier = Modifier.padding(start = 10.dp, top = 5.dp))
                }
                Text(text = "Samsung", fontSize = 10.sp, color = Color.Black, modifier = Modifier.padding(top = 3.dp))
            }
        }
    }
}

