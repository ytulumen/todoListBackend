package com.yasin.backend.resource;

import com.google.gson.Gson;
import com.yasin.backend.usr.implementations.BaseManager;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;

public abstract class BaseService<T> {

    @Autowired
    private BaseManager<T> manager;

    @POST
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public void add(T item) {
        try {
            manager.insert(item);
        } catch (IllegalArgumentException | NullPointerException | javax.persistence.PersistenceException e) {
            e.printStackTrace();
        }
    }

    @Path("/id={id}")
    @GET
    @Produces("application/json")
    public String findById(@PathParam("id") int id) {
        try {
            Gson gson = new Gson();
            T item = manager.findById(id);
            return gson.toJson(item);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
