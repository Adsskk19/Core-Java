package com;

import java.util.Scanner;

public class SumOfEvenAndOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		SumOfEvenAndOdd obj = new SumOfEvenAndOdd();
		obj.sumOfNums(num);
		sc.close();
		}
	
	void sumOfNums(int num) {
		int sum=0,sum1=0;
		for(int i = 0;i<=num;i++) {
				if(i%2==0) {
					sum = sum+i;
			}else {
				 sum1 = sum1 +i;
			}
			
		}
		System.out.println("Sum of Even Digits is :"+sum);
		System.out.println("Sum of Odd Digits is :"+sum1);
	}

}
