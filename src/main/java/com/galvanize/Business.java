package com.galvanize;
import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable {
	
	private final String name;
	private final List<Address> addresses = new ArrayList<Address>();
	
	public Business(String name) {
		this.name = name;
	}

	public List getAddresses(){
		return addresses;
	}
	
	public void addAddress(Address address){
		addresses.add(address);
	};
	
	public String getName() {
		return this.name;
	}
	
}