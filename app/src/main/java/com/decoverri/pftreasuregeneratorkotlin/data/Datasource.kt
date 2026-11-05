package com.decoverri.pftreasuregeneratorkotlin.data

import com.decoverri.pftreasuregeneratorkotlin.R
import com.decoverri.pftreasuregeneratorkotlin.model.TreasureType

object Datasource {

    val treasureTypes = listOf(
        TreasureType('A', name = R.string.coins, description = "", icon = R.drawable.ic_type_a),
        TreasureType('B', name = R.string.coins_and_gems, description = "", icon = R.drawable.ic_type_b),
        TreasureType('C', name = R.string.art_objects, description = "", icon = R.drawable.ic_type_c),
        TreasureType('D', name = R.string.coins_and_small_objects, description = "", icon = R.drawable.ic_type_d),
        TreasureType('E', name = R.string.armor_and_weapons, description = "", icon = R.drawable.ic_type_e),
        TreasureType('F', name = R.string.combatant_gear, description = "", icon = R.drawable.ic_type_f),
        TreasureType('G', name = R.string.spellcaster_gear, description = "", icon = R.drawable.ic_type_g),
        TreasureType('H', name = R.string.lair_treasure, description = "", icon = R.drawable.ic_type_h),
        TreasureType('I', name = R.string.treasure_hoard, description = "", icon = R.drawable.ic_type_i),
    )
}