package br.com.p3.servlet;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.p3.model.Material;

@Path("/material")
public class MateriaisServlet {
	
	// http://localhost:8080/MateriaisService/rest/material
	
	private static List<Material> materiais = new ArrayList<>();

	@GET
	@Path("/")
	@Produces("application/json")
	public Response getAll() {
		String json = "[";
		
		for (Material material : materiais) {
			json += (json.length() == 1 ? "" : ",") + material.toJson();
		}
		
		json += "]";
		
		return Response.status(200).entity(json).build();
	}
	
	@POST
	@Path("/")
	@Consumes("application/json")
	public Response insert(Material material) {
		materiais.add(material);
		
		return Response.status(201).entity("Success").build();
	}

	
}
