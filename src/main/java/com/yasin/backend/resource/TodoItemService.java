package com.yasin.backend.resource;

import com.google.gson.Gson;
import com.yasin.backend.usr.TodoItemManager;
import com.yasin.backend.model.TodoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import java.util.List;

@Component
@Path("/todoItem")
public class TodoItemService extends BaseService<TodoItem> {
    @Autowired
    private TodoItemManager manager;

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

    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public void edit(TodoItem item) {
        try {
            manager.edit(item);
        } catch (IllegalArgumentException | NullPointerException | javax.persistence.PersistenceException e) {
            e.printStackTrace();
        }
    }

    @Path("/listId={id}")
    @GET
    @Produces("application/json")
    public String findAll(@PathParam("id") int listId) {
        Gson gson = new Gson();
        List<TodoItem> items = manager.findAll(listId);
        return gson.toJson(items);
    }

}
