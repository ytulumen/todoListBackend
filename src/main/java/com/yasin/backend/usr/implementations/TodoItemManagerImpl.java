package com.yasin.backend.usr.implementations;

import com.yasin.backend.dao.TodoItemDAO;
import com.yasin.backend.usr.TodoItemManager;
import com.yasin.backend.model.TodoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "todoItemManager")
public class TodoItemManagerImpl extends BaseManager<TodoItem> implements TodoItemManager {

    @Autowired
    private TodoItemDAO dao;

    @Transactional
    public void delete(TodoItem item) {
        dao.delete(item);
    }

    @Transactional
    public void edit(TodoItem item) {
        dao.edit(item);
    }

    public List<TodoItem> findAll(int listId) {
        return dao.findAll(listId);
    }
}
