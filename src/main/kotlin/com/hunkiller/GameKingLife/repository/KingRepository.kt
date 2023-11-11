package com.hunkiller.GameKingLife.repository

import com.hunkiller.GameKingLife.repository.entity.KingEntity

interface KingRepository {
    fun save(kingEntity: KingEntity): KingEntity
}