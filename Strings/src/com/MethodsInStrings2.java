package com;

public class MethodsInStrings2 {
	public static void main(String[] args) {
		String s = "Hii     ";
		System.out.println(s.length());// len 8
		System.out.println(s);
		//System.out.println(s.trim());
		//System.out.println(s.length());// still 8
		//
		s = s.trim();
		System.out.println(s.trim().length());//3
		System.out.println(s.length());
		
		String st = "     Hii    FLM";
		st = st.trim();
		System.out.println(st.length());
		System.out.println(st);
		
		String s1 ="FLM Hyd";
		//System.out.println(s1.replace('H', 'B'));
		System.out.println(s1.replace("Hyd", "Bng"));
		//java is case sensitive
		System.out.println(s1.replace("hyd", "Chennai"));
		
		String s2 = "abcaaabcaa";
		System.out.println(s2.replace("aa", "bb"));
		System.out.println(s2.replaceFirst("aa","nnnnnn"));
		
		String s3 = "helloo";
		System.out.println(s3.toUpperCase());
		
		String s4 = "KIRAN KUMMAR";
		System.out.println(s4.toLowerCase());
		
		
		
		
		
		
	}

}
