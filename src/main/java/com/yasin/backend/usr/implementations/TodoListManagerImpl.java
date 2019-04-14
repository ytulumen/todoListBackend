package com.yasin.backend.usr.implementations;

import com.yasin.backend.dao.TodoListDAO;
import com.yasin.backend.usr.TodoListManager;
import com.yasin.backend.model.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "todoListManager")
public class TodoListManagerImpl extends BaseManager<TodoList> implements TodoListManager {

    @Autowired
    private TodoListDAO dao;

    public List<TodoList> findByOwnerId(int owner) {
        return dao.findByOwnerId(owner);
    }

    public void delete(TodoList item) {
        dao.delete(item);
    }
}
