package com;

import java.util.LinkedHashMap;

public class LinkedHashMapOperation {
	public static void main(String[] args) {
		
		
		LinkedHashMap<String,Integer> linkedMap = new LinkedHashMap<String,Integer>();
		linkedMap.put("Social", 90);
		linkedMap.put("Maths", 99);
		linkedMap.put("English",95);
		linkedMap.put("english",93);
		linkedMap.put("Hindi", null);
		linkedMap.put(null, null);
		linkedMap.put(null, 2);          
		
		
		
		System.out.println(linkedMap);
	}

}
