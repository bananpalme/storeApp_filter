package com.example.storeapp_filter

import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.storeapp_filter.ui.theme.StoreApp_filterTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StoreApp_filterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}



@Composable
fun MainScreen(modifier: Modifier = Modifier) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF1eadE))
        ) {
            Text(
                text = "Figma",
                modifier = Modifier.padding(16.dp),
                fontWeight = FontWeight.SemiBold
            )

            Row(
                modifier = Modifier
                    .padding(start = 32.dp, end = 32.dp)
                    .background(Color.White)
                    .fillMaxWidth()

            ) {
                Image(
                    painter = painterResource(id = R.drawable.search),
                    contentDescription = "Mit PNG billede",
                    modifier = Modifier
                        .width(20.dp)
                        .height(20.dp)
                    ,
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Search"
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(16.dp)
                    .background(
                        Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(16.dp)
                    ),
                    horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Filtre",
                    modifier = Modifier
                        .padding(25.dp),
                    fontWeight = FontWeight.Bold
                )
                Row(modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .height(35.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically) { Text(text = "Kategori")
                    Image(
                        painter = painterResource(id = R.drawable.arrow),
                        contentDescription = "Mit PNG billede",
                        modifier = Modifier
                            .width(35.dp)
                            .height(35.dp)
                        ,
                        contentScale = ContentScale.Crop
                    )
                }

                HorizontalDivider(thickness = 1.dp, color = Color.LightGray)

                Row(modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .height(35.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically) { Text(text = "Størrelse")
                    Image(
                        painter = painterResource(id = R.drawable.arrow),
                        contentDescription = "Mit PNG billede",
                        modifier = Modifier
                            .width(35.dp)
                            .height(35.dp)
                        ,
                        contentScale = ContentScale.Crop
                    )
                }

                HorizontalDivider(thickness = 1.dp, color = Color.LightGray)

                Row(modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .height(35.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically) { Text(text = "Mærke")
                    Image(
                        painter = painterResource(id = R.drawable.arrow),
                        contentDescription = "Mit PNG billede",
                        modifier = Modifier
                            .width(35.dp)
                            .height(35.dp)
                        ,
                        contentScale = ContentScale.Crop
                    )
                }

                HorizontalDivider(thickness = 1.dp, color = Color.LightGray)

                Row(modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .height(35.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically) { Text(text = "Farve")
                    Image(
                        painter = painterResource(id = R.drawable.arrow),
                        contentDescription = "Mit PNG billede",
                        modifier = Modifier
                            .width(35.dp)
                            .height(35.dp)
                        ,
                        contentScale = ContentScale.Crop
                    )
                }

                HorizontalDivider(thickness = 1.dp, color = Color.LightGray)

                Row(modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .height(35.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically) { Text(text = "Tilstand")
                    Image(
                        painter = painterResource(id = R.drawable.arrow),
                        contentDescription = "Mit PNG billede",
                        modifier = Modifier
                            .width(35.dp)
                            .height(35.dp)
                        ,
                        contentScale = ContentScale.Crop
                    )
                }

                HorizontalDivider(thickness = 1.dp, color = Color.LightGray)

                Row(modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .height(35.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically) { Text(text = "Materiale")
                    Image(
                        painter = painterResource(id = R.drawable.arrow),
                        contentDescription = "Mit PNG billede",
                        modifier = Modifier
                            .width(35.dp)
                            .height(35.dp)
                        ,
                        contentScale = ContentScale.Crop
                    )
                }

                HorizontalDivider(thickness = 1.dp, color = Color.LightGray)

                Row(modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .height(35.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically) { Text(text = "Placering")
                    Image(
                        painter = painterResource(id = R.drawable.arrow),
                        contentDescription = "Mit PNG billede",
                        modifier = Modifier
                            .width(35.dp)
                            .height(35.dp)
                        ,
                        contentScale = ContentScale.Crop
                    )
                }

            }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                    ,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column {
                        Image(
                            painter = painterResource(id = R.drawable.home),
                            contentDescription = "Mit PNG billede",
                            modifier = Modifier
                                .width(35.dp)
                                .height(35.dp)
                            ,
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = "Home",
                            fontSize = 14.sp
                        )
                    }
                    Column {
                        Image(
                            painter = painterResource(id = R.drawable.search),
                            contentDescription = "Mit PNG billede",
                            modifier = Modifier
                                .width(35.dp)
                                .height(35.dp)
                            ,
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = "Search",
                            fontSize = 14.sp
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.plus),
                        contentDescription = "Mit PNG billede",
                        modifier = Modifier
                            .width(50.dp)
                            .height(50.dp)
                        ,
                        contentScale = ContentScale.Crop
                    )
                    Column {
                        Image(
                            painter = painterResource(id = R.drawable.inbox),
                            contentDescription = "Mit PNG billede",
                            modifier = Modifier
                                .width(35.dp)
                                .height(35.dp)
                            ,
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = "Inbox",
                            fontSize = 14.sp
                        )
                    }
                    Column {
                        Image(
                            painter = painterResource(id = R.drawable.account),
                            contentDescription = "Mit PNG billede",
                            modifier = Modifier
                                .width(35.dp)
                                .height(35.dp)
                            ,
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = "Account",
                            fontSize = 14.sp
                        )
                    }
                }
            }

        }



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StoreApp_filterTheme {
        MainScreen()
    }
}