package com;

import java.util.Arrays;

public class Company {
	
	String name;
	
	Employee[] employees;
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1,"Fayaz",100);
		Employee emp2 = new Employee(2,"YYYY",10000);
	//	Employee emp3 = 
		
		Employee[] emps = new Employee[3];
		
		emps[0]=emp1;
		emps[1]=emp2;
		emps[2]= new Employee(3,"XXXXX",10023);
		
		Company company = new Company();
		company.name="FLM";
		company.employees=emps;
		System.out.println(company);
		
		Employee[] emps2 = new Employee[2];
		
		Company company2 = new Company("Facebook",emps);
		System.out.println(company2);
		
	
	}
	public Company() {
		
	}

	public Company(String name, Employee[] employees) {
		super();
		this.name = name;
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", employees=" + Arrays.toString(employees) + "]";
	}
	
	
	
	
	
	
	

}
