package com;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		MultiplicationTable obj = new MultiplicationTable();	
		obj.numTable(num);
		sc.close();
	}
	void numTable(int num){
		
		for(int i=1;i<=20;i++) {
			System.out.println(num +" x "+ i +" = "+(num*i));
		}
	}

}
