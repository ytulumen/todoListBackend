package com.yasin.backend.model;


import com.yasin.backend.model.AbstractModel;
import com.yasin.backend.model.User;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "todo_list", catalog = "todolist")

public class TodoList extends AbstractModel {
    @ManyToOne(targetEntity = User.class, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", name = "owner_id")
    private User user;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "created_date")
    private Date createdDate;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
