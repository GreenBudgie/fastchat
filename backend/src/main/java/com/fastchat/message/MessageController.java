package com.fastchat.message;

import org.springframework.beans.factory.annotation.Autowired;
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
    public void addMessage(@RequestBody String text) {
        messageService.addMessage(text);
    }

    @GetMapping()
    public List<Message> getAllMessages() {
        return messageService.getMessages();
    }

    @GetMapping("test")
    public String getFirstMessageText() {
        return messageService.getTextFromFirstMessage();
    }

}
