package io.weli;

import io.quarkus.panache.common.Page;
import io.weli.db.User;
import org.jboss.logging.Logger;

import javax.inject.Inject;
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

    @Inject
    Logger logger;

    @GET
    @Path("/page")
    @Produces(MediaType.APPLICATION_JSON)
    public UsersWithTotalPage page(@QueryParam("page") String page, @QueryParam("page_size") String page_size) {
        var query = User.findAll().page(Page.of(Integer.parseInt(page) - 1, Integer.parseInt(page_size)));
        var users = query.list();
        var totalPage = query.pageCount();
        var response = new UsersWithTotalPage();
        var userNames = new ArrayList<String>();
        for (Object user : users) {
            logger.info("User -> " + user);
            userNames.add(((User) user).getName());
        }
        response.setUsers(userNames);
        response.setTotalPage(totalPage);
        return response;
    }
}