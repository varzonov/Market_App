package com.petproject.market

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.petproject.market.headicon.*
import com.petproject.market.headicon.headicon.*
import com.petproject.market.ui.theme.TestOrange
import java.lang.reflect.Modifier

@Composable
fun Head (){
    Column(modifier = androidx.compose.ui.Modifier
        .fillMaxWidth()
    ) {
        Geolocation()
        CategoryList()
        SearchPanel()
    }
}

@Composable
fun CategoryList() {
    Row(modifier = androidx.compose.ui.Modifier.fillMaxWidth() ,verticalAlignment = Alignment.CenterVertically) {
        Box(androidx.compose.ui.Modifier.fillMaxWidth(0.7f), contentAlignment = Alignment.CenterStart) {
            Text(
                text = "Select Category",
                fontSize = 25.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = androidx.compose.ui.Modifier.padding(
                    top = 10.dp,
                    bottom = 5.dp,
                    start = 10.dp
                )
            )
        }
        Box(androidx.compose.ui.Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
            Text(
                text = "view all",
                textAlign = TextAlign.Right,
                fontSize = 15.sp,
                color = TestOrange,
                modifier = androidx.compose.ui.Modifier.padding(
                    top = 10.dp,
                    bottom = 5.dp,
                    end = 10.dp
                )
            )
        }
    }
    LazyRow(modifier = androidx.compose.ui.Modifier
        ) {
        itemsIndexed(
            listOf(
                categoryItem(com.petproject.market.headicon.HeadIcon.`Icon-17`,com.petproject.market.headicon.HeadIcon.`Icon-21`, "Phones"),
                categoryItem(com.petproject.market.headicon.HeadIcon.`Icon-18`,com.petproject.market.headicon.HeadIcon.`Icon-22`,"Computer"),
                categoryItem(com.petproject.market.headicon.HeadIcon.`Icon-19`,com.petproject.market.headicon.HeadIcon.`Icon-23`,"Health"),
                categoryItem(com.petproject.market.headicon.HeadIcon.`Icon-20`,com.petproject.market.headicon.HeadIcon.`Icon-24`,"Books"),
                categoryItem(com.petproject.market.headicon.HeadIcon.`Icon-20`,com.petproject.market.headicon.HeadIcon.`Icon-24`,"Unknown"),
                categoryItem(com.petproject.market.headicon.HeadIcon.`Icon-20`,com.petproject.market.headicon.HeadIcon.`Icon-24`,"Unknown"),
            )
        ){
                _, item ->
            CategoryModel(iconwhite = item.iconSelected, icon = item.iconUnelected, catName = item.name)
        }
    }
}

@Composable
fun Geolocation (){
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = androidx.compose.ui.Modifier
                .fillMaxWidth(0.86f),
                contentAlignment = Alignment.Center
            ){
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(imageVector = HeadIcon.`Icon-14`, contentDescription ="Geo",
                        modifier = androidx.compose.ui.Modifier
                            .padding(start = 20.dp)
                    )
                    Text(text = "Moscow, Russia",
                        fontSize = 15.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = androidx.compose.ui.Modifier.padding(start = 10.dp)
                    )
                    Image(imageVector = com.petproject.market.headicon.HeadIcon.`Icon-25`, contentDescription ="list",
                        modifier = androidx.compose.ui.Modifier
                            .padding(start = 10.dp, top = 5.dp))
                }
            }
            Box(modifier = androidx.compose.ui.Modifier
                .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(imageVector = HeadIcon.`Icon-15`, contentDescription = "Filter",
                    modifier = androidx.compose.ui.Modifier
                        .padding(end = 30.dp, top = 2.dp)
                )
            }
        }

}

@Composable
fun CategoryModel (icon: ImageVector, iconwhite: ImageVector, catName: String){
    val state = remember { mutableStateOf(false)}
    val flag = remember { mutableStateOf(false)}
    Box(contentAlignment = Alignment.Center,
        modifier = androidx.compose.ui.Modifier
            .padding(start = 23.dp, top = 10.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                androidx.compose.ui.Modifier
                    .size(71.dp)
                    .clip(shape = CircleShape)
                    .background(catClickColor(state.value))
                    .clickable(onClick = {
//                    if (!flag.value)
//                    {
                        state.value = !state.value
//                        flag.value = !flag.value
//                    } else {
//                        flag.value = !flag.value
//                    }
                    }),
                contentAlignment = Alignment.Center
            )  {
                Image(
                    imageVector = catClick(state.value,iconwhite,icon),
                    contentDescription = catName,
                    contentScale = ContentScale.Fit
                )
            }
            Text(text = catName, fontSize = 12.sp, color = catClickColorText(state.value), modifier = androidx.compose.ui.Modifier.padding(
                top = 8.dp
            ))
        }
    }
}



fun catClick (state: Boolean, icon1: ImageVector, icon2: ImageVector): ImageVector {
    var image: ImageVector

    if (state) {
        image = icon1
    }
    else {
        image = icon2
    }
    return image
}

fun catClickColor (state: Boolean): Color {
    var colorBack: Color
    val colorText: Color

    if (state) {
        colorBack = TestOrange
        colorText = TestOrange

    }
    else {
        colorBack = Color.White
        colorText = Color.Black

    }
    return colorBack; colorText
}

fun catClickColorText (state: Boolean): Color {

    val colorText: Color

    if (state) {

        colorText = TestOrange

    }
    else {

        colorText = Color.Black

    }
    return  colorText
}


@Composable
fun SearchPanel () {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = androidx.compose.ui.Modifier
            .padding(top = 30.dp, start = 10.dp, end = 30.dp)
            .fillMaxWidth()
    ) {
        Card(
            androidx.compose.ui.Modifier
                .fillMaxWidth(0.85f)
                .clip(RoundedCornerShape(20.dp))
                .height(40.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    imageVector = HeadIcon.`Icon-13`, contentDescription = "Search",
                    modifier = androidx.compose.ui.Modifier
                        .padding(start = 10.dp)
                )
                Text(
                    text = "Search",
                    fontSize = 12.sp,
                    color = (Color.Gray),
                    modifier = androidx.compose.ui.Modifier.padding(
                        start = 20.dp
                    )
                )
            }
        }

        Box(
            androidx.compose.ui.Modifier
                .padding(start = 10.dp)
                .clip(CircleShape)
                .background(TestOrange)
                .size(40.dp),
            contentAlignment = Alignment.Center
        ) {
                Image(
                    imageVector = HeadIcon.`Icon-16`, contentDescription = "QR",
                    modifier = androidx.compose.ui.Modifier
                )
        }
    }
}


