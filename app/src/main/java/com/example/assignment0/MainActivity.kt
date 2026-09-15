package com.example.assignment0

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assignment0.ui.theme.Assignment0Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Assignment0Theme {
                DecisionMakingApp()
            }
        }
    }
}

@Preview
@Composable
fun DecisionMakingApp() {
    DecisionWithButtonAndImage(modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center))
}

@Composable
fun DecisionWithButtonAndImage(modifier: Modifier = Modifier) {
    var result by remember { mutableStateOf( 1) }
    var clicks by remember { mutableStateOf(0) }
    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (
            modifier = modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button (onClick = {
                result = (1..6).random()
                clicks++
            }) {
                Text(stringResource(R.string.roll))
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button (onClick = {
                result = (1..6).random()
                clicks++
            }) {
                Text(stringResource(R.string.roll))
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button (onClick = {
                result = (1..6).random()
                clicks++
            }) {
                Text(stringResource(R.string.roll))
            }
        }
        Row (
            modifier = modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Clicks: $clicks")
        }
    }
}