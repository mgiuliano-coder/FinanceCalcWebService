package com.mgcoder.financecalcws.entities;

import javax.persistence.*;

@Entity
public class Expense {
    @Id
    private Integer id;
    private String description;
    private Integer categoryId;
    private Double amount;

    public Expense() {
        this(0, null, null,null);
    }

    public Expense(Integer id, String description, Double amount, Integer categoryId) {
        this.id = id;
        this.description = description;
        this.categoryId = categoryId;
        this.amount = amount;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
