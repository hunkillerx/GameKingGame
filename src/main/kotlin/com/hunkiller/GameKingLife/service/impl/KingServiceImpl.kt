package com.hunkiller.GameKingLife.service.impl

import com.hunkiller.GameKingLife.entrypoint.dto.NewKingDto
import com.hunkiller.GameKingLife.repository.KingRepository
import com.hunkiller.GameKingLife.service.KingModel
import com.hunkiller.GameKingLife.service.KingService
import org.springframework.stereotype.Service

@Service
class KingServiceImpl(
    val kingRepository: KingRepository
): KingService {
    override fun newKing(newKingDto: KingModel) {
        kingRepository.save(newKingDto.toEntity())
    }
}