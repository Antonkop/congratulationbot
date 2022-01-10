package com.kop.congratulationbot.client

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.validation.annotation.Validated
import javax.validation.constraints.NotEmpty

@Validated
@ConstructorBinding
@ConfigurationProperties("telegram")
data class TelegramProperties(
    @NotEmpty
    var id: String,
    @NotEmpty
    var token: String,
    @NotEmpty
    var chatId: String
)
