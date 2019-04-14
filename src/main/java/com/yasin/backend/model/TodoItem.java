package com.yasin.backend.model;

import com.yasin.backend.model.AbstractModel;
import com.yasin.backend.model.TodoList;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "todo_item", catalog = "todolist")
public class TodoItem extends AbstractModel {

    @OneToOne(targetEntity = TodoList.class, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", name = "list_id")
    private TodoList list;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "deadline", nullable = false)
    private Date deadline;

    @Column(name = "status", nullable = false)
    private int status;

    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    public TodoList getList() {
        return list;
    }

    public void setList(TodoList list) {
        this.list = list;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
