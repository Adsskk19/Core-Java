package com;

public class Test {
	
	int num3;
	Integer num4;
	//All classes in java have default null value.
	public static void main(String[] args) {
		int a =10;
		
		Integer b =new Integer(20);
		//Deprecated in java9
		System.out.println(a);
		System.out.println(b);
		
		//AutoBoxing
		Integer c = Integer.valueOf(a);//java5
		Integer e =a;
		System.out.println(e);
		//JVM internally calls and assigns
		//Autoboxing automatically happens
		
		//Auto Un-Boxing	
		int d = b.intValue();
		int f =b;
		System.out.println(f);
		
		String s ="200";
		int num = Integer.parseInt(s);
		System.out.println(s+2);
		System.out.println(num+2);
		
		String numString = String.valueOf(num);
		System.out.println(numString+3);
		
		Test obj = new Test();
		System.out.println(obj.num3);
		System.out.println(obj.num4);
		
		
		
	}

}
