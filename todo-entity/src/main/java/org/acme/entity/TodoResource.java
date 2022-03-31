package org.acme.entity;

import io.quarkus.panache.common.Sort;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TodoResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    public List<Todo> getAll() {
        return Todo.listAll(Sort.by("order"));
    }

    @GET
    @Path("/search/{word}/{page}")
    public List<Todo> search(@PathParam("word") String word, @PathParam("page") Integer pageIndex) {
        return Todo.search(word, pageIndex);
    };
}