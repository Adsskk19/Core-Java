package com;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int num = sc.nextInt();
		IsPrime obj = new IsPrime();
		 obj.isPrime(num);
		sc.close();
	}

	void isPrime(int num) {
		int count = 0;
		for(int i = 2;i<=Math.sqrt(num);i++) {
			if (num%i==0) {
				count++;
			}	
		}
		if(count == 0) {
			System.out.println("Given number "+ num+ " is Prime");
		}else {
			System.out.println("Given number "+ num+" Not a Prime");
		}
		
	}

}
