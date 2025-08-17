package com;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter marks:  ");
//		int marks = sc.nextInt();
//		
//		if(marks >50 && marks <=100) {
//			System.out.println("You are passed!!!");
//			if(marks > 90 && marks <=100) {
//				System.out.println("Grade A");
//			}
//			else if(marks > 70 && marks <=90) {
//				System.out.println("Grade B");
//			}
//			else if(marks > 50 && marks <=70) {
//				System.out.println("Grade C");		
//			}
//				
//		}else if(marks <=50 && marks >=0){
//			System.out.println("Failed!!!");
//		}else {
//			System.out.println("Invalid");
//		}
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		
//		boolean hasLicense = true;
		
		
		
		if(age>=18) {
			System.out.println("Do you have License");
			boolean hasLicense = sc.nextBoolean();
			
			
			if(hasLicense) {
				System.out.println("You can drive");		
			}else {
				System.out.println("Apply for License");		
			}
			
		}	else {
			System.out.println("You are Minor you can not drive");
		}
		
		
		
		
		
		
	}

}
