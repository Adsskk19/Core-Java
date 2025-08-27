package com;

public class Department {
	
	private String name;
	private int numOfStudents;
	//has a relation /aggregation
	//loosely coupled 
	Professor professor;
	
	public Department() {
		
	}

	public Department(String name, int numOfStudents, Professor professor) {
		super();
		this.name = name;
		this.numOfStudents = numOfStudents;
		this.professor = professor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfStudents() {
		return numOfStudents;
	}

	public void setNumOfStudents(int numOfStudents) {
		this.numOfStudents = numOfStudents;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", numOfStudents=" + numOfStudents + ", professor=" + professor + "]";
	}
	
	
	

}
