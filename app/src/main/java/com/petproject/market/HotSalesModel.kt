package com.petproject.market

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.petproject.market.ui.theme.TestOrange


@Composable
fun  HotSalesModel (phone: productSpec){
    BoxWithConstraints ( modifier = Modifier //Hot Sales Body
        .width(392.dp)
        .padding(start = 5.dp, end = 5.dp, top = 10.dp)
        .clip(shape = RoundedCornerShape(10.dp))
            ) {
        Image (painter = painterResource(id = R.drawable.image_1),
            contentDescription = "Iphone 12",
            contentScale = ContentScale.Crop,
        )

            Row(modifier = Modifier // Left Text block and right pic block
                ) {
                Column(modifier = Modifier //Left text block
                    .padding(start = 30.dp, top = 8.dp, bottom = 20.dp, end = 30.dp)
                    ) {
                    Box( modifier = Modifier  //"New" icon
                        .padding(top = 5.dp)
                        .size(25.dp)
                        .clip(shape = CircleShape)
                        .background(TestOrange),
                        contentAlignment = Alignment.Center
                        ){ Text(text = "New",fontWeight = FontWeight.Bold,fontSize = 10.sp,  color = Color.White)
                        }
                    Text(text = phone.title, fontSize = 20.sp, color = Color.White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 15.dp)) // Title
                    Text(text = phone.subtitle, fontSize = 8.sp, color = Color.White, modifier = Modifier.padding(top = 3.dp, bottom = 15.dp)) // Title
                    Box( modifier = Modifier  //"Buy" button
                        .clip(shape = RoundedCornerShape(5.dp))
                        .background(Color.White),
                        contentAlignment = Alignment.Center
                    ){ Text(text = "Buy now!",fontSize = 10.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 25.dp, end = 25.dp, top = 2.dp, bottom = 2.dp))
                    }
                }

            }
    }


}