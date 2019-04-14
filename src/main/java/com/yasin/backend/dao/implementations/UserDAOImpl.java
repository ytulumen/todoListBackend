package com.yasin.backend.dao.implementations;

import com.yasin.backend.dao.UserDAO;
import com.yasin.backend.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserDAOImpl extends DAOImpl<User> implements UserDAO {
    public UserDAOImpl() {
        super.setClassType(User.class);
        super.setQuery("findUserByName"); // todo: set named query
    }

    public User findByName(String name) {
        return entityManager.createNamedQuery(query, clazz).setParameter("username", name).getSingleResult();
    }
}
