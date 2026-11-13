package com.decoverri.pftreasuregeneratorkotlin.data

import com.decoverri.pftreasuregeneratorkotlin.model.Treasure
import com.decoverri.pftreasuregeneratorkotlin.model.TreasureType

data class TreasureSelectionUiState(
    val types: List<TreasureType> = Datasource.treasureTypes,
    val values: List<Int> = emptyList(),
    val selectedTypeIndex: Int? = null,
    val selectedValueIndex: Int? = null,
    val treasures: List<Treasure> = emptyList()
)