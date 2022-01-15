package com.kop.congratulationbot.service

import com.kop.congratulationbot.client.CongratulationClient
import com.kop.congratulationbot.db.PersonEntityRepository
import com.kop.congratulationbot.service.mapper.PersonMapper
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class HappyBirthdayServiceImpl(
    private val personEntityRepository: PersonEntityRepository,
    private val clients: Set<CongratulationClient>,
    private val personMapper: PersonMapper
) : HappyBirthdayService {

    @Scheduled(cron = "0 0 12 * * *")
    override fun checkAndCongrats() {
        personEntityRepository.getAllBirthdayToday(LocalDate.now())
            .forEach { person ->
                val mappedPerson = personMapper.mapPerson(person)
                clients
                    .filter { client -> client.supportStrategy(mappedPerson.strategy) }
                    .forEach { client -> client.sendCongratulation(mappedPerson) }
            }
    }
}