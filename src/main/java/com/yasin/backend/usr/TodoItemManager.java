package com.yasin.backend.usr;

import com.yasin.backend.model.TodoItem;

import java.util.List;

public interface TodoItemManager extends ManagerInterface<TodoItem> {
    void delete(TodoItem item);

    void edit(TodoItem item);

    List<TodoItem> findAll(int listId);
}
