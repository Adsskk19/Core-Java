package com;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number..");
		int number = sc.nextInt();
		PrimeNumbers obj = new PrimeNumbers();
		
		
		for(int i=1;i<=number;i++) {
			obj.primeNums(i);
		}
		sc.close();
	}
	
	void primeNums(int num){
		int count =0;
		for(int k=1;k<=num;k++) {
			if(num%k==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.print(num+" " );
			
		//"Prime numbers From 1 to given number is  " +
		
		}
		
		
	}
	
}
