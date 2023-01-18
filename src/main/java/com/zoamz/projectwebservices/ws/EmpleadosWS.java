/**
 * 
 */
package com.zoamz.projectwebservices.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.zoamz.projectwebservices.entity.Empleado;
import com.zoamz.projectwebservices.service.EmpleadoService;

/**
 * @author Zoamz WebService generado con Jersey
 */

@Path("empleadosWS") // pa indicar como acceder al WS desde navegador ej:
						// localhost:8080/project-webservices/zoamz/empleadoWS
public class EmpleadosWS {
	
	private EmpleadoService empleadoService = new EmpleadoService();
	
	@GET // pa indicar el tipo de petición para acceder al WS
	@Path("test") // localhost:8080/project-webservices/zoamz/empleadoWS/test
	public String test() {
		return "<h1>Probaaando probando probando con Jersey probandoooo el webserviceeeee</h1>";
	}
	
	@GET
	@Path("consultarEmpleado")
	@Produces(MediaType.APPLICATION_JSON) //Pa indicar el resultado a generar (el return)
	@Consumes(MediaType.APPLICATION_JSON) //Lo mismo que arriba pero para otras aplicaciones o webs
	public Empleado consultarEmpleado() {
		return this.empleadoService.consultarEmpleado();
	}
	
	@GET
	@Path("consultarEmpleados")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON) 
	public List<Empleado> consultarEmpleados(){			
		return empleadoService.consultarEmpleados();
	}
	
	@GET
	@Path("consultarEmpleadoPorNumeroEmpleado/{numEmp}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON) 	
	public Response consultarEmpleadoPorNumeroEmpleado(@PathParam("numEmp") String numeroEmpleado) {
		Empleado empleadoConsultado = this.empleadoService.consultarEmpleadoPorNumeroEmpleado(numeroEmpleado);
		
		if(empleadoConsultado == null) {
			return Response.noContent().build();
		}
		
		GenericEntity<Empleado> empleadoGeneric = new GenericEntity<Empleado>(empleadoConsultado, Empleado.class);
		return Response.ok(empleadoGeneric).build();
		
	}
	
	@POST
	@Path("guardarEmpleado")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON) 	
	public Response guardarEmpleado(Empleado empleado) {
	
		if (empleado == null) {
			return Response.status(400).entity("No se ingresó información del empleado, favor de capturar sus datos").build();
		}
		
		if (empleado.getNombre() == null || empleado.getNombre().isEmpty()) {
			return Response.status(400).entity("El nombre es requerido").build();			
		}
		
		GenericEntity<Empleado> empleadoGeneric = new GenericEntity<Empleado>(empleado, Empleado.class);
		return Response.ok(empleadoGeneric).build();
	}	
	
	
}
