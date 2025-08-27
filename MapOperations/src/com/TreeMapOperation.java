package com;

import java.util.TreeMap;

public class TreeMapOperation {
public static void main(String[] args) {
		
	TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();
		treeMap.put("Social", 90);
		treeMap.put("Maths", 99);
		treeMap.put("English",95);
		treeMap.put("english",93);
		treeMap.put("Hindi", null);
		//treeMap.put(null, 2);
		
		
		System.out.println(treeMap);
			
	}

}
