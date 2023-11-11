package com.hunkiller.GameKingLife.entrypoint.rest

import com.hunkiller.GameKingLife.entrypoint.dto.NewKingDto
import com.hunkiller.GameKingLife.service.KingService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/king")
class KingController(private val kingService: KingService) {

    @PostMapping("/new")
    fun newKing(
        @RequestBody newKingDto: NewKingDto,
    ): ResponseEntity<Unit> {
        return ResponseEntity.ok(kingService.newKing(newKingDto.toModel()))
    }
}