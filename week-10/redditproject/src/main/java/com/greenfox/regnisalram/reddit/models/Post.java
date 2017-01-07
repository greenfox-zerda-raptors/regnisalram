package com.greenfox.regnisalram.reddit.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by regnisalram on 1/4/17.
 */
@Entity

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String postTitle;

    @Column(length=1048576)
    private String postMessage;

    private int score;

    private LocalDateTime createdAt;

    public Post() {
    }

    public Post(String title, String message) {
        this.postTitle = title;
        this.postMessage = message;
        this.createdAt = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostMessage() {
        return postMessage;
    }

    public void setPostMessage(String postMessage) {
        this.postMessage = postMessage;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getFormattedDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return createdAt.format(formatter);
    }
}
