package co.edu.uniandes.infraestructura.rest;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class ResourceConfiguration extends ResourceConfig {

	public ResourceConfiguration() {
		super(AnalyzerSource.class, MyObjectMapperProvider.class, ExceptionMappingTestResource.class,
				JacksonFeature.class);
	}

}
