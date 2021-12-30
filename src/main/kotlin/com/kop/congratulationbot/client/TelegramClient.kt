package com.kop.congratulationbot.client

interface TelegramClient {
    fun sendCongratulation(userId: String, text: String)
}