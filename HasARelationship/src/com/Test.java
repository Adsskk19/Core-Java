package com;

public class Test {
	
	public static void main(String[] args) {
		
		Professor professor = new Professor();
		professor.setName("Rathod");
		professor.setExperience(8);
		professor.setSubject("JAVA");
		
//		String name = professor.getName();
//		System.out.println(name);
//		String subject = professor.getSubject();
//		System.out.println(subject);
//		int experience = professor.getExperience();
//		System.out.println(experience);		
//		System.out.println(professor);
		
		
		Department department = new Department();
		department.setName("CSE");
		department.setNumOfStudents(200);
		department.setProfessor(professor);
		
		Department department2 = new Department();
		department2.setName("ECE");
		department2.setNumOfStudents(150);
		department2.setProfessor(new Professor("Kumar","python",10));
		
		Department department3 = new Department("Mech",100,new Professor("Fayaz","Mechanics",10));

	 System.out.println(department);
	 System.out.println(department2);
	 System.out.println(department3);
	
		
	}
	


}
