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
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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

class FirstUIActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            StudentTaskAppsTheme {
                CardScreen()
            }
        }
    }
}

@Composable
fun CardScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF20C997))
            .statusBarsPadding()
            .navigationBarsPadding()
            .padding(
                start = 10.dp,
                end = 10.dp,
                top = 6.dp,
                bottom = 8.dp
            )
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {

            Column {

                Text(
                    text = "Card",
                    color = Color.White,
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Normal
                )

                Spacer(
                    modifier = Modifier.height(2.dp)
                )

                Text(
                    text = "Simple and easy to use app",
                    color = Color.White.copy(alpha = 0.9f),
                    fontSize = 10.sp
                )
            }

            Box(
                modifier = Modifier
                    .size(26.dp)
                    .clip(CircleShape)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {

                Text(
                    text = "👤",
                    fontSize = 16.sp
                )
            }
        }

        Spacer(
            modifier = Modifier.height(30.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(7.dp)
        ) {

            MenuCard(
                modifier = Modifier.weight(1f),
                icon = "📕",
                title = "Text",
                subtitle = "19 items content"
            )

            MenuCard(
                modifier = Modifier.weight(1f),
                icon = "🏠",
                title = "Address",
                subtitle = "5 items content"
            )
        }

        Spacer(
            modifier = Modifier.height(7.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(7.dp)
        ) {

            MenuCard(
                modifier = Modifier.weight(1f),
                icon = "👨‍💻",
                title = "Character",
                subtitle = "5 items content"
            )

            MenuCard(
                modifier = Modifier.weight(1f),
                icon = "💳",
                title = "Bank card",
                subtitle = "6 items content"
            )
        }

        Spacer(
            modifier = Modifier.height(7.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(7.dp)
        ) {

            MenuCard(
                modifier = Modifier.weight(1f),
                icon = "🔑",
                title = "Password",
                subtitle = "21 items content"
            )

            MenuCard(
                modifier = Modifier.weight(1f),
                icon = "📦",
                title = "Logistics",
                subtitle = "12 items content"
            )
        }

        Spacer(
            modifier = Modifier.height(7.dp)
        )

        SettingsCard()
    }
}

@Composable
fun MenuCard(
    modifier: Modifier = Modifier,
    icon: String,
    title: String,
    subtitle: String
) {

    Card(
        modifier = modifier
            .aspectRatio(1.08f),
        shape = RoundedCornerShape(7.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = icon,
                fontSize = 30.sp
            )

            Spacer(
                modifier = Modifier.height(4.dp)
            )

            Text(
                text = title,
                fontSize = 13.sp,
                color = Color(0xFF4A4A4A)
            )

            Spacer(
                modifier = Modifier.height(2.dp)
            )

            Text(
                text = subtitle,
                fontSize = 6.sp,
                color = Color(0xFFC7C7C7)
            )
        }
    }
}

@Composable
fun SettingsCard() {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp),
        shape = RoundedCornerShape(7.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "⚙️",
                fontSize = 23.sp
            )

            Spacer(
                modifier = Modifier.width(8.dp)
            )

            Column(
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = "Settings",
                    fontSize = 13.sp,
                    color = Color(0xFF4A4A4A)
                )

                Text(
                    text = "Configure your app",
                    fontSize = 6.sp,
                    color = Color(0xFFC7C7C7)
                )
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
fun CardScreenPreview() {

    StudentTaskAppsTheme {
        CardScreen()
    }
}