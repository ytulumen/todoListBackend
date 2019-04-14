package com.yasin.backend.dao.implementations;

import com.yasin.backend.dao.TodoListDAO;
import com.yasin.backend.model.TodoList;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
public class TodoListDAOImpl extends DAOImpl<TodoList> implements TodoListDAO {
    public TodoListDAOImpl() {
        super.setClassType(TodoList.class);
        super.setQuery("findUserRoleByName"); // TODO: 9.04.2019 set named query
    }

    public List<TodoList> findByOwnerId(int owner) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<TodoList> cq = builder.createQuery(clazz);
        Root<TodoList> root = cq.from(clazz);
        cq.select(root);
        cq.where(builder.equal(root.get("owner_id"), owner));
        return entityManager.createQuery(cq).getResultList();
    }

    public void delete(TodoList item) {
        entityManager.remove(entityManager.contains(item) ? item : entityManager.merge(item));
    }
}
