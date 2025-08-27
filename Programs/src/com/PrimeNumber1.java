package com;

import java.util.Scanner;

public class PrimeNumber1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = sc.nextInt();
		PrimeNumber1 obj = new PrimeNumber1();
		obj.prime1(num);
		obj.prime2(num);
		obj.prime3(num);
		obj.prime4(num);
		obj.prime5(num);
		sc.close();
	}
	void prime1(int num) {
		long startTime = System.currentTimeMillis();
		int count =0;
		for(int i =1; i<=num;i++) {
			
			if(num%i ==0) {
				count++;
			}
		}
		long endTime = System.currentTimeMillis();
		
		if(count ==2) {
			System.out.println("Prime case 1: "+ num +" is Prime number");
		}else {
			System.out.println("Prime case 1: "+ num +" is not a Prime number");
		}
		System.out.println("Time taken : "+ (endTime-startTime));

	}
	
	void prime2(int num) {
		long startTime = System.currentTimeMillis();

		int count =0;
		for(int i =2; i<=num;i++) {
			
			if(num%i ==0) {
				count++;
			}
		}
		long endTime = System.currentTimeMillis();
		
		if(count ==1) {
			System.out.println("Prime case 2: "+ num +" is Prime number");
		}else {
			System.out.println("Prime case 2: "+ num +" is Not a Prime number");
		}
		System.out.println("Time taken : "+ (endTime-startTime));
	}
	
	void prime3(int num) {
		long startTime = System.currentTimeMillis();

		int count =0;
		for(int i =2; i<=num/2;i++) {
			
			if(num%i ==0) {
				count++;
			}
		}
		long endTime = System.currentTimeMillis();
		
		if(count ==0) {
			System.out.println("Prime case 3: "+ num +" is Prime number");
		}else {
			System.out.println("Prime case 3: "+ num +" is Not a Prime number");
		}
		System.out.println("Time taken : "+ (endTime-startTime));
	}
	
	void prime4(int num) {
		long startTime = System.currentTimeMillis();

		int count =0;
		for(int i =2; i<=num-1;i++) {
			
			if(num%i ==0) {
				count++;
			}
		}
		long endTime = System.currentTimeMillis();
		
		if(count ==0) {
			System.out.println("Prime case 4: "+ num +" is Prime number");
		}else {
			System.out.println("Prime case 4: "+ num +" is Not a Prime number");
		}
		System.out.println("Time taken : "+ (endTime-startTime));
	}
	
	void prime5(int num) {
		long startTime = System.currentTimeMillis();

		int count =0;
		for(int i =2; i<=Math.sqrt(num);i++) {
			
			if(num%i ==0) {
				count++;
			}
		}
		long endTime = System.currentTimeMillis();
		
		if(count ==0) {
			System.out.println("Prime case 5: "+ num +" is Prime number");
		}else {
			System.out.println("Prime case 5: "+ num +" is Not a Prime number");
		}
		System.out.println("Time taken : "+ (endTime-startTime));
	}
	

}
