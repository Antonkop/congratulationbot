package com.kop.congratulationbot.service

import com.kop.congratulationbot.service.model.Person
import java.util.*

interface AdminService {
    fun addPerson(person: Person): Person
    fun editPerson(id: UUID): Person
    fun removePerson(id: UUID): Boolean
}