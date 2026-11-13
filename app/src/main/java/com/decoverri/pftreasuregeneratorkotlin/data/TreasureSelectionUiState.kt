package com.decoverri.pftreasuregeneratorkotlin.data

import com.decoverri.pftreasuregeneratorkotlin.model.Treasure
import com.decoverri.pftreasuregeneratorkotlin.model.TreasureType

data class TreasureSelectionUiState(
    val types: List<TreasureType> = Datasource.treasureTypes,
    val selectedType: TreasureType? = null,

    val values: List<Int> = emptyList(),
    val selectedValue: Int? = null,

    val treasures: List<Treasure> = emptyList()
)