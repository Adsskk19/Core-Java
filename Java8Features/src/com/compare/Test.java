package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(10,"XXXXXX"));
		students.add(new Student(2,"YYYYYY"));
		students.add(new Student(31,"ZZZZZZ"));
		students.add(new Student(45,"TTTTTT"));
		students.add(new Student(4,"TTTTTT"));
		System.out.println(students);
		
		Collections.sort(students);
		
		System.out.println(students);
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(234,"Java","Fayaz"));
		employees.add(new Employee(123,"Python","Kiran"));
		employees.add(new Employee(456,"C","Mani"));
		employees.add(new Employee(109,"C++","Ravi"));
		employees.add(new Employee(670,"C#","Abhi"));
//		System.out.println("---------ID Comparator-------------");
//		Collections.sort(employees,new IdComparator());
//		System.out.println(employees);
		System.out.println("---------Name Comparator-------------");
		Collections.sort(employees,new NameComparator());
		System.out.println(employees);
		
		Comparator<Employee> companyComparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {

				return emp1.domain.compareTo(emp2.domain);
			}
			
		};
		
		Collections.sort(employees,companyComparator );
		System.out.println(employees);
		
		
		System.out.println("-----------Id comparator with lambda function------------");
		
		Comparator<Employee> idComparator = (Employee e1 ,Employee e2)->{return Integer.compare(e1.empId,e2.empId);};
		Collections.sort(employees,idComparator);
		System.out.println(employees);

		System.out.println("-----------Domain comparator with lambda function------------");

		Collections.sort(employees, (e1,e2)->e1.domain.compareTo(e2.domain));
		System.out.println(employees);
		//code lines reduced by lambda.
		
		
		
		
		TreeSet<Employee> empSet = new TreeSet<Employee>(idComparator);
		empSet.add(new Employee(234,"Java","Fayaz"));
		empSet.add(new Employee(123,"Python","Kiran"));
		empSet.add(new Employee(456,"C","Mani"));
		empSet.add(new Employee(109,"C++","Ravi"));
		empSet.add(new Employee(670,"C#","Abhi"));
		
		System.err.println(empSet);
		
		
		
		
		
		
		
		
		
		
	}

}
