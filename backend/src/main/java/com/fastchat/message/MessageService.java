package com.fastchat.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public void addMessage(String text) {
        messageRepository.save(new Message(text));
    }

    public List<Message> getMessages() {
        return messageRepository.findAll();
    }

    public String getTextFromFirstMessage() {
        return getMessages().get(0).getText();
    }

}
