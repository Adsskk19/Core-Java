package com.stream;

public class Employee {
	
	int id;
	
	String name;
	
	int salary;
	public Employee() {
		
	}

	public Employee(int aid, String aName, int aSalary) {
		super();
		this.id = aid;
		this.name = aName;
		this.salary= aSalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	

}
