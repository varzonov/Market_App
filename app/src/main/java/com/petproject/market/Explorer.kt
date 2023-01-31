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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.petproject.market.explorericon.`Icon-02`
import com.petproject.market.explorericon.`Icon-03`
import com.petproject.market.explorericon.`Icon-04`
import com.petproject.market.ui.theme.TestBlue


@Preview
@Composable
fun Explorer (){
    BoxWithConstraints( modifier = androidx.compose.ui.Modifier
        .padding (top = 10.dp, start = 1.dp,end = 1.dp, bottom = 1.dp)
        .height(72.dp)
        .fillMaxWidth()
        .clip(shape = RoundedCornerShape(28.dp))
        .background(TestBlue),
        contentAlignment = Alignment.Center
    ){
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box( modifier = Modifier
                .padding(top = 2.dp)
                .size(8.dp)
                .clip(shape = CircleShape)
                .background(Color.White),
            )
            Text(modifier = Modifier.padding(start = 7.dp), text = "Explorer",fontWeight = FontWeight.Bold,fontSize = 15.sp,  color = Color.White)
            Image(imageVector = explorerIcon.`Icon-02`, contentDescription = "Card", modifier = Modifier.padding (start = 47.dp) )
            Image(imageVector = explorerIcon.`Icon-03`, contentDescription = "Favorites" , modifier = Modifier.padding (start = 47.dp))
            Image(imageVector = explorerIcon.`Icon-04`, contentDescription = "Profile", modifier = Modifier.padding (start = 47.dp) )
        }

    }

}