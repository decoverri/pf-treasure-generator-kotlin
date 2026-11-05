package com.decoverri.pftreasuregeneratorkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.decoverri.pftreasuregeneratorkotlin.ui.theme.PFTreasureGeneratorKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PFTreasureGeneratorKotlinTheme {
                TreasureGeneratorApp()
            }
        }
    }
}
