package com;

public class TernaryOperator {
	public static void main(String[] args) {
		int a = 10;
		int b= 12;
		
		boolean res = (a>b)? true: false;
		System.out.println(res);
		String res1 = (a<b)? "a is Small": "a is large";
		System.out.println(res1);
		
		int num = -2;
		String output= (num>0)? "Positive number":"Negative number";
		System.out.println(output);
		
		//Nested Ternary Operator
		num =0;
		String output1= (num>0)? "Positive number":(num==0)?"Zero":"Negative number";
		System.out.println(output1);

	}

}
