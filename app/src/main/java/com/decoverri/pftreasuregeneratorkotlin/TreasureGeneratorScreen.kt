package com.decoverri.pftreasuregeneratorkotlin

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.decoverri.pftreasuregeneratorkotlin.ui.TreasureGeneratorViewModel
import com.decoverri.pftreasuregeneratorkotlin.ui.TreasureResultScreen
import com.decoverri.pftreasuregeneratorkotlin.ui.TypeSelectionScreen
import com.decoverri.pftreasuregeneratorkotlin.ui.ValueSelectionScreen
import com.decoverri.pftreasuregeneratorkotlin.ui.theme.PFTreasureGeneratorKotlinTheme

enum class TreasureGeneratorScreen{
    TypeSelection,
    ValueSelection,
    Treasure
}

@Composable
fun TreasureGeneratorAppBar(
    modifier: Modifier = Modifier
) {
    CenterAlignedTopAppBar(
        title = { Text(stringResource(R.string.treasure).uppercase()) },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
        ),
        modifier = modifier,
    )
}

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun TreasureGeneratorApp(
    appViewModel: TreasureGeneratorViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    Scaffold(
        topBar = {
            TreasureGeneratorAppBar()
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = TreasureGeneratorScreen.TypeSelection.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = TreasureGeneratorScreen.TypeSelection.name) {
                TypeSelectionScreen(
                    onTypeSelecting = { type ->
                        appViewModel.updateTreasureType(type)
                        navController.navigate(TreasureGeneratorScreen.ValueSelection.name)
                    }
                )
            }
            composable(route = TreasureGeneratorScreen.ValueSelection.name) {
                ValueSelectionScreen(
                    appViewModel.uiState.value.values,
                    onValueSelecting = { value ->
                        appViewModel.updateTreasureValue(value)
                        navController.navigate(TreasureGeneratorScreen.Treasure.name)
                    }
                )
            }
            composable(route = TreasureGeneratorScreen.Treasure.name) {
                TreasureResultScreen(
                    appViewModel.uiState.value.treasures
                )
            }
        }
    }
}

@Preview
@Composable
fun TreasureGeneratorAppPreview() {
    PFTreasureGeneratorKotlinTheme {
        TreasureGeneratorApp()
    }
}