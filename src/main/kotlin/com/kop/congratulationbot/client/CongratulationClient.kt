package com.kop.congratulationbot.client

import com.kop.congratulationbot.enums.Strategy
import com.kop.congratulationbot.service.model.Person

interface CongratulationClient {
    fun sendCongratulation(person: Person)

    fun supportStrategy(strategy: Strategy?): Boolean
}