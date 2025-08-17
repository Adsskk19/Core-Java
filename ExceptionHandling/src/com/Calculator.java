package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		try {
			System.out.println("Enter number 1 :");
			int num1 = sc.nextInt();
			System.out.println("Enter number 2 :");
			int num2 = sc.nextInt();
			int num3 = num1/num2;
			System.exit(0);
			System.out.println(num3);
			System.out.println("Hiii");
			//sc.close();
		}
	 //catch(Exception e){} 
		
		catch(ArithmeticException | InputMismatchException e) {
			//System.out.println(e.getMessage());
			System.out.println(e);
			//System.out.println("Divided by zero Not possible..");
		}
//		catch(InputMismatchException e) {
//			System.out.println(e);
//		}
//		catch(Exception e){
//			System.out.println(e);
//		} 
		//At end we write Parent Exception class
	
		finally{
			System.out.println("Entered Finally");
			sc.close();
		}
		
		//Runtime exception /unchecked exception
		System.out.println("Byeee");
		
	}

}
