package com.yasin.backend.dao;

import com.yasin.backend.model.TodoList;

import java.util.List;

public interface TodoListDAO extends DAOInterface<TodoList> {
    List<TodoList> findByOwnerId(int owner);

    void delete(TodoList item);
}
