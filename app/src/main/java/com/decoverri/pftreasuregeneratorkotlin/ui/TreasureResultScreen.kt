package com.decoverri.pftreasuregeneratorkotlin.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.decoverri.pftreasuregeneratorkotlin.model.Treasure
import com.decoverri.pftreasuregeneratorkotlin.ui.theme.PFTreasureGeneratorKotlinTheme
import java.text.NumberFormat

@Composable
fun TreasureResultScreen(
    treasures: List<Treasure>,
    modifier: Modifier = Modifier,
    ) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ){
        items(treasures) { treasure ->
            TreasureEntry(treasure)
        }
    }

}

@Composable
fun TreasureEntry(
    treasure: Treasure,
    modifier: Modifier = Modifier,
    ) {

    val formattedValue = NumberFormat.getNumberInstance().format(treasure.treasureValue)

    Text(
        text = "You have selected $formattedValue gp worth of treasure type ${treasure.treasureTypeLetter}"
    )
}

@Preview
@Composable
fun TreasureEntryPreview() {
    PFTreasureGeneratorKotlinTheme {
        TreasureEntry(Treasure('A', 10))
    }
}

@Preview
@Composable
fun TreasureResultScreenPreview() {
    PFTreasureGeneratorKotlinTheme {
        TreasureResultScreen(listOf(
            Treasure('A', 10),
            Treasure('B', 100),
        ))
    }
}

