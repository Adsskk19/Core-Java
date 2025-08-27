package com;

public class Test2 {
	public static void main(String[] args) {
		Test2 t = new Test2();
		int res = t.sumOfTwoNumbers(39, 41);
		//System.out.println(res/2);
		t.division(res);
		
	}

	int sumOfTwoNumbers(int a , int b) {
		int c = a+b;
		System.out.println(c);
		return c;
	}
	
	void division(int a) {
		int d = a/2;
		System.out.println(d);
	}
}
