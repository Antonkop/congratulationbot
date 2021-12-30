package com.kop.congratulationbot.client

import org.springframework.stereotype.Component

@Component
class TelegramClientImpl : TelegramClient {
    override fun sendCongratulation(userId: String, text: String) {
        TODO("Not yet implemented")
    }
}