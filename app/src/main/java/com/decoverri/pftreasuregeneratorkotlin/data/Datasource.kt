package com.decoverri.pftreasuregeneratorkotlin.data

import com.decoverri.pftreasuregeneratorkotlin.R
import com.decoverri.pftreasuregeneratorkotlin.model.TreasureType

object Datasource {

    val treasureTypes = listOf(
        TreasureType('A', name = R.string.coins, icon = R.drawable.ic_type_a),
        TreasureType('B', name = R.string.coins_and_gems, icon = R.drawable.ic_type_b),
        TreasureType('C', name = R.string.art_objects, icon = R.drawable.ic_type_c),
        TreasureType('D', name = R.string.coins_and_small_objects, icon = R.drawable.ic_type_d),
        TreasureType('E', name = R.string.armor_and_weapons, icon = R.drawable.ic_type_e),
        TreasureType('F', name = R.string.combatant_gear, icon = R.drawable.ic_type_f),
        TreasureType('G', name = R.string.spellcaster_gear, icon = R.drawable.ic_type_g),
        TreasureType('H', name = R.string.lair_treasure, icon = R.drawable.ic_type_h),
        TreasureType('I', name = R.string.treasure_hoard, icon = R.drawable.ic_type_i),
    )

    val treasureValues = mapOf(
        'A' to listOf(1,5,10,25,50,100,200,500,1000,5000,10000,50000),
        'B' to listOf(10,15,25,50,75,100,150,200,250,500,750,1000,2500,5000,10000,20000,50000),
        'C' to listOf(50,100,150,200,250,500,750,1000,1500,2000,2500,5000,7500,10000,15000,20000,50000),
        'D' to listOf(50,100,150,200,250,300,400,500,750,1000,1500,2000,3000,4000,5000,7500,10000,15000,20000,25000,30000,50000),
        'E' to listOf(200,300,350,1000,1500,2500,3000,4000,5500,6000,7500,8000,9000,10000,13000,15000,20000,25000,30000,35000,40000,50000,75000,100000),
        'F' to listOf(50,250,350,400,500,750,1000,1500,2000,3000,4000,5000,6000,7500,10000,12500,15000,20000,25000,30000,40000,50000,60000,75000,100000),
        'G' to listOf(50,75,100,150,200,250,500,750,1000,1500,2000,2500,3000,4000,5000,6000,7500,10000,12500,15000,20000,25000,30000,40000,50000,60000,75000,100000),
        'H' to listOf(500,1000,2500,5000,7500,10000,15000,20000,25000,30000,40000,50000,75000,100000),
        'I' to listOf(5000,10000,15000,20000,25000,30000,40000,50000,60000,75000,100000,125000,150000,200000,300000),
        )
}