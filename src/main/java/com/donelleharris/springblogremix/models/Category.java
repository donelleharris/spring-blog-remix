package com.donelleharris.springblogremix.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {

    private Long id;
    private String name;

    public Category() {

    }

    public Category(String name) {
        this.name = name;
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
