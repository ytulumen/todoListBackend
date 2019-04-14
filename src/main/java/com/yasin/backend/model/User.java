package com.yasin.backend.model;

import com.yasin.backend.model.AbstractModel;

import javax.persistence.*;

@Entity
@Table(name = "user", catalog = "todolist", uniqueConstraints = {
        @UniqueConstraint(columnNames = "username")})

@NamedQueries(@NamedQuery(
        name = "findUserByName",
        query = "SELECT e FROM User e WHERE e.username = :username")
)
public class User extends AbstractModel {
    @Column(name = "username", unique = true, nullable = false, length = 30)
    private String username;

    @Column(name = "password", nullable = false, length = 30)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
