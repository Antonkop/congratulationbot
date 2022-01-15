package com.kop.congratulationbot.client

import com.kop.congratulationbot.enums.Strategy
import com.kop.congratulationbot.service.model.Person
import org.springframework.stereotype.Component

@Component
class EmailClient : CongratulationClient {

    override fun sendCongratulation(person: Person) {
        TODO("Not yet implemented")
    }

    override fun supportStrategy(strategy: Strategy?): Boolean {
        return Strategy.EMAIL == strategy
    }
}