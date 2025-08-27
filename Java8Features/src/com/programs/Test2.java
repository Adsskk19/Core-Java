package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
	
	public static void main(String[] args) {
		//Single value by Sum		
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Integer sum = nums
		.stream()
		.reduce(0,(a,b)->a+b);
	
	System.out.println(nums);
//Single value by Mul	
	Integer multiply = nums
	.stream()
	.reduce(1,(a,b)->a*b);
	System.out.println(multiply);
	
List<String> words = new ArrayList<String>(Arrays.asList("Kiran","is","a","Java","Developer"));
	
//Reduce Strings in to single sentence
	String finalString = words
		.stream()
		.reduce("",(a,b)->a+" "+b);
	System.out.println(finalString.trim());
	
	
	}

}
