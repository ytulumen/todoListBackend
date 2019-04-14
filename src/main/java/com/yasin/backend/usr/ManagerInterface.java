package com.yasin.backend.usr;

import java.text.ParseException;

public interface ManagerInterface<T> {
    void insert(T item) throws ParseException;

    T findById(int id);
}