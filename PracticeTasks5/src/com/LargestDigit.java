package com;

import java.util.Scanner;

public class LargestDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		LargestDigit obj = new LargestDigit();
		obj.isLargestDigit(num);
	}
	void isLargestDigit(int number) {
		for(int i =0;i<=number;i++) {
			int temp=number%10; 
			number = number/10;
			if(temp>temp) {
				System.out.println(temp);
			}
			
		}
	}

}
