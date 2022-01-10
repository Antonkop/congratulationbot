package com.kop.congratulationbot.db

import javax.persistence.*

@Entity
@Table(name = "text_template")
class TextTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    val id: Long? = null

    @Column(name = "template", nullable = false, unique = true)
    val template: String? = null
}