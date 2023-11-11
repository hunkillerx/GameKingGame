package com.hunkiller.GameKingLife.repository

import com.hunkiller.GameKingLife.repository.entity.KingEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class KingRepositoryImpl(
    val repository: KingRepositorySpringData
): KingRepository {
    override fun save(kingEntity: KingEntity): KingEntity {
        val enr = kingEntity
      return repository.save(kingEntity)
    }
}
interface KingRepositorySpringData: CrudRepository<KingEntity, UUID> {
}