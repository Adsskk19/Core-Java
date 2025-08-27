package com;

public class Person {
	int age;
	
	String name;
	
	public void Person(int age,String names) {
		//Person
	}
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.age=25;
		person1.name="Kiran";
	
		//Person person2 = new Person(30,"ANBBDHD");
		
		Person person3 = new Person();
		person3.setAge(26);
		person3.setName("YYYY");
		
		//boolean b = person2.equals(person1);
		
		//boolean isSame = person1.equals(person2);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
