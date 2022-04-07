package com.fastchat.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/message")
public class MessageController {

    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping()
    public void addMessage(@RequestBody Message message) {
        messageService.addMessage(message);
    }

    @GetMapping()
    public List<Message> getAllMessages() {
        return messageService.getMessages();
    }

    @MessageMapping("/receiveMessage")
    @SendTo("/topic/messages")
    public String listenAndSendMessage(String text) {
        return text;
    }

}
