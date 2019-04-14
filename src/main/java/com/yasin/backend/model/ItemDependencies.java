package com.yasin.backend.model;

import com.yasin.backend.model.AbstractModel;
import com.yasin.backend.model.TodoItem;
import com.yasin.backend.model.TodoList;

import javax.persistence.*;

@Entity
@Table(name = "item_dependencies", catalog = "todolist")
public class ItemDependencies extends AbstractModel {
    @ManyToOne(targetEntity = TodoList.class, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", name = "item_id")
    private TodoItem list;

    @ManyToOne(targetEntity = TodoList.class, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", name = "dependent_id")
    private TodoItem dependent;

    public TodoItem getList() {
        return list;
    }

    public void setList(TodoItem list) {
        this.list = list;
    }

    public TodoItem getDependent() {
        return dependent;
    }

    public void setDependent(TodoItem dependent) {
        this.dependent = dependent;
    }
}
