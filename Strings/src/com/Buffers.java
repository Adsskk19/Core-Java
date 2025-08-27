package com;

public class Buffers {
	public static void main(String[] args) {
		//Notes
		StringBuffer sb = new StringBuffer("Java");
		sb.append(" World");//concatination
		sb.insert(4, ",");
		//Java, world
		sb.replace(6, 11, "Programming");
		//Java, Programming
		sb.delete(5, 6);//space removed
		
		System.out.println(sb);
		System.out.println(sb.length());//16
		System.out.println(sb);
		System.out.println(sb.capacity());//20
		System.out.println(sb);
		sb.append("123456789");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		String s = sb.toString();
		//String buffer -> to String
		System.out.println(s);
		
		
		//we given capacity
		StringBuilder sb2 = new StringBuilder(50);
		System.out.println(sb2.capacity());
		
	}

}
