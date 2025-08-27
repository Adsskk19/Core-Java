package com;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter how many times...");
//		
//		//count -> how many times
//		int times = sc.nextInt();
//		
//		for(int i =1; i<=times ;i++) {
//			System.out.println(i +"times");
//		}
		
		//while -> up to when??
		System.out.println("Enter number");
		int times = sc.nextInt();
		while(times !=0) {
			System.out.println(times+"Times");
			times = sc.nextInt(); 
		}
		
		sc.close();
	}

}
