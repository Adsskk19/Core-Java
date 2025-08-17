package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class HashSetOperation {
	public static void main(String[] args) {
		
		
		Set<Students> stu = new HashSet<Students>();
		Students st1 = new Students(1,"AAA");
		Students st2 = new Students(2,"BBB");
		Students st3 = new Students(2,"BBB");

		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		 
		
		stu.add(st1);
		stu.add(st2);
		stu.add(st3);
		
		System.out.println(stu);
		
		//Set<Integer> nums = new TreeSet<Integer>();
		//null
//		nums.add(null);
//		nums.add(null);
//		nums.add(null);
//		System.out.println(nums);
		
		ArrayList<Integer> nu = new ArrayList<Integer>();
		nu.add(null);
		nu.add(null);
		nu.add(3);
		System.out.println(nu);
		
	}

}

class Students{
	
	int id;
	String name;
	public Students(){
		
	}
	public Students(int id, String name) {
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
		return "Students [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	

	
	
}
