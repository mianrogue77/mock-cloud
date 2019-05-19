package co.edu.uniandes.infraestructura.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("parseExceptionTest")
public class ExceptionMappingTestResource {

	@Consumes(MediaType.APPLICATION_JSON)
	@PUT
	public DummyBean getAccount(DummyBean bean) {
		return bean;
	}
}
