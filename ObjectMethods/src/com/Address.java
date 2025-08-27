package com;

public class Address {
	String pincode;
	
	public Address() {
		
	}

	public Address(String pincode) {
		super();
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + "]";
	}

}
