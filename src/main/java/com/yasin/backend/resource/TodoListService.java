package com.yasin.backend.resource;

import com.google.gson.Gson;
import com.yasin.backend.usr.TodoListManager;
import com.yasin.backend.model.TodoList;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;

public class TodoListService extends BaseService<TodoList> {

    @Autowired
    private TodoListManager manager;

    @Path("/id={id}")
    @DELETE
    @Produces("application/json")
    public void delete(@PathParam("id") int id) {

        try {
            manager.delete(manager.findById(id));
        } catch (IllegalArgumentException | NullPointerException | javax.persistence.PersistenceException | org.springframework.orm.jpa.JpaSystemException e) {
            e.printStackTrace();
        }
    }

    @Path("/id={id}")
    @GET
    @Produces("application/json")
    public String findByOwnerId(@PathParam("id") int id) {
        try {
            Gson gson = new Gson();
            TodoList list = manager.findById(id);
            return gson.toJson(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
