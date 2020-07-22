package com.mgcoder.financialstatementws.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class Asset {
    @Id
    private Integer id;
    private Integer userId;
    private String description;
    private Integer categoryId;
    private Double amountSpent;
    private Double currentValue;

    public Asset() {
        this(0, 0, null, null, null, null);
    }

    public Asset(@NonNull Integer id, @NonNull Integer userId, String description, Double amountSpent, Double currentValue, Integer categoryId) {
        this.id = id;
        this.userId = userId;
        this.description = description;
        this.categoryId = categoryId;
        this.amountSpent = amountSpent;
        this.currentValue = currentValue;
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

    public Double getAmountSpent() {
        return amountSpent;
    }

    public void setAmountSpent(Double amountSpent) {
        this.amountSpent = amountSpent;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }
}
