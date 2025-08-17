package com;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Floor num:  ");
		int num = sc.nextInt();
		switch(num) {
		   case 1:
			System.out.println("1st Floor");
			break;
		   case 2:
			   System.out.println("2nd Floor");
			   break;
		   case 3:
			   System.out.println("3rd floor");
			   break;
		   default:	
			   System.out.println("Unknown floor");
		
		}
	}

}
