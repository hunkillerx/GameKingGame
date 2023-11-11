package com.hunkiller.GameKingLife.service

import com.hunkiller.GameKingLife.entrypoint.dto.NewKingDto

interface KingService {
    fun newKing(newKingDto: KingModel)
}