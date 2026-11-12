package com.decoverri.pftreasuregeneratorkotlin.ui

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decoverri.pftreasuregeneratorkotlin.data.Datasource
import com.decoverri.pftreasuregeneratorkotlin.ui.theme.PFTreasureGeneratorKotlinTheme
import java.text.NumberFormat

private const val TAG = "ValueScreen"
@Composable
fun ValueSelectionScreen(
    values: List<Int>,
    modifier: Modifier = Modifier
) {
    Log.d(TAG, "List of values is $values")
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        items(values) { value ->
            ValueSelectionItem(value)
        }
    }
}

@Composable
fun ValueSelectionItem(
    value: Int,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = {},
        shape = RoundedCornerShape(4.dp),
        modifier = modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "${NumberFormat.getNumberInstance().format(value)} gp",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        )
    }
}

@Preview
@Composable
fun ValueSelectionItemPreview() {
    PFTreasureGeneratorKotlinTheme {
        ValueSelectionItem(Datasource.treasureValues[0][0])
    }
}

@Preview
@Composable
fun ValueSelectionScreenPreview() {
    PFTreasureGeneratorKotlinTheme {
        ValueSelectionScreen(Datasource.treasureValues[0])
    }
}