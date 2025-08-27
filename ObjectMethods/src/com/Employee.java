package com;

public class Employee implements Cloneable{
	int empId;
	Address address;
	String name;
	
	public Employee() {
		
	}

	public Employee(int empId, String name,Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;

	}	
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", address=" + address + ", name=" + name + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee clonedEmp = (Employee)super.clone();
		
		clonedEmp.address = new Address(this.address.pincode);
		
		return clonedEmp;
}	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	
		
		
		 
	
	

}
