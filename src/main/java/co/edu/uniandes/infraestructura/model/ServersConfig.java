package co.edu.uniandes.infraestructura.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import co.edu.uniandes.infraestructura.rest.ServerSerializer;

@XmlRootElement(name = "servers_config")
public class ServersConfig {

	@XmlElement
	@JsonSerialize(using = ServerSerializer.class)
	private List<Server> servers;
	@JsonProperty("servers_changed")
	private Boolean servers_changed = Boolean.FALSE;
	@JsonProperty("ssl_grade")
	private String ssl_grade;
	@JsonProperty("previous_ssl_grade")
	private String previous_ssl_grade;
	@JsonProperty("logo")
	private String logo;
	@JsonProperty("is_down")
	private Boolean is_down = Boolean.FALSE;

	public ServersConfig() {

	}

	public List<Server> getServers() {
		return servers;
	}

	public void setServers(List<Server> servers) {
		this.servers = servers;
	}

	public Boolean getServers_changed() {
		return servers_changed;
	}

	public void setServers_changed(Boolean servers_changed) {
		this.servers_changed = servers_changed;
	}

	public String getSsl_grade() {
		return ssl_grade;
	}

	public void setSsl_grade(String ssl_grade) {
		this.ssl_grade = ssl_grade;
	}

	public String getPrevious_ssl_grade() {
		return previous_ssl_grade;
	}

	public void setPrevious_ssl_grade(String previous_ssl_grade) {
		this.previous_ssl_grade = previous_ssl_grade;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Boolean getIs_down() {
		return is_down;
	}

	public void setIs_down(Boolean is_down) {
		this.is_down = is_down;
	}

}
