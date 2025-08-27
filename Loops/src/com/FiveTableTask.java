package com;

import java.util.Scanner;

public class FiveTableTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table number: ");
		int num = sc.nextInt();
		for (int i=1; i<=20;i++) {
			System.out.println(num +" x "+ i +" = "+ (num*i));
		}
	}

}
