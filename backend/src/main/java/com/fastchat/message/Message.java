package com.fastchat.message;

import com.fastchat.user.User;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Getter
@Setter
@ToString
@Entity
@Table
public class Message {

    @Id
    @SequenceGenerator(name = "message_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "message_sequence")
    private Long id;

    @ManyToOne
    private User author;
    private String text;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;

    public Message() {}

    public Message(User author, String text, Date dateCreated) {
        this.author = author;
        this.text = text;
        this.dateCreated = dateCreated;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Message message = (Message) o;
        return id != null && Objects.equals(id, message.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
