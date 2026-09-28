package com.wgtunnel.ui.theme

import androidx.compose.ui.graphics.Color

// BlitzTech Blue Theme Colors
val BlitzBlue = Color(0xFF1E88E5)
val BlitzDarkBlue = Color(0xFF0A1929)
val BlitzSurface = Color(0xFF102A43)
val BlitzOnSurface = Color(0xFFE3F2FD)
val BlitzSecondary = Color(0xFF00B0FF)
val BlitzOnPrimary = Color(0xFFFFFFFF)

// amoled
val ElectricTeal = Color(0xFF4DD0E1)

// Status colors
val SilverTree = Color(0xFF6DB58B)
val AlertRed = Color(0xFFCF6679)
val Straw = Color(0xFFD4C483)

val Disabled = CoolGray.copy(alpha = 0.4f)

// Other colors
val ConfigHeaderColor = Color(0xFFBB86FC)
val ConfigKeyColor = Color(0xFF03DAC5)
val Heart = Color(0xFFDB61A2)

sealed class ThemeColors(
    val background: Color,
    val surface: Color,
    val primary: Color,
    val secondary: Color,
    val onSurface: Color,
    val onBackground: Color,
    val outline: Color,
) {

    data object Light :
        ThemeColors(
            background = LightGrey.copy(alpha = 0.95f),
            surface = OffWhite,
            primary = Aqua,
            secondary = LightGrey,
            onSurface = BalticSea,
            outline = Plantation.copy(alpha = .75f),
            onBackground = BalticSea,
        )

    data object Dark :
        ThemeColors(
            background = BalticSea,
            surface = Shark,
            primary = Aqua,
            secondary = Plantation,
            onSurface = OffWhite,
            outline = CoolGray,
            onBackground = OffWhite,
        )
}
