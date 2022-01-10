package com.kop.congratulationbot.service

import com.kop.congratulationbot.db.TextTemplateRepository
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class TextGeneratorImpl(private val textTemplateRepository: TextTemplateRepository) : TextGenerator {

    override fun generateCongratulationText(telegramId: String, firstName: String, lastName: String): String {
        val maxId = textTemplateRepository.count()
        val randomId = Random.nextLong(1, maxId + 1) // +1 because until arg is exclusive
        val templateString = textTemplateRepository.getById(randomId).template?.format(telegramId)
        return templateString!!
    }
}