package com.example.lab4javierpradoo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lab4javierpradoo.R

@Composable
fun CampusCentral( navController: NavController,modifier: Modifier = Modifier) {
    val imageMain = Modifier
        .fillMaxWidth()
        .padding(top = 12.dp)
        .size(150.dp)


    val image1 =  painterResource(id = R.drawable.infocampus1)
    val image2 = painterResource(id = R.drawable.servicio_now)
    val image3 = painterResource(id = R.drawable.actualidad)
    val image4 = painterResource(id = R.drawable.directorio)
    val image5 = painterResource(id = R.drawable.portalweb)


    Surface (
        Modifier.fillMaxSize(),
        color = Color.White){
        Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "CAMPUS CENTRAL",
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
                    .wrapContentSize(Alignment.TopCenter),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Black
            )
            Image(painter = image1, contentDescription =null,contentScale = ContentScale.FillWidth, modifier = imageMain)

            Text(
                text = "DESTACADOS",
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 16.dp),

                textAlign = TextAlign.Start,
                fontSize = 25.sp,
                color = Color.Gray
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = image2,
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .size(150.dp)
                )

                Image(
                    painter = image3,
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .size(150.dp)
                )


            }

            Text(
                text = "SERVICIOS Y RECURSOS",
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 16.dp),
                textAlign = TextAlign.Start,
                fontSize = 25.sp,
                color = Color.Gray
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = image4,
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .size(150.dp)

                )

                Image(
                    painter = image5,
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .size(150.dp)

                )
            }
        }

    }
}
