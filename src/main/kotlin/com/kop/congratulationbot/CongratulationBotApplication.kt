package com.kop.congratulationbot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan
@EnableConfigurationProperties
@SpringBootApplication
class CongratulationBotApplication

fun main(args: Array<String>) {
	runApplication<CongratulationBotApplication>(*args)
}
