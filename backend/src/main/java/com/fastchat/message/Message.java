package com.fastchat.message;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("messages")
public class Message {

    @Id
    private String id;
    private String text;

    public Message(String text) {
        this.text = text;
    }

}
