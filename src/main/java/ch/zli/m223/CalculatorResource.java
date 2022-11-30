package ch.zli.m223;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/calculator")
public class CalculatorResource {

    @GET
    @Path("/add/{base}/{addition}")
    public String add(@PathParam("base") String base, @PathParam("addition") String addition) {
        int result = Integer.parseInt(base) + Integer.parseInt(addition);
        return String.valueOf(result);
    }

}
