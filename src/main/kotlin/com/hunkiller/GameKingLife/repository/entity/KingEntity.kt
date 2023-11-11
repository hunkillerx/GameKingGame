package com.hunkiller.GameKingLife.repository.entity

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator
import java.util.*

@Entity
@Table(name= "king")
data class KingEntity(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id")
    val id: UUID? = null,
    @Column(name = "name")
    val name: String,
    @Column(name = "age")
    val age: Int = 0,
    @Column(name = "administration")
    val administration: Int = 0,
    @Column(name = "military")
    val military: Int = 0,
    @Column(name = "learning")
    val learning: Int = 0,
    @Column(name = "diplomacy")
    val diplomacy: Int = 0,
    @Column(name = "intrigue")
    val intrigue: Int = 0,
) {
}
