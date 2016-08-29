package com.example.switchyard.switchyard_example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface ExampleEndpointResource {

	@GET
	@Path("execute")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Sample execute(String foo); 
	
}
