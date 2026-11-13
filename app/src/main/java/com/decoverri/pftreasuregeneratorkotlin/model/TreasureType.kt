package com.decoverri.pftreasuregeneratorkotlin.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class TreasureType(
    val letter: Char,
    @field:StringRes val name: Int,
    @field:DrawableRes val icon: Int,
)