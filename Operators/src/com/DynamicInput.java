package com;

import java.util.Scanner;

public class DynamicInput {
	

	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter marks :  ");
			int marks = sc.nextInt();
			String res = (marks>90)&& (marks<=100)? "Grade A" : (marks>70)&& (marks<=90)?"Grade B": 
				(marks>50)&& (marks<=70)?"Grade C":(marks>0)&& (marks<50)?"fail":"invalid input";
			System.out.println(marks + " marks and "+res);
			sc.nextLine();//Empty one for space
			
			System.out.println("Enter name1:  ");
			String name1 = sc.nextLine();//will accept spaces
			System.out.println(name1);
			
			System.out.println("Enter name2:  ");
			String name2 = sc.next();//will not accept spaces
			System.out.println(name2);
			
			sc.close(); // scanner closed to remove warning
		//scanner is a resource any resource should be closed at end after it can't be used.

			
			
			
			
			
			
		}

	}


