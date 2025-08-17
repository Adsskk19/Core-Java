package com;

//Make your variables private 
//use getters and setters they can't modify directly
public class User {
	
	private int age;
	private String name;
	
	//getters and setters
	public void setAge(int age) {
		if(age>0) {
			this.age = age;
		}
		else {
			System.out.println("Invalid Age!!!");
		}	
	}
	public int getAge() {
		return this.age; 
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
