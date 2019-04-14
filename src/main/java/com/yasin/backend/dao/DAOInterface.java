package com.yasin.backend.dao;

public interface DAOInterface<T> {
    void insert(T item);

    T findById(int id);
}
