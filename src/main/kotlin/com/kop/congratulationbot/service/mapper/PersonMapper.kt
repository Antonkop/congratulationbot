package com.kop.congratulationbot.service.mapper

import com.kop.congratulationbot.db.PersonEntity
import com.kop.congratulationbot.service.model.Person
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface PersonMapper {
    fun mapPerson(personEntity: PersonEntity): Person
}