package com;

import java.util.Scanner;

public class Test {
	
	int a =10; //Non static //instance or global
	static int b = 20; //static with class name we can acess
	//Method -> which is used to execute a block of code.
	public static void main(String[] args) {
		
		Test t = new Test();
		t.sum();
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int d = sc.nextInt();
		t.sumTwoNumbers(c, d);
		
		
		t.sumTwoNumbers(10, 53);
		t.sumTwoNumbers(40,90);
		
		
		System.out.println("Done..");
		sc.close();
	}
	void sum() {
		int a =10; //local
		int b =20;
		int c =a +b;
		System.out.println(c);
	}
	// arguments /parameters
	void sumTwoNumbers(int a , int b) {
		int c =a +b;
		System.out.println(c);
	}

}
