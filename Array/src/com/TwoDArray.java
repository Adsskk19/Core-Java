package com;

import java.util.Arrays;

public class TwoDArray {
	public static void main(String[] args) {
	
	int[][] arr = new int[3][3];
	arr[0][0] =10;
	arr[0][1] =30;
	arr[0][2] =40;
	arr[1][0] =45;
	arr[1][1] =20;
	arr[1][2] =15;
	arr[2][0] =80;
	arr[2][1] =40;
	arr[2][2] =75;
	
//	for(int i =0; i< arr.length;i++) {
//		for(int j=0 ;j<arr[i].length;j++) {
//			System.out.print(arr[i][j]+" ");
//		}
//	}
	
	for(int [] a : arr) {
		System.out.println(Arrays.toString(a));
	}
	
	
	}
}
