package com;

public class LargestAndSmallest {
		public static void main(String[] args) {
			int[]arr = {10,9,7,5,2,24};
			LargestAndSmallest.findLargestAndSmallest(arr);
		}
		static void findLargestAndSmallest(int arr[]) {
			int max = arr[0];
			int min = arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i]>max) {
					max= arr[i];
				}
				if(arr[i]<min) {
					min = arr[i];
				}
			}
			System.out.println("Largest: "+max);
			System.out.println("Smallest: "+min);
		}
}
