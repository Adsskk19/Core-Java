package com;

import java.util.Scanner;

public class MethodsInStrings {
	public static void main(String[] args) {
		
		MethodsInStrings obj = new MethodsInStrings();
		obj.findLength("FLM");
		obj.findLength("FLMEdutech");
		obj.findLength("Kiran");
		
		
//		Scanner sc = new Scanner(System.in);
//		String input = sc.nextLine();
//		obj.printCharAtIndex(input, 2);
		
		//obj.printCharAtIndex("Hi", 4);
		obj.printCharAtIndex("JAVAA",1);
		obj.printCharAtIndex("FLMEdutech", 3);
		obj.checkIfEmpty(""); //true
		obj.checkIfEmpty(" ");
		obj.findLength(" ");
		obj.checkIfEmpty("Kumar"); //false
		obj.checkIfBlank("   ");
		obj.findLength("        A");
		obj.checkEqualsIgnoreCase("FLM", "flm");
		
		//FlM Edutech, FLM
		String s1 = "FLM";
		String s2 = "FLM edutech";		//Java is case sensitive
		System.out.println("Contains : "+s2.contains("Tech"));
		System.out.println(s2.startsWith("FLM"));
		System.out.println("Ends with :" + s2.endsWith("Edutech"));
		System.out.println(s2.indexOf('L'));
		//will always return 1st found index
		System.out.println(s2.indexOf('e'));
		System.out.println(s2.lastIndexOf('e'));
		System.out.println(s2.lastIndexOf('j'));
		//it return default value -1 when nothing found
		
		
		//substring
		
		//companies ask mostly on this
		//Programming -> 0-10  end_index+1
		String s3 = "Programming";
		System.out.println(s3.substring(1, 4));
		System.out.println(s3.substring(7,11));
		System.out.println(s3.substring(7));
		System.out.println(s3.substring(1));
		//System.out.println(s3.substring(1,12));//out of bound exception);
				
	}
	void findLength(String s) {
		//String s = "FLM";
		System.out.println(s.length());
		
	}
	void printCharAtIndex(String s,int index) {
		
		//s = "FLM";
		System.out.println(s.charAt(index));
	}
	
	void checkIfEmpty(String s) {
		System.out.println(s.isEmpty());
	}
	void checkIfBlank(String s) {
		System.out.println(s.isBlank());
	}
	void checkEqualsIgnoreCase(String s1, String s2) {
	//FLM , flm compares content will not consider Uppercase and lowercase
		System.out.println(s1.equalsIgnoreCase(s2));
	}
	
	
	

	
	
//	void temp() {
//		String s = "FLMEductech";
//		String s1 = "FLMEductech";
//		
//		String st = new String("FLM");
//		String st2 = new String("FLM");
//		
//		System.out.println(s1 == s);
//		System.out.println(st==st2);
//		System.out.println(st.equals(st2));
//		//comparing literal and object
//		System.out.println(st.equals(s1));
//	}

}
