package com.bala.kotlin

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringJpaApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringJpaApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}
