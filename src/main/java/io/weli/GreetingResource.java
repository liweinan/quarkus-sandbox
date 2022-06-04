package io.weli;

import io.weli.db.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/")
public class GreetingResource {

    @Path("/hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/p")
    @Produces(MediaType.TEXT_PLAIN)
    public String p(@QueryParam("q") String q) {
        return "Q: " + q;
    }

    @GET
    @Path("/page")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> page(@QueryParam("page") String page, @QueryParam("page_size") String page_size) {
        List users = new ArrayList();
        users.add(new User());
        return users;
    }
}