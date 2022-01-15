package com.kop.congratulationbot.client

import com.kop.congratulationbot.enums.Strategy
import com.kop.congratulationbot.service.TextGenerator
import com.kop.congratulationbot.service.model.Person
import org.springframework.stereotype.Component
import org.telegram.telegrambots.bots.DefaultBotOptions
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update


@Component
class TelegramClient(
    options: DefaultBotOptions?,
    private val telegramProperties: TelegramProperties,
    private val textGenerator: TextGenerator
) : TelegramLongPollingBot(options), CongratulationClient {

    override fun getBotToken(): String = telegramProperties.token

    override fun getBotUsername(): String = telegramProperties.id

    override fun onUpdateReceived(p0: Update?) = TODO("Not yet implemented")

    override fun sendCongratulation(person: Person) {
        val messageText = textGenerator.generateCongratulationText(
            person.telegramId,
            person.firstName,
            person.lastName
        )
        val message = SendMessage()
        message.chatId = telegramProperties.chatId
        message.text = messageText
        execute(message)
    }

    override fun supportStrategy(strategy: Strategy?): Boolean {
        return Strategy.TELEGRAM == strategy
    }
}