package com;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		ArmstrongNumber obj = new ArmstrongNumber();
		int output= obj.isArmstrong(num);
		if(output==num) {
			System.out.println("Given number is Armstrong Number!");
		}else {
			System.out.println("Given number is Not an Armstrong Number!");
		}
		
		
		sc.close();
	}
	int isArmstrong(int numb){
		String numString = String.valueOf(numb);
		int size = numString.length();
		
		//System.out.println(size);
		int output =0;
		for(int i =0;i<size;i++) {
			int temp = numb%10;
			numb = numb/10;
			int res =  (int) Math.pow(temp, size);
			output = res+ output;
			
		}
		
		return output;
		
	}
}
