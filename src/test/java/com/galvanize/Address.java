

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
		return street + "," + city + "," + state + "," + zip;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getStreet() {
		return this.street;
	}
	
	public void setCity(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return this.street;
	}
	
	public void setState(String street) {
		this.street = street;
	}
	
	public String getState() {
		return this.street;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getZip() {
		return this.zip;
	}
	
}