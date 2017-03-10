
package com.galvanize;
import java.util.*;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public Address(String street, String city, String state, String zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(street);
		sb.append(", ");
		sb.append(city);
		sb.append(", ");
		sb.append(state);
		sb.append(" ");
		sb.append(zip);
		return sb.toString();
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getStreet() {
		return this.street;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getZip() {
		return this.zip;
	}
	
}