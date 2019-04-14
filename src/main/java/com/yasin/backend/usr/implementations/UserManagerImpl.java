package com.yasin.backend.usr.implementations;

import com.yasin.backend.dao.UserDAO;
import com.yasin.backend.usr.UserManager;
import com.yasin.backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userManager")
public class UserManagerImpl extends BaseManager<User> implements UserManager {

    @Autowired
    private UserDAO userDao;

    public User findByName(String name) {
        return userDao.findByName(name);
    }
}
