package com;

import java.util.Arrays;
import java.util.Scanner;

public class TaskOnTwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
	    //int num = sc.nextInt();
	    int[][] arr = new int[5][5];
	    for(int i =0; i< arr.length;i++) {
	    	for(int j =0; j< arr[i].length;j++) {
		    	arr [i][j]= sc.nextInt();
		    }
	    }
	    for(int[] e: arr) {
	    	System.out.println(Arrays.toString(e));
	    }
//	 int[][] arr2= {{10,20,30},{34,34,56},{11,22,33}}; 
//	 for(int[] e: arr2) {
//	    	System.out.println(Arrays.toString(e));
//       }
	
	}

}
