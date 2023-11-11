package com.hunkiller.GameKingLife.entrypoint.dto

import com.hunkiller.GameKingLife.service.KingModel

data class NewKingDto(
    val name: String,
    val age: Int? = 0,
    val administration: Int? = 0,
    val military: Int? = 0,
    val learning: Int? = 0,
    val diplomacy: Int? = 0,
    val intrigue: Int? = 0,
) {
    fun toModel() = KingModel(
        name = name,
        age = age!!,
        administration = administration!!,
        military = military!!,
        learning = learning!!,
        diplomacy = diplomacy!!,
        intrigue = intrigue!!,
    )
}