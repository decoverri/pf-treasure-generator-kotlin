package com.decoverri.pftreasuregeneratorkotlin.ui

import androidx.lifecycle.ViewModel
import com.decoverri.pftreasuregeneratorkotlin.data.Datasource
import com.decoverri.pftreasuregeneratorkotlin.data.TreasureSelectionUiState
import com.decoverri.pftreasuregeneratorkotlin.model.Treasure
import com.decoverri.pftreasuregeneratorkotlin.model.TreasureType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.text.NumberFormat


class TreasureGeneratorViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(TreasureSelectionUiState())
    val uiState: StateFlow<TreasureSelectionUiState> = _uiState.asStateFlow()

    fun updateTreasureType(treasureType: TreasureType) {
        _uiState.update {
            it.copy(
                selectedType = treasureType,
                values = Datasource.treasureValues[treasureType.letter] ?: emptyList(),
                )
        }

    }

    fun updateTreasureValue(value: Int) {
        _uiState.update {
            it.copy(selectedValue = value)
        }
        generateTreasure()
    }

    private fun generateTreasure() {
        _uiState.update {
            it.copy(treasures = listOf(
                Treasure(
                    uiState.value.selectedType?.letter ?: 'A',
                    uiState.value.selectedValue ?: 0,
                )),
            )
        }
    }

}