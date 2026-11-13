package com.decoverri.pftreasuregeneratorkotlin.ui

import androidx.lifecycle.ViewModel
import com.decoverri.pftreasuregeneratorkotlin.data.Datasource
import com.decoverri.pftreasuregeneratorkotlin.data.TreasureSelectionUiState
import com.decoverri.pftreasuregeneratorkotlin.model.Treasure
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.text.NumberFormat


class TreasureGeneratorViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(TreasureSelectionUiState())
    val uiState: StateFlow<TreasureSelectionUiState> = _uiState.asStateFlow()

    fun updateTreasureType(typeIndex: Int) {
        val typeList = uiState.value.types

        if(typeIndex in typeList.indices) {
            _uiState.update { currentState ->
                currentState.copy(
                    selectedTypeIndex = typeIndex,
                    values = Datasource.treasureValues[typeIndex],
                    )
            }
        }
    }

    fun updateTreasureValue(valueIndex: Int) {
        val typeIndex = uiState.value.selectedTypeIndex
        val valueList = uiState.value.values

        if(
            typeIndex != null &&
            valueIndex in valueList.indices
            ) {
            _uiState.update { currentState ->
                currentState.copy(selectedValueIndex = valueIndex)
            }
            generateTreasure()
        }
    }

    private fun generateTreasure() {
        _uiState.update { currentState ->
            currentState.copy(treasures = listOf(
                Treasure("You selected ${
                    NumberFormat.getNumberInstance()
                        .format(uiState.value.values[uiState.value.selectedValueIndex ?: 0])
                } gp worth of treasure type '${
                    uiState.value.types[uiState.value.selectedTypeIndex ?: 0].name
                }'")),
            )
        }
    }

}