package com;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address adr = new Address("123456");
		
		Employee emp = new Employee(1,"Fayaz",adr);
		System.out.println(emp);
		
		Object emp2 = (Employee)emp.clone();
		System.out.println("Cloned Obj:"+emp2);
		
		emp.name = "XYS";
		emp.address.pincode="533330";
		System.out.println(emp);
		System.out.println("Updated Clone");
		//we should've to achieve deep copy
		System.out.println("Cloned Obj:"+emp2);
	}

}
