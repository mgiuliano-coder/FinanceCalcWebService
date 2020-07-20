package com.mgcoder.financecalcws.entities;

import javax.persistence.*;

@Entity
public class Liability {
    @Id
    private Integer id;
    private String description;
    private Integer categoryId;
    private Double amountOwed;

    public Liability() {
        this(0, null, null, null);
    }

    public Liability(Integer id, String description, Double amountOwed, Integer categoryId) {
        this.id = id;
        this.description = description;
        this.categoryId = categoryId;
        this.amountOwed = amountOwed;
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

    public Double getAmountOwed() {
        return amountOwed;
    }

    public void setAmountOwed(Double amountOwed) {
        this.amountOwed = amountOwed;
    }
}
