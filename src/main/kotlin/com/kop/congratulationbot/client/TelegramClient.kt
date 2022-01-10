package com.kop.congratulationbot.client

interface TelegramClient {
    fun sendCongratulation(messageText: String, telegramId: String)
}