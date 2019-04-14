package com.yasin.backend.dao.implementations;

import com.yasin.backend.dao.TodoItemDAO;
import com.yasin.backend.model.TodoItem;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
public class TodoItemDAOImpl extends DAOImpl<TodoItem> implements TodoItemDAO {
    public TodoItemDAOImpl() {
        super.setClassType(TodoItem.class);
        super.setQuery("findUserRoleByName"); // TODO: 9.04.2019 set named query
    }

    public void delete(TodoItem item) {
        entityManager.remove(entityManager.contains(item) ? item : entityManager.merge(item));
    }

    public void edit(TodoItem item) {
        TodoItem item1 = findById(item.getId());
        item1.setName(item.getName());
        item1.setDescription(item.getDescription());
        item1.setStatus(item.getStatus());
        entityManager.merge(item1);
    }

    public List<TodoItem> findAll(int listId) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<TodoItem> cq = builder.createQuery(clazz);
        Root<TodoItem> root = cq.from(clazz);
        cq.select(root);
        return entityManager.createQuery(cq).getResultList();
    }
}
