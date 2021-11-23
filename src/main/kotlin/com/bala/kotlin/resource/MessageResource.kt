package com.bala.kotlin.resource

import com.bala.kotlin.data.Message
import com.bala.kotlin.service.MessageService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource (val service: MessageService) {

    @GetMapping("/")
    fun hello(model: Model): String {
        model["title"] = "Hello"
        return "hello"
    }

    @GetMapping("/messages")
    fun getMessages(): List<Message> {
        return service.findMessages()
    }

    @PostMapping
    fun saveMessage(@RequestBody message: Message){
        service.saveMessage(message)
    }

}
