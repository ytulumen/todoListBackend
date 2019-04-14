package com.yasin.backend.dao;

import com.yasin.backend.model.User;

public interface UserDAO extends DAOInterface<User> {
    User findByName(String name);
}
