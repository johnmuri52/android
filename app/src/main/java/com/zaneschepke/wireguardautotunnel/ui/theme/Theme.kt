package com.wgtunnel.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val BlitzColorScheme = darkColorScheme(
    primary = BlitzBlue,
    onPrimary = BlitzOnPrimary,
    secondary = BlitzSecondary,
    background = BlitzDarkBlue,
    surface = BlitzSurface,
    onSurface = BlitzOnSurface
)

@Composable
fun WgTunnelTheme(
    darkTheme: Boolean = true, // Force dark theme for the BlitzTech look
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = BlitzColorScheme,
        content = content
    )
}
