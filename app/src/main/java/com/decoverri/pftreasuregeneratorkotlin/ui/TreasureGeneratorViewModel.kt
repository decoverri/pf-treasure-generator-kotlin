package com.decoverri.pftreasuregeneratorkotlin.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.decoverri.pftreasuregeneratorkotlin.data.Datasource
import com.decoverri.pftreasuregeneratorkotlin.data.TreasureSelectionUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


class TreasureGeneratorViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(TreasureSelectionUiState())
    val uiState: StateFlow<TreasureSelectionUiState> = _uiState.asStateFlow()

    fun updateTreasureType(typeIndex: Int) {
        val typeList = uiState.value.typeList

        if(typeIndex in typeList.indices) {
            _uiState.update { currentState ->
                currentState.copy(
                    typeIndex = typeIndex,
                    valueList = Datasource.treasureValues[typeIndex],
                    )
            }
        }
    }

    fun updateTreasureValue(valueIndex: Int) {
        val typeIndex = uiState.value.typeIndex
        val valueList = uiState.value.valueList

        if(
            typeIndex != null &&
            valueList != null &&
            valueIndex in valueList.indices
            ) {
            _uiState.update { currentState ->
                currentState.copy(valueIndex = valueIndex)
            }
        }
    }

}