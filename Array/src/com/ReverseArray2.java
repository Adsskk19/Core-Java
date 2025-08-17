package com;

public class ReverseArray2 {
	public static void main(String[] args) {
		int[] arr = {24,3,4,56,78,9,7};
		//int[] newArr =ReverseArray.reverse(arr);
		// System.out.println(newArr); we can't print array directly
		//enhanced for loop /for each loop
		
		int []arr2 = {34,35,67,89,87};
		ReverseArray2.reverseUsingWhile(arr2);
	}
	
	static void reverseUsingWhile(int [] arr) {
		int start =0;
		int end =arr.length-1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end] = temp;
			start++;
			end--;
		
		}
		for(int e : arr) {
			System.out.print(e+" ");
		}
		
	}

}
