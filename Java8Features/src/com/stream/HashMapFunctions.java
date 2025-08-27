package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;


public class HashMapFunctions {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> names  = new HashMap<Integer, String>();
		names.put(1, "Fayaz");
		names.put(2, "Mohan");
		names.put(3, "Nani");
		
		names
		.entrySet()
		.stream()
		.forEach(entry->System.out.println(entry.getKey()+" - "+ entry.getValue()));
		
		names
		.keySet()
		.stream()
		.forEach(key->System.out.println(key));
		
		names
		.values()
		.stream()
		.forEach(val->System.out.println(val));
		
		List<Integer>	keys = names
		.keySet()
		.stream()
		.toList();
		System.out.println(keys);
		
		Set<Integer> keys1 = names
				.keySet()
				.stream()
				.collect(Collectors.toSet());
				System.out.println(keys1);
				
		Map<Integer, String> filteredMap =names
		.entrySet()
		.stream()
		.filter(entry->entry.getKey()>=2)
		.collect(Collectors.toMap(entry->entry.getKey(), entry->entry.getValue()));
				
		System.out.println(filteredMap);		
				
				
		
		Map<String, String> courses = new HashMap<String,String>();
		courses.put("String1", "Course1");
		courses.put("String2", "Course2");
		courses.put("String3", "Course1");
		courses.put("String4", "Course1");
		
//print keys of same course		
		List<String> filteredKeys = courses
		 .entrySet()
		 .stream()
		 .filter(entry-> entry.getValue().equals("Course1"))
		 .map(entry-> entry.getKey())
		 .toList();
		 
		 System.out.println(filteredKeys);
		
		 
	  Map<String, String> filtered = courses
	    		 				   .entrySet()
		                           .stream()
		                           .filter(entry-> entry.getValue().equals("Course1"))
		                           .collect(Collectors.toMap(entry->entry.getKey(), entry->entry.getValue()));
		
		System.out.println(filtered);
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,13,17,24));
		
		//count of even numbers in a list
		
		long count = list.stream()
		.filter(n->n%2==0)
		.count();
		
		//sum of numbers in a list
		
		int sum = list
		.stream()
		.mapToInt(n->n)
		.sum();
		System.out.println(sum);
		
		OptionalDouble average = list
		.stream()
		.mapToInt(n->n)
		.average();
		System.out.println(average.getAsDouble());
		
		double asDouble =
				list.stream()
				.mapToInt(n->n)
				.average()
				.getAsDouble();
				System.out.println(asDouble);
			
	    int	max = list
		.stream()
		.mapToInt(n->n)
		.max()
		.getAsInt();
		System.out.println(max);
		
		
		
	    int	min = list
		.stream()
		.mapToInt(n->n)
		.min()
		.getAsInt(); //
		System.out.println(min);
		
		
		
		List<List<String>> words = new ArrayList<List<String>>();
		words.add(Arrays.asList("Hi","Bye"));
		words.add(Arrays.asList("One","Two"));
		words.add(Arrays.asList("Gm","Gn"));
		System.out.println(words);
		
	List<String> res=  words
		.stream()
		.flatMap(list2-> list2.stream())
		.toList();
	System.out.println(res);
	System.out.println("---------------");
		
//Flatens data in to single list	

	
	//Parallel Stream same like multi threading
	List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(10,13,17,24,13));
	
	list2.stream()
	.forEach(n->System.out.println(n));
	System.out.println("---------------");
		list2.parallelStream()
		.forEach(n->System.out.println(n));
		System.out.println("---------------");	
	list2.stream()
	.limit(2)
	.forEach(n->System.out.println(n));
	
	
	boolean allMatch = list2
				.stream()
				.allMatch(n->n>0);
		System.out.println(allMatch);
		
		
		
	}
}
