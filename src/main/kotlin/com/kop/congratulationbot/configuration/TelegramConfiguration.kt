package com.kop.congratulationbot.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.telegram.telegrambots.bots.DefaultBotOptions

@Configuration
class TelegramConfiguration {

    @Bean
    fun defaultBotOptions(): DefaultBotOptions {
        return DefaultBotOptions()
    }

//    @Bean
//    fun telegramBotsApi(bot: Bot): TelegramBotsApi {
//        val botsApi = TelegramBotsApi(DefaultBotSession::class.java)
//        botsApi.registerBot(bot)
//        return botsApi
//    }
}