package com.program;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(10,10,12,20,20,30,30));
		System.out.println(nums);
	
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(Integer num :nums) {
			if(!result.contains(num)) {
				result.add(num);
			}
		}
		System.out.println(result);
	
	}

}
