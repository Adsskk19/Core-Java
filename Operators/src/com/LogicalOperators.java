package com;

public class LogicalOperators {
	
	
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		System.out.println(b1&&b2);
		System.out.println(b1 && b3);
		System.out.println(b2&& b4);
		//OR
		System.out.println("OR ");

		System.out.println(b1||b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b4);
		
		System.out.println(b1 && b2 && b4);
		
		System.out.println(b1 || b2 || b4);
		
		System.out.println(b1 || b2 && b4);
		//&& has highest precedence
		System.out.println(b1 || b2 && b3 || b4);
		// T || F && T || F
		//
		System.out.println(b2 || b1 && (b2|| b4 ));
		// brackets has high precedence.
		int num1 = 10;
		int num2 = 30;
		int num3 = 10;
		
		boolean result = (num1 < num2) && (num2>=num3);
		System.out.println("result is :"+result);
		boolean res2 = (num1>= num3)|| (num1 != num3)&& (num2<num3);		
		System.out.println(!res2);
		
		
		
		
	}

}
