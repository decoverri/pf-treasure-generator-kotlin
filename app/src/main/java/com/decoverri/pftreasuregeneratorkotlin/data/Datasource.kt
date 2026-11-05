package com.decoverri.pftreasuregeneratorkotlin.data

import com.decoverri.pftreasuregeneratorkotlin.R
import com.decoverri.pftreasuregeneratorkotlin.model.TreasureType

object Datasource {

    val treasureTypes = listOf(
        TreasureType('A', name = "Coins", description = "", icon = R.drawable.ic_type_a),
        TreasureType('B', name = "Coins and Gems", description = "", icon = R.drawable.ic_type_b),
        TreasureType('C', name = "Art Objects", description = "", icon = R.drawable.ic_type_c),
        TreasureType('D', name = "Coins and Small Objects", description = "", icon = R.drawable.ic_type_d),
        TreasureType('E', name = "Armor and Weapons", description = "", icon = R.drawable.ic_type_e),
        TreasureType('F', name = "Combatant Gear", description = "", icon = R.drawable.ic_type_f),
        TreasureType('G', name = "Spellcaster Gear", description = "", icon = R.drawable.ic_type_g),
        TreasureType('H', name = "Lair Treasure", description = "", icon = R.drawable.ic_type_h),
        TreasureType('I', name = "Treasure Hoard", description = "", icon = R.drawable.ic_type_i),
    )
}