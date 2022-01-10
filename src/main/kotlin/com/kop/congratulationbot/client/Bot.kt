package com.kop.congratulationbot.client

import org.springframework.stereotype.Component
import org.telegram.telegrambots.bots.DefaultBotOptions
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update


@Component
class Bot(options: DefaultBotOptions?, private val telegramProperties: TelegramProperties) :
    TelegramLongPollingBot(options), TelegramClient {
    override fun getBotToken(): String {
        return telegramProperties.token
    }

    override fun getBotUsername(): String {
        return telegramProperties.id
    }

    override fun onUpdateReceived(p0: Update?) {
        TODO("Not yet implemented")
    }

    override fun sendCongratulation(messageText: String, telegramId: String) {
        val message = SendMessage()
        message.chatId = telegramProperties.chatId
        message.text = messageText
        execute(message)
    }


}