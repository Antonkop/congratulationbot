package com.kop.congratulationbot.db;

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface PersonEntityRepository : JpaRepository<PersonEntity, UUID> {
}