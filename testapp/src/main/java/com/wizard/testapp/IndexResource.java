package com.wizard.testapp;

import java.util.Arrays;
import java.util.List;
import com.yammer.metrics.annotation.Timed; 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class IndexResource {

	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	@Timed
	public List<Blog> index() {
		return Arrays.asList(new Blog("My first blog", "www.google.com"));
	}
	
	
}
