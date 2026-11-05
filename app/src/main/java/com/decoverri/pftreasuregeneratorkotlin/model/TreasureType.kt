package com.decoverri.pftreasuregeneratorkotlin.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class TreasureType(
    val letter: Char,
    @field:StringRes val name: Int,
    val description: String,
    @field:DrawableRes val icon: Int,
)