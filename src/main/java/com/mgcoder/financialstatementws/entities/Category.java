package com.mgcoder.financecalcws.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    private Integer id;
    private Integer userId;
    private String description;

    public Category() {
        this(0, 0, null);
    }

    public Category(@NonNull Integer id, @NonNull Integer userId, String description) {
        this.id = id;
        this.userId = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(@NonNull Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(@NonNull Integer userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}