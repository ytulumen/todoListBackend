package com.yasin.backend.usr.implementations;

import com.yasin.backend.dao.DAOInterface;
import com.yasin.backend.usr.ManagerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public abstract class BaseManager<T> implements ManagerInterface<T> {

    @Autowired
    private DAOInterface<T> dao;

    @Transactional
    public void insert(T item) {
        dao.insert(item);
    }

    public T findById(int id) {
        return dao.findById(id);
    }

}
