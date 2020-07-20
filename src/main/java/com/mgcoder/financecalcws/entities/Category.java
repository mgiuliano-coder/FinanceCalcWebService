package com.mgcoder.financecalcws.entities;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    private Integer id;
    private String description;

    public Category() {
        this(0, null);
    }

    public Category(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}