package com.fastchat.controller;

import com.fastchat.models.Message;
import com.fastchat.repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/message")
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @PostMapping("/add")
    public void addMessage(@RequestParam String message) {

    }

    @GetMapping("/list")
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

}
