package com;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num : ");
		int num = sc.nextInt();
		int sum = 0;
		while(num>0) {
			sum = sum +num%10; //ctrl + shift + i to see num%10 debugging value
			num = num/10;
			
		}
		System.out.println("Sum of digites : "+sum);
	sc.close();
	}
}
