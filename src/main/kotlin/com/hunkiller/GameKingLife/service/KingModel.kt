package com.hunkiller.GameKingLife.service

import com.hunkiller.GameKingLife.repository.entity.KingEntity
import java.util.*

data class KingModel(
    val name : String,
    val age : Int,
    val administration : Int,
    val military : Int,
    val learning : Int,
    val diplomacy : Int,
    val intrigue : Int,
) {
    fun toEntity() = KingEntity(
        id = UUID.randomUUID(),
        name = name,
        age = age,
        administration = administration,
        military = military,
        learning = learning,
        diplomacy = diplomacy,
        intrigue = intrigue,
    )
}