package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFrequency {
	
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>(Arrays.asList("apple","guava","apple","mango","mango"));
		
		Map<String, Long> frequency =fruits
		.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(frequency);
		
		String fruit = "apple";
		
		Map<Character, Long> charFrequency = fruit
			.chars()
			.mapToObj(c->(char)c)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(charFrequency);
		
		int a[]= {1,2,3,4,5,6};
		
		Arrays.stream(a)
		.filter(n->n%2==0)
		//.forEach(n->System.out.println(n));
		.forEach(System.out::println); //Method reference
		
		
		
	}

}
