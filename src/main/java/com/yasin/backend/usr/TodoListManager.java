package com.yasin.backend.usr;

import com.yasin.backend.model.TodoList;

import java.util.List;

public interface TodoListManager extends ManagerInterface<TodoList> {
    List<TodoList> findByOwnerId(int owner);

    void delete(TodoList item);
}
