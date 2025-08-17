package com;

public class ReverseArray {
		public static void main(String[] args) {
			int[] arr = {24,3,4,56,78,9,7};
			int[] newArr =ReverseArray.reverse(arr);
			// System.out.println(newArr); we can't print array directly
			
			//enhanced for loop /for each loop
			for(int e : newArr) {
				System.out.print(e+" ");
			}
					
		}
		static int[] reverse(int[]arr) {
			int [] newArr = new int[arr.length];
			int j=0;
			for(int i = arr.length-1;i>=0;i--) {
				newArr[j] = arr[i];
				j++;
			}
			return newArr;
		}
}
