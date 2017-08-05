package com.distribuida.implementaciones;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.distribuida.interfaces.ServicioTransformar;

@Component(value="servicioTransformar")
public class ServicioTransformarImpl implements ServicioTransformar {
	
	@GET
	@Path("/transformar/{texto}")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public String transformar(@PathParam(value="texto") String texto){
		return texto.toLowerCase();
	}
}
