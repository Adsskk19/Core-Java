package com;

import java.util.Scanner;

public class Arrays {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter no of students:  ");
			int size = sc.nextInt();
			double[] marks = new double[size];
					
			for (int x =0;x <marks.length;x++) {
				System.out.println("Enter the Marks for Student"+(x+1)+" :");
				marks[x] = sc.nextDouble();
			}
		
		
//			marks[0] = 10.00;
//			marks[1] = 6.9;
//			marks[2] = 8.9;
//			marks[3] = 8.9;
//			marks[4] = 4.9;			
//			System.out.println(marks[0]);
//			System.out.println(marks[1]);
//			System.out.println(marks[2]);
//			System.out.println(marks[3]);
//			System.out.println(marks[4]);
			
			for(int i=0;i<marks.length;i++) {
				System.out.println("Marks of student "+ (i+1) + "->"+marks[i]);
			}
			sc.close();			
		}
}
