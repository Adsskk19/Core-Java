package com;

import java.util.LinkedList;

public class LinkedListOperation {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.addFirst(10);
		list.addLast(30);
		
		System.out.println(list);
		Integer integer = list.get(0);
		System.out.println(integer);
	}
}
