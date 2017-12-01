package com.surat.example.rest.service;

import org.glassfish.jersey.server.mvc.Viewable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/service")
public class RestService {
    @GET
    public Response getData(){
        return Response.ok().entity("Hello Java").build();
    }

    @GET
    @Path("/jsp")
    public Response getDataJsp(){
        return Response.ok().entity(new Viewable("/jsp/data.jsp")).build();
    }
}

