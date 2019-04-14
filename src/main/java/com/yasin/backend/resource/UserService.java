package com.yasin.backend.resource;

import com.google.gson.Gson;
import com.yasin.backend.usr.UserManager;
import com.yasin.backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Component
@Path("/user")
public class UserService extends BaseService<User> {
    @Autowired
    private UserManager manager;

    @Path("/name={name}")
    @GET
    @Produces("application/json")
    public String findByName(@PathParam("name") String name) {


        try {
            Gson gson = new Gson();
            User user = manager.findByName(name);
            return gson.toJson(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
