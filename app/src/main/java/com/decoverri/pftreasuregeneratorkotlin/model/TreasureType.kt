package com.decoverri.pftreasuregeneratorkotlin.model

import androidx.annotation.DrawableRes

data class TreasureType(
    val letter: Char,
    val name: String,
    val description: String,
    @field:DrawableRes val icon: Int,
)