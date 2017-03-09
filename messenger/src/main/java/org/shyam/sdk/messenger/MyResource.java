/**
 * Copyright 2016-2017 Shyam Bhimani
 */

package org.shyam.sdk.messenger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myresource")
public class MyResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessages(){
		return "Hello World";
	}

}
