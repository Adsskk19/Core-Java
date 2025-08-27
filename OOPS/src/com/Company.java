package com;

public class Company {
	static String companyName;
	//all your objects share static variable common data.
	String location;
	int numOfEmployees;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}
	
	
    Company(String companyName, String location, int numOfEmployees) {
		companyName = companyName;
		location = location;
		numOfEmployees = numOfEmployees;
	}
	
}
