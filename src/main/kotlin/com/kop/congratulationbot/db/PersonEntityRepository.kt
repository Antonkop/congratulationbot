package com.kop.congratulationbot.db

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.time.LocalDate
import java.util.*

interface PersonEntityRepository : JpaRepository<PersonEntity, UUID> {

    @Query(
        value = "select * from person_entity\n" +
                "WHERE DATE_PART('day', birthday) = date_part('day', CURRENT_DATE)\n" +
                "  AND DATE_PART('month', birthday) = date_part('month', CURRENT_DATE)", nativeQuery = true
    )
    fun getAllBirthdayToday(birthday: LocalDate): List<PersonEntity>

}