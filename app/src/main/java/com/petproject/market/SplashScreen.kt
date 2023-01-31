package com.petproject.market

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.petproject.market.navigation.Screen
import com.petproject.market.ui.theme.TestBlue
import com.petproject.market.ui.theme.TestOrange
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    var startAnimation by remember { mutableStateOf(false) }
    val alphaAnim = animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0f,
        animationSpec = tween(
            durationMillis = 2000
        )
    )

    LaunchedEffect(key1 = true) {
        startAnimation = true
        delay(2000)
        navController.popBackStack()
        navController.navigate(Screen.Home.route)
    }
    Splash(alpha = alphaAnim.value)
}

@Composable
fun Splash(alpha: Float) {
    Box(
        modifier = Modifier
            .background(TestBlue)
            .fillMaxSize()
            .alpha(alpha = alpha),
        contentAlignment = Alignment.Center
    ) {
        Box(contentAlignment = Alignment.Center) {
        Box(modifier = Modifier
            .size(132.dp)
            .clip(shape = CircleShape)
            .background(TestOrange)
        )
            Column(verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(start = 80.dp)
            ) {
                Text(text = "Ecommerce\nConcept", fontSize = 30.sp, color = Color.White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 17.dp,top = 0.dp))
            }
        }
    }
}

