package com.example.lab4javierpradoo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4javierpradoo.ui.theme.LAB4JAVIERPRADOOTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LAB4JAVIERPRADOOTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Emergency()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun CampusCentral( modifier: Modifier = Modifier) {
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

@Composable
fun AppSettings(modifier: Modifier = Modifier){
    val icono1 = painterResource(id = R.drawable.usuario)
    val icono2 = painterResource(id = R.drawable.envelope)
    val icono3 = painterResource(id = R.drawable.bell)
    val icono4 = painterResource(id = R.drawable.eye_crossed)
    val icono5 = painterResource(id = R.drawable.interrogation)
    val icono6 = painterResource(id = R.drawable.info)
    Surface(Modifier.fillMaxSize(),
        color = Color.White) {
        Column {
            Text(text = "SETTINGS",modifier = modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
                .wrapContentSize(Alignment.TopCenter),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Black)
            IconWithText(icono1, "Edit Profile",modifier)
            IconWithText(icono2, "Email Addresses", modifier)
            IconWithText(icono3, "Notification", modifier)
            IconWithText(icono4, "Privacy", modifier)
            IconWithText(icono5, "Help & Feedbak\nTroubleshooting and guide", modifier)
            IconWithText(icono6, "About\nApp information and documents", modifier)
            Text(text = "Logout", modifier = modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
                .wrapContentSize(Alignment.TopCenter), color = Color.Red)


        }

    }
}
@Composable
fun Emergency(modifier: Modifier = Modifier){
    val icon1 = painterResource(id = R.drawable.warning)
    val icon2 = painterResource(id = R.drawable.phone_call)
    val icon3 = painterResource(id = R.drawable.medic)
    Surface (Modifier.fillMaxSize(),
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

@Composable
fun MyProfile(modifier: Modifier = Modifier){
    val image1 =  painterResource(id = R.drawable.portada)
    val image2 = painterResource(id = R.drawable.perfil)
    val icon1 = painterResource(id = R.drawable.graduation)
    val icon2 = painterResource(id = R.drawable.users)
    val icon3 = painterResource(id = R.drawable.calendar)
    val icon4 = painterResource(id = R.drawable.book)
    val icon5 = painterResource(id = R.drawable.test)
    val icon6 = painterResource(id = R.drawable.usersg)
    val icon7 = painterResource(id = R.drawable.upcoming)


    Surface(Modifier.fillMaxSize(),
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

@Composable
fun IconWithText(icon: Painter, text: String, modifier: Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .padding(top = 10.dp)
    ) {
        Icon(
            painter = icon,
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .padding(10.dp)

        )

        Text(
            text = text,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp),
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LAB4JAVIERPRADOOTheme {
        MyProfile()
    }
}