package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,7,19,2,20,14));
		//System.out.println(list);
		//Sort
	
//		for(int i =0;i<list.size()-1;i++) {
//			for(int j=0; j<list.size()-i-1;j++) {
//				if(list.get(j)>list.get(j+1)) {
//					int temp = list.get(j);
//					list.set(j, list.get(j+1));
//					list.set(j+1, temp);
//				}
//				
//			}
//		}
		//System.out.println(list);
		
		//Collections
		Collections.sort(list);
		Collections.sort(list, Collections.reverseOrder());
		Collections.addAll(list, 1);
		System.out.println(list);
		Collections.swap(list, 0, 2);
		System.out.println(list);
		
	}
	

}
