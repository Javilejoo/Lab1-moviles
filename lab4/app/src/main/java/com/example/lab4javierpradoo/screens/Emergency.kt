package com.example.lab4javierpradoo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lab4javierpradoo.IconWithText
import com.example.lab4javierpradoo.R

@Composable
fun Emergency(navController: NavController,modifier: Modifier = Modifier){
    val icon1 = painterResource(id = R.drawable.warning)
    val icon2 = painterResource(id = R.drawable.phone_call)
    val icon3 = painterResource(id = R.drawable.medic)
    Surface (
        Modifier.fillMaxSize(),
        color = Color.White){
        Column {
            Text(
                text = "EMERGENCY CONTACTS",
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
                    .wrapContentSize(Alignment.TopCenter),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Black
            )
            IconWithText(icon = icon1, text = "Emergencias\nSi se presenta un incidente o un percance\n" +
                    "por favor marcar el numero de emergencia y \nrapidamente te ayudaremos." , modifier = modifier)
            Row ( Modifier.background(Color.Green),  ){
                Image(painter = icon2, contentDescription =null,contentScale = ContentScale.FillWidth, modifier = Modifier
                    .size(50.dp)
                    .padding(10.dp),
                )
                Text(text = "Call 5978-1736", modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, top = 15.dp),
                    color = Color.White)
            }

            IconWithText(icon = icon3, text = "CLINICA UVG" , modifier = modifier)

            Text(text = "La clinica UVG, presta los siguientes\n" +
                    "Servicios:\n" +
                    "° Atencion a emergencias\n" +
                    "° Atencion Primaria a Enfermedades\n" +
                    "Comunes\n" +
                    "° Plan Educacional sobre Enfermedades\n" +
                    "Horario de Atencion: 7:00 a.m a 8:30 p.m.\n" +
                    "Campus Central Edificio F 119-120.", modifier = Modifier
                .fillMaxWidth()
                .padding(start = 55.dp),
                fontSize = 10.sp,
                color = Color.Black,
            )

            Row ( Modifier.background(Color.Green),  ){
                Image(painter = icon2, contentDescription =null,contentScale = ContentScale.FillWidth, modifier = Modifier
                    .size(50.dp)
                    .padding(10.dp),
                )
                Text(text = "Call 2507-1500 ex 21312", modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, top = 15.dp),
                    color = Color.White)
            }
        }

    }
}