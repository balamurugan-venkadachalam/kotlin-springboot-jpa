package com.bala.kotlin.service

import com.bala.kotlin.data.Message
import com.bala.kotlin.data.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService (val db: MessageRepository) {
    fun findMessages(): List<Message>{
        return db.findMessages()
    }

    fun saveMessage(message: Message){
        db.save(message)
    }
}
