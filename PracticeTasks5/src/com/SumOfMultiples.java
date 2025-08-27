package com;

import java.util.Scanner;

public class SumOfMultiples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		SumOfMultiples obj = new SumOfMultiples();
		obj.multiplesSum(num);
		
	}
	void multiplesSum(int num) {
		int sum=0,sum1=0;
		for(int i=0;i<=num;i++) {
			if(i%3==0) {
				sum+=i;
			}else if(i%5==0){
				sum1 +=i;
			}
		}
		System.out.println(sum+sum1);
	}

}
//For 17 we are getting 60 but we have to get75 15twice should repeat
