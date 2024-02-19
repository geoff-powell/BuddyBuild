package com.greenmiststudios.buddybuild.common.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
public fun App() {
  MaterialTheme {
    Box(
      modifier = Modifier.fillMaxSize(),
      contentAlignment = Alignment.Center
    ) {
      Text("BuddyBuild")
    }
  }
}