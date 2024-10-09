package org.mathieu.ui.card

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun LocationCard(name: String, type: String){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(350.dp)
            .height(200.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            .background(Color.Black)
            .clickable(onClick = {})
    ){
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = name,
            color = Color.White,
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = type,
            color = Color.White,
            fontSize = 12.sp
        )

    }
}
