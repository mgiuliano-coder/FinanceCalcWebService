package com.mgcoder.financecalcws.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class Liability {
    @Id
    private Integer id;
    private Integer userId;
    private String description;
    private Integer categoryId;
    private Double amountOwed;

    public Liability() {
        this(0, 0, null, null, null);
    }

    public Liability(@NonNull Integer id, @NonNull Integer userId, String description, Double amountOwed, Integer categoryId) {
        this.id = id;
        this.description = description;
        this.categoryId = categoryId;
        this.amountOwed = amountOwed;
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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Double getAmountOwed() {
        return amountOwed;
    }

    public void setAmountOwed(Double amountOwed) {
        this.amountOwed = amountOwed;
    }
}
