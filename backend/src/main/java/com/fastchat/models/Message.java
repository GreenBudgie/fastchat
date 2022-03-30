package com.fastchat.models;

import com.fastchat.repo.MessageRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Message {

    @Id
    private String id;
    private String text;

    public Message(String text) {
        this.text = text;
    }

}
