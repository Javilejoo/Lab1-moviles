package com.example.lab4javierpradoo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lab4javierpradoo.IconWithText
import com.example.lab4javierpradoo.R

@Composable
fun MyProfile(navController: NavController,modifier: Modifier = Modifier){
    val image1 =  painterResource(id = R.drawable.portada)
    val image2 = painterResource(id = R.drawable.perfil)
    val icon1 = painterResource(id = R.drawable.graduation)
    val icon2 = painterResource(id = R.drawable.users)
    val icon3 = painterResource(id = R.drawable.calendar)
    val icon4 = painterResource(id = R.drawable.book)
    val icon5 = painterResource(id = R.drawable.test)
    val icon6 = painterResource(id = R.drawable.usersg)
    val icon7 = painterResource(id = R.drawable.upcoming)


    Surface(
        Modifier.fillMaxSize(),
        color = Color.White) {
        Column {
            Text(
                text = "MI PERFIL",
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
                    .wrapContentSize(Alignment.TopCenter),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Black
            )

            Box {
                Image(painter = image1, contentDescription = null,modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp),)
                Image(painter = image2, contentDescription = null,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(top = 140.dp)
                        .wrapContentSize(Alignment.TopCenter),)
            }
            Text(text = "JAVIER ALEJANDRO PRADO RAMIREZ",modifier = modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .wrapContentSize(Alignment.TopCenter),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Black)

            Row(verticalAlignment = Alignment.CenterVertically) {

                Icon(painter = icon1, contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(top = 8.dp))

                Column {

                    Text(text = "My campus",
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(top = 8.dp, start = 5.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.Black)

                    Text(text = "Campus Central", modifier = modifier
                        .fillMaxWidth()
                        .padding(start = 5.dp),
                        fontSize = 10.sp,
                        color = Color.Black
                    )
                }
            }

            IconWithText(icon2, "My Friends", modifier)
            IconWithText(icon3, "My Calendar", modifier)
            IconWithText(icon4 , text = "My Courses",  modifier)
            IconWithText(icon5 , text = "My Grades",  modifier)
            IconWithText(icon6 , text = "My Groups",  modifier)
            IconWithText(icon7 , text = "My Upcoming Events",  modifier)

        }
    }
}
