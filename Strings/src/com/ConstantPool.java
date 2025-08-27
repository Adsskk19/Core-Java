package com;

public class ConstantPool {
	public static void main(String[] args) {
		String s1 ="FLM";
		String s2 = "FLM";
		//when comparing object -> it will compare address
		System.out.println(s1 == s2);
		
		String s3 = "EDU";
		String s4 = "edu";
		System.out.println(s3==s4);
		
		String s5 = new String("Edutech");
		String s6 = new String("Edutech");
		
		//It compares address only both objects are different.
	//System.out.println(s5==s6); //== will compare address

		// compare content
		System.out.println(s5.equals(s6));
		System.out.println(s1.equals(s2));
		
		//
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
		
		
		
	}

}
