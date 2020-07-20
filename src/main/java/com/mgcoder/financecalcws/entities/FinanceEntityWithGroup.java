package com.mgcoder.financecalcws.entities;

import javax.persistence.*;

public abstract class FinanceEntityWithGroup extends FinanceEntity {
    protected Integer groupId;

    public FinanceEntityWithGroup() {
        this(null, null, null);
    }

    public FinanceEntityWithGroup(Integer id, String description, Integer groupId) {
        super(id, description);
        this.groupId = groupId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}
