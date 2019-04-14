package com.yasin.backend.usr;

import com.yasin.backend.model.User;

public interface UserManager extends ManagerInterface<User> {
    User findByName(String name);
}
