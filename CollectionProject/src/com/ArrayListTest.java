package com;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		//syntax
		//some methods in arrayList
		ArrayList li = new ArrayList();
		
		li.add(10);
		li.add(25.0);
		li.add(false);
		li.add("fayaz");
		li.add(new Employee("Kiran", 25));
		li.add(1,20);//1->index, 20 is value it is added
		//write operation not preferable
		//all will re-shuffle and takes lot time
		li.set(1,"FLM");//It replace that index value
		//li.remove(1);

		System.out.println(li);
		System.out.println(li.size());
		//System.out.println(li.get(3));
		System.out.println(li.contains("fayaz"));
		//System.out.println(li.lastIndexOf("fayaz"));
		System.out.println("Object is: "+li.get(5));
		//System.out.println("Object is: "+li.get(5).getName());
		//not possible thats why Generics

		//li.clear();
		ArrayList a2 = new ArrayList();
		System.out.println(a2.isEmpty());
		a2.addAll(li);
		System.out.println(a2);
		
		//<E> or T means accepts any datatype
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1234);
		//numbers.add("Kiran"); -->error
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Kiran",25));
		employees.add(new Employee("FLM",007));
		System.out.println(employees.get(0).getName());
		
		
		
		
		
	}

}

class Employee{
	
	String name;
	
	int age;

	public Employee(String name, int i) {
		super();
		this.name = name;
		this.age = i;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}
