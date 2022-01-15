package com.kop.congratulationbot.service.model

import com.kop.congratulationbot.enums.Role
import com.kop.congratulationbot.enums.Strategy
import java.time.LocalDate
import java.util.*

data class Person(
    val id: UUID,
    val firstName: String,
    val lastName: String,
    val birthday: LocalDate,
    val role: Role,
    val strategy: Strategy,
    val telegramId: String
)
