package com.donelleharris.springblogremix.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Post {

    private Long id;
    private String title;
    private String body;
    private Category category;
    private Date date;

    public Post(){}

    public Post(String title, String body, Date date){
        this.title = title;
        this.body = body;
        this.date = date;
    }

    public Post(Long id, String title, String body, Date date) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.date = date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
