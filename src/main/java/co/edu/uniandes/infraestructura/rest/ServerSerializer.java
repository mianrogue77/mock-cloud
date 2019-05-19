package co.edu.uniandes.infraestructura.rest;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import co.edu.uniandes.infraestructura.model.Server;

public class ServerSerializer extends JsonSerializer<List<Server>> {

	@Override
	public void serialize(List<Server> value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		jgen.writeStartArray();
		
		for (Server severe : value) {
			jgen.writeStartObject();
			jgen.writeObjectField("severe", severe);
			jgen.writeEndObject();
		}
		
		jgen.writeEndArray();
	}

}
