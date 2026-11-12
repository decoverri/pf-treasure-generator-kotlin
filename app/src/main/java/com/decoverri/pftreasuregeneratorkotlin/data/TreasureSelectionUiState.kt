package com.decoverri.pftreasuregeneratorkotlin.data

import com.decoverri.pftreasuregeneratorkotlin.model.TreasureType

data class TreasureSelectionUiState(
    val typeList: List<TreasureType> = Datasource.treasureTypes,
    val typeIndex: Int? = null,
    val valueIndex: Int? = null,
    val valueList: List<Int>? = null,
)