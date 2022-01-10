package com.kop.congratulationbot.db

import org.springframework.data.jpa.repository.JpaRepository

interface TextTemplateRepository : JpaRepository<TextTemplate, Long> {
}