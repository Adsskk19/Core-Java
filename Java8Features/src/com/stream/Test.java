package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>(Arrays.asList(10,10, 20, 27, 30, 37, 2, 4, 17));

		// for
		// for each
		// Iterator /ListIterator
		// in-built method in java
		//->for each in Lambda ->it expects parameter 
		//of Consumer interface.
      nums.forEach((n)->System.out.print(n+", ")); 

List<Integer> even = nums
				       .stream()
				       .filter((n) -> n%2 == 0) // Intermediate operation
				     //.forEach((n)->System.out.println(n));
				       .collect(Collectors.toList()); // Terminal Operation
		System.out.println(even);
List<Integer> sortedList=nums
		 	             .stream()
		 	             .sorted(Comparator.reverseOrder())
		                 .toList();
		System.out.println(sortedList);
//terminal operation also removed .collect(Collectors.toList())
//in new version java17  use directly .toList();

List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Fayaz",10000));
		employees.add(new Employee(1,"Daamu",150000));
		employees.add(new Employee(1,"Uppi",20000));
		employees.add(new Employee(1,"Suppi",35000));
		//Salary greater than one Lakh
	    employees
				 .stream()
				 .filter((emp)-> emp.salary >100000)
				 .forEach(emp->System.out.println(emp));
		
//Sort the list using java 8		
List<Employee> sortedEmployees =employees
				.stream()
				.sorted((emp1,emp2)->Integer.compare(emp1.salary, emp2.salary))
				.toList();
		System.out.println(sortedEmployees);
		
//map vadi data ni sort cheyali
//here map is method in streams not Collections map.
		employees
		.stream()
		.map((emp)->emp.salary+=5000)
		.forEach((n)->System.out.println(n));
//Salary 5% Increment	
List<Integer>	salaries1=
		employees
		.stream()
		.map((emp)->emp.salary+=5000)
		.toList();
	System.out.println(salaries1);
//It gives only updated salaries only not entire objects	
		
//To get all employees objects with updated salaries
//we use: new Employee(emp.id,emp.name,emp.salary+=5000)	
List<Employee>	salaries2=
			employees
			.stream()
			.map((emp)->new Employee(emp.id,emp.name,emp.salary+=5000))
			.toList();
		System.out.println(salaries2);
		
	List<Employee> names = employees
			.stream()
			.filter(emp-> emp.name.startsWith("F"))
			.toList();
	System.out.println(names);
	
	//remove duplicates
	List<Integer> unique=nums
	.stream()
	.distinct()
	.toList();
	System.out.println(unique);
	
//First Max value	
	Integer integer =
			       nums
	                .stream()
	                .sorted(Comparator.reverseOrder())
	                .findFirst()
	                .get();
		System.out.println(integer);
		
//Second Max Value which has Duplicates		
Integer secondHighest = nums
				.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		System.out.println(secondHighest);
					
		
	}

}
