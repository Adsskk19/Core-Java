package com;

import java.util.Objects;

public class Person {
	
	int age;
	
	String name;
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.age=24;
		person1.name="Kiran";
		Person person2 = new Person(24,"Kiran");
		Person person3 = new Person();
		
		person3.setAge(26);
		person3.setName("Mani");
		
		boolean isSame = person1.equals(person2);
		System.out.println(isSame);
		boolean isSame2 = person2.equals(person3);
		System.out.println(isSame2);
		
		//Person person4 = null;
		//Null pointer Exception
		//person4.equals(person1);
		
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());// person1 & person2 are same but generates different hash codes
		System.out.println(person3.hashCode());
	
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.age,this.name);
		//hash is a static method  we called with class name.
	}
	
//	@Override
//	public String toString() {
//		return this.age+" "+this.name;
//	}
	
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		
		Person person = (Person) obj;//explicit type casting
//Why we did type casting?
//We are comparing age and name of two objects
//But we cannot access age and name with Parent class(Object class)Object.
//Hence we type casted object to Child class (Person class)	
		
		return this.age == person.age && this.name.equals(person.name);
//this.age is current class reference i.e person1, person.age is input i.e person2 with obj reference.	
//Objects.equals(name,person.name) is another form string comparison -> name.equals(person.name);	
		
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
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

	public Person() {
		
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

}
