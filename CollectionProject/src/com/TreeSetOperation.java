package com;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetOperation {
	public static void main(String[] args) {
		
		
		Set<Integer> nums = new TreeSet<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(4);
		nums.add(120);
		
		System.out.println(nums);
		
		//Set is parent using as parent class reference
		Set<String> names = new TreeSet<String>(Arrays.asList("Hii","Ram","Krishna"));
		names.add("ABC");
		names.add("AAA");
		names.add("BBB");
		names.add("abc7");
		System.out.println(names);
		
		//It maintains insertion order
		Set<Integer> numsLinked = new LinkedHashSet<Integer>();
		numsLinked.add(10);
		numsLinked.add(20);
		numsLinked.add(30);
		numsLinked.add(2);
		numsLinked.add(4);
		numsLinked.add(12);
		System.out.println(numsLinked);
		

	}

}
