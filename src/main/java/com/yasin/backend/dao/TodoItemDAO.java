package com.yasin.backend.dao;

import com.yasin.backend.model.TodoItem;

import java.util.List;

public interface TodoItemDAO extends DAOInterface<TodoItem> {
    void delete(TodoItem item);

    void edit(TodoItem item);

    List<TodoItem> findAll(int listId);
}
