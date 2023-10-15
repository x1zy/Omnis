package com.example.omnis.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview (showBackground = true)
@Composable
fun MainScreen() {
    Column {
        Logotype(text = "Omnis")
    }
}


@Composable
fun Logotype(text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .height(64.dp)
            .alpha(1f)
    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            fontSize = 22.sp,
            modifier = Modifier
                .weight(1f)
                .alpha(1f),
        )
    }
}