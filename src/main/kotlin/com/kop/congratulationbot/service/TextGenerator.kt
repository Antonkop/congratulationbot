package com.kop.congratulationbot.service

interface TextGenerator {
    fun generateCongratulationText(telegramId: String, firstName: String, lastName: String): String
}