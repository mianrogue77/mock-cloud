package co.edu.uniandes.infraestructura.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.edu.uniandes.infraestructura.model.Server;
import co.edu.uniandes.infraestructura.model.ServersConfig;

@Path("v3")
public class AnalyzerSource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAnalyze(@QueryParam("host") String host) throws Exception {
		ServersConfig serverConfig = this.buildResponse();
		return Response.ok(serverConfig).build();
	}

	private ServersConfig buildResponse() {
		List<Server> servers = new ArrayList<Server>();
		
		Server serverOne = new Server();
		serverOne.setAddress("server1");
		serverOne.setSsl_grade("B");
		serverOne.setCountry("US");
		serverOne.setOwner("Amazon.com, Inc");
		
		Server serverTwo = new Server();
		serverTwo.setAddress("server2");
		serverTwo.setSsl_grade("A+");
		serverTwo.setCountry("US");
		serverTwo.setOwner("Amazon.com, Inc");
		
		Server serverThree = new Server();
		serverThree.setAddress("server3");
		serverThree.setSsl_grade("A");
		serverThree.setCountry("US");
		serverThree.setOwner("Amazon.com, Inc");
		
		servers.add(serverOne);
		servers.add(serverTwo);
		servers.add(serverThree);
		
		ServersConfig serverConfig = new ServersConfig();
		serverConfig.setServers(servers);
		serverConfig.setServers_changed(Boolean.TRUE);
		serverConfig.setSsl_grade("B");
		serverConfig.setPrevious_ssl_grade("A+");
		serverConfig.setLogo("https://server.com/icon.png”");
		serverConfig.setIs_down(Boolean.FALSE);
		
		return serverConfig;
	}
	
}
