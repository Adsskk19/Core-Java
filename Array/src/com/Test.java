package com;

public class Test {
	public static void main(String[] args) {
		
		
		int []arr = new int[5];
		System.out.println(arr[0]);//default value
		
		arr[0]=108645;
		arr[1]=1065;
		arr[2]=1089;
		arr[3]=109;
		arr[4]=108;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		int [] arr2 = {12,24,35,56,78,98};
		
		System.out.println(arr2.length);
//but here length is not a method like in strings
		System.out.println(arr.length);
		
		System.out.println(arr);//we get hash code of object
		
		arr[2]=980;
		System.out.println(arr[2]);
		
		Test obj = new Test();
		obj.createCharArray();
		obj.createStringArray();
			
	}
	void createCharArray() {
		char [] arr = new char[3];
		
		System.out.println("Char array:" + arr[0]);
		arr[0] = 'A';
		System.out.println("Char array:" + arr[0]);

	}
	void createStringArray() {
		String [] arr = new String[3];
		
		System.out.println("String array:" + arr[0]);
		arr[0] = "Hii";
		System.out.println("String array:" + arr[0]);

	}
//Default value of empty string or object in a class is null.
}








