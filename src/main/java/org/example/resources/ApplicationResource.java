package org.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
@Path("/rest")
public class ApplicationResource {


    @GET
    @Path("/homepage")
    public Response homepage() {
        return
                Response.status(Response.Status.OK)
                        .entity("This is the home page")
                        .build();
    }

}