package com;

import java.util.Arrays;

public class SplitMethod {
	public static void main(String[] args) {
		String s = "Hi this is java class";
		String[] words =s.split(" ");
		
//		for(String word : words) {
//			System.out.println(word);
//		}
		//Arrays is a class in java
		//it has some default values
		
		System.out.println(Arrays.toString(words));
	
		String s2 = "Hi,this,is,java,class";
		String[] split = s2.split(",");
		System.out.println(Arrays.toString(split));	
	
		
	}

}
