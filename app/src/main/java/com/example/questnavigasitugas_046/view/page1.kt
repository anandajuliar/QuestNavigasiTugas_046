package com.example.questnavigasitugas_046.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigasitugas_046.R
import androidx.compose.foundation.background

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier,
    onNavigateToPage2: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(R.string.welcome_title),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Image(
            painter = painterResource(id = R.drawable.logo_fintrack),
            contentDescription = stringResource(R.string.app_name),
            modifier = Modifier
                .size(300.dp)
                .padding(bottom = 8.dp)
        )
        Text(
            text = stringResource(R.string.developer_name),
            fontSize = 14.sp,
            color = Color.White.copy(alpha = 0.7f)
        )
        Text(
            text = stringResource(R.string.developer_nim),
            fontSize = 14.sp,
            color = Color.White.copy(alpha = 0.7f)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = onNavigateToPage2,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White
            ),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(
                text = stringResource(R.string.button_masuk),
                fontSize = 18.sp,
                color = Color.Black
            )

        }
    }
    }
