package com.decoverri.pftreasuregeneratorkotlin.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decoverri.pftreasuregeneratorkotlin.R
import com.decoverri.pftreasuregeneratorkotlin.data.Datasource
import com.decoverri.pftreasuregeneratorkotlin.model.TreasureType
import com.decoverri.pftreasuregeneratorkotlin.ui.theme.PFTreasureGeneratorKotlinTheme

@Composable
fun TypeSelectionScreen(
    onTypeSelecting: (TreasureType) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
    ) {
        Text(
            text = stringResource(R.string.choose_the_treasure_type),
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(top = 16.dp)
        )
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 100.dp),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
        ) {
            items(Datasource.treasureTypes) { treasureType ->
                TypeSelectionCard(
                    treasureType,
                    { onTypeSelecting(treasureType) },
                    )
            }
        }
    }
}

@Composable
fun TypeSelectionCard(
    treasureType: TreasureType,
    onCardClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    ElevatedCard(
        onClick = onCardClick,
        shape = RectangleShape,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainer
        ),
        modifier = modifier
            .size(120.dp)
    ) {
        Image(
            painter = painterResource(treasureType.icon),
            contentDescription = stringResource(treasureType.name),
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp)
        )
    }
}

@Preview
@Composable
fun TypeSelectionCardPreview() {
    PFTreasureGeneratorKotlinTheme {
        TypeSelectionCard(
            Datasource.treasureTypes[0],
            {},
            )
    }
}

@Preview
@Composable
fun TypeSelectionScreenPreview() {
    PFTreasureGeneratorKotlinTheme {
        TypeSelectionScreen(
            {}
        )
    }
}