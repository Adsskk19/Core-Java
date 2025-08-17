package com;

public class Tests {
	public static void main(String[] args) {
		
		User user = new User();	
	//	user.age = 20;	
	//	user.name = "YYYYY";
	//System.out.println(user.age);
		
		user.setAge(10);
		user.setName("Kiran");
		
		System.out.println(user.getAge());	
		
		System.out.println(user.getName());
	}
}