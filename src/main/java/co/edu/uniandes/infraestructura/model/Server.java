package co.edu.uniandes.infraestructura.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Server {

	@JsonProperty("address")
	private String address;
	@JsonProperty("ssl_grade")
	private String ssl_grade;
	@JsonProperty("country")
	private String country;
	@JsonProperty("owner")
	private String owner;

	public Server() {

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSsl_grade() {
		return ssl_grade;
	}

	public void setSsl_grade(String ssl_grade) {
		this.ssl_grade = ssl_grade;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
