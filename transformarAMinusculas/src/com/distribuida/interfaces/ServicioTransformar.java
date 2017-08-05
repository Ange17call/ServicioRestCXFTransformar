package com.distribuida.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


public interface ServicioTransformar {
	

	 @GET
	 @Path("/transformar")
	 @Consumes({ MediaType.APPLICATION_JSON })
	 @Produces({ MediaType.APPLICATION_JSON })
	 public String transformar(@QueryParam(value="texto") String texto);
	
	 
	 
}
