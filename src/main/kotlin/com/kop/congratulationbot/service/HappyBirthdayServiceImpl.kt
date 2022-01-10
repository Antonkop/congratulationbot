package com.kop.congratulationbot.service

import com.kop.congratulationbot.client.TelegramClient
import com.kop.congratulationbot.db.PersonEntityRepository
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.time.LocalDate
import java.util.function.Consumer

@Component
class HappyBirthdayServiceImpl(
    private val personEntityRepository: PersonEntityRepository,
    private val telegramClient: TelegramClient,
    private val textGenerator: TextGenerator
) : HappyBirthdayService {

    @Scheduled(cron = "0 0 12 * * *")
    override fun checkAndCongrats() {
        personEntityRepository.getAllBirthdayToday(LocalDate.now())
            .forEach(Consumer { person ->
                val congratulationText = textGenerator
                    .generateCongratulationText(
                        person.telegramId,
                        person.firstName.orEmpty(),
                        person.lastName.orEmpty()
                    )
                telegramClient.sendCongratulation(congratulationText, person.telegramId)
            })
    }
}