package com.kop.congratulationbot.db

import com.kop.congratulationbot.enums.Role
import java.time.LocalDate
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "person_entity")
class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: UUID? = null

    @Column(name = "first_name")
    val firstName: String? = null

    @Column(name = "last_name")
    val lastName: String? = null

    @Column(name = "birthday")
    val birthday: LocalDate? = null

    @Column(name = "telegram_id", nullable = false)
    val telegramId: String = ""

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    val role: Role? = null
}