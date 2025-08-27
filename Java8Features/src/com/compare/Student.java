package com.compare;

public class Student implements Comparable<Student>{
	int id;
	String name;
	
	public Student() {
		
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Student student) {
		//positive ,negative , 0
		//return (this.id == student.id)?0:(this.id > student.id)?11:-10;

        return this.name.compareTo(student.name);	
		
		
	}
	
	
}
