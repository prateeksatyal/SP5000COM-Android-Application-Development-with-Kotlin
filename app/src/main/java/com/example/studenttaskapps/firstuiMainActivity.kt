package com.example.studenttaskapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.studenttaskapps.ui.theme.StudentTaskAppsTheme

class SecondUIActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            StudentTaskAppsTheme {
                CardListScreen()
            }
        }
    }
}

@Composable
fun CardListScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4F4F4))
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(bottom = 80.dp)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF20C997))
                    .statusBarsPadding()
                    .padding(
                        start = 16.dp,
                        end = 16.dp,
                        top = 10.dp,
                        bottom = 18.dp
                    )
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        text = "Card",
                        color = Color.White,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Normal
                    )

                    Box(
                        modifier = Modifier
                            .size(34.dp)
                            .clip(CircleShape)
                            .background(Color.White),
                        contentAlignment = Alignment.Center
                    ) {

                        Text(
                            text = "👤",
                            fontSize = 20.sp
                        )
                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 14.dp,
                        end = 14.dp,
                        top = 12.dp
                    ),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {

                InfoCard(
                    background = Color(0xFFFFB52E),
                    title = "Dribbble",
                    line1 = "Padux",
                    line2 = "**********",
                    height = 118
                )

                InfoCard(
                    background = Color(0xFF2196F3),
                    title = "HJM",
                    line1 = "173****8838",
                    line2 = "",
                    height = 95
                )

                InfoCard(
                    background = Color(0xFF4CC9A6),
                    title = "Tom",
                    line1 = "Room 601, Building 8, Zhongnan Century",
                    line2 = "City, No.8, Taoyuan Road",
                    height = 130
                )

                BankCard()

                InfoCard(
                    background = Color(0xFFD99A8F),
                    title = "Young",
                    line1 = "This is the story of me and them, very...",
                    line2 = "",
                    height = 100
                )

                InfoCard(
                    background = Color(0xFF5B82F1),
                    title = "Jinlun street, golden chrysanthemum",
                    line1 = "Road, Haizhu District",
                    line2 = "",
                    height = 95
                )
            }
        }

        FloatingActionButton(
            onClick = {},
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .navigationBarsPadding()
                .padding(
                    end = 18.dp,
                    bottom = 16.dp
                )
                .size(64.dp),
            shape = CircleShape,
            containerColor = Color(0xFF20C997),
            contentColor = Color.White
        ) {

            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add",
                modifier = Modifier.size(36.dp)
            )
        }
    }
}

@Composable
fun InfoCard(
    background: Color,
    title: String,
    line1: String,
    line2: String,
    height: Int
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(height.dp),
        shape = RoundedCornerShape(6.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 3.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = background
        )
    ) {

        Box(
            modifier = Modifier.fillMaxSize()
        ) {

            Text(
                text = "◇",
                color = Color.White.copy(alpha = 0.10f),
                fontSize = 110.sp,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(end = 10.dp)
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        start = 16.dp,
                        top = 16.dp,
                        end = 12.dp,
                        bottom = 12.dp
                    )
            ) {

                Text(
                    text = title,
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal
                )

                Spacer(
                    modifier = Modifier.height(3.dp)
                )

                if (line1.isNotEmpty()) {
                    Text(
                        text = line1,
                        color = Color.White.copy(alpha = 0.92f),
                        fontSize = 14.sp
                    )
                }

                if (line2.isNotEmpty()) {

                    Spacer(
                        modifier = Modifier.height(2.dp)
                    )

                    Text(
                        text = line2,
                        color = Color.White.copy(alpha = 0.92f),
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}

@Composable
fun BankCard() {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp),
        shape = RoundedCornerShape(6.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 3.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF6457F4)
        )
    ) {

        Box(
            modifier = Modifier.fillMaxSize()
        ) {

            Text(
                text = "◇",
                color = Color.White.copy(alpha = 0.08f),
                fontSize = 135.sp,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(end = 5.dp)
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {

                Text(
                    text = "1882 **** **** 8695",
                    color = Color.White,
                    fontSize = 20.sp
                )

                Spacer(
                    modifier = Modifier.height(4.dp)
                )

                Text(
                    text = "ICBC",
                    color = Color.White.copy(alpha = 0.85f),
                    fontSize = 14.sp
                )

                Spacer(
                    modifier = Modifier.weight(1f)
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(
                        text = "Debit Card",
                        color = Color.White.copy(alpha = 0.85f),
                        fontSize = 12.sp
                    )

                    Text(
                        text = "12/19",
                        color = Color.White.copy(alpha = 0.85f),
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_4
)
@Composable
fun CardListScreenPreview() {

    StudentTaskAppsTheme {
        CardListScreen()
    }
}