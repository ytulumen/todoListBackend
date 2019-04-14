package com.yasin.backend.dao.implementations;

import com.yasin.backend.dao.DAOInterface;
import com.yasin.backend.model.AbstractModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DAOImpl<T extends AbstractModel> implements DAOInterface<T> {

    @PersistenceContext
    EntityManager entityManager;

    Class<T> clazz;

    String query;

    public void setClassType(Class clazz) {
        this.clazz = clazz;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void insert(T item) {
        entityManager.persist(item);
    }

    public T findById(int id) {
        return entityManager.find(clazz, id);
    }
}
