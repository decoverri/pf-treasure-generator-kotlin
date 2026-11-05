package com.decoverri.pftreasuregeneratorkotlin

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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
    TopAppBar(
        title = { Text(stringResource(R.string.treasure)) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = modifier,
    )
}

@Composable
fun TreasureGeneratorApp(
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