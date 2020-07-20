package com.mgcoder.financecalcws.entities;

import javax.persistence.*;

@Entity
public abstract class FinanceEntity {
    @Id
    protected Integer id;
    protected String description;

    public FinanceEntity() {
        this(null, null);
    }

    public FinanceEntity(Integer id, String description) {
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
