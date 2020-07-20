package com.mgcoder.financecalcws.entities;

import javafx.animation.ScaleTransition;

import javax.persistence.*;

@Entity
public class Asset {
    @Id
    private Integer id;
    private String description;
    private Integer categoryId;
    private Double amountSpent;
    private Double currentValue;

    public Asset() {
        this(0, null, null, null, null);
    }

    public Asset(Integer id, String description, Double amountSpent, Double currentValue, Integer categoryId) {
        this.id = id;
        this.description = description;
        this.categoryId = categoryId;
        this.amountSpent = amountSpent;
        this.currentValue = currentValue;
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
