package com;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the byte array size: ");
		int size = sc.nextInt();
		//All data type Arrays
		byte[] arr = new byte [size];
		short[]arr1 = new short[size];	
		int [] arr2 = new int [size];
		long [] arr3 = new long [size];
		float [] arr4 = new float[size];
		double [] arr5 = new double[size];
		//char [] arr6 = new char[size]; sc.nextLine and charAt()
		boolean [] arr7 = new boolean[size];
		String [] arr8 = new String [size];
		//System.out.println();
		//arr[]
		

		for(int i = 0;i<arr.length;i++) {
			System.out.println("Enter the Byte elements: ");
			arr[i]=sc.nextByte();
			}

		for(int i = 0;i<size;i++) {
			System.out.println("Enter the Short elements: ");
			arr1[i]= sc.nextShort();
			//System.out.println("Enter the Characters: ");
			//String arr6[i]= sc.nextLine();
			}
		for(int i = 0;i<size;i++) {
			System.out.println("Enter the Integer elements: ");
			arr2[i]= sc.nextInt();
			}
		for(int i = 0;i<size;i++) {
			System.out.println("Enter the long elements: ");
			arr3[i]= sc.nextShort();
			}
		for(int i = 0;i<size;i++) {
			System.out.println("Enter the float elements: ");
			arr4[i]= sc.nextFloat();	
		}
		for(int i = 0;i<size;i++) {
			System.out.println("Enter the Double elements: ");
			arr5[i]= sc.nextDouble();	
		}
		for(int i = 0;i<size;i++) {
			System.out.println("Enter the Boolean elements: ");
			arr7[i]= sc.nextBoolean();	
		}
		for(int i = 0;i<size;i++) {
			System.out.println("Enter the String elements: ");
			arr8[i]= sc.nextLine();
		}	
		for(int k=0;k<arr.length;k++) {
			System.out.println("Byte Array Elements are..");
			System.out.println(arr[k]);		
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println("Short Array Elements are..");
			System.out.println(arr1[k]);
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println("Int Array Elements are..");
			System.out.println(arr2[k]);
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println("long Array Elements are..");
			System.out.println(arr3[k]);
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println("Float Array Elements are..");
			System.out.println(arr4[k]);
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println("Double Array Elements are..");
			System.out.println(arr5[k]);
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println("Boolean Array Elements are..");
			System.out.println(arr7[k]);
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println("String Array Elements are..");
			System.out.println(arr8[k]);
		}
		
			
		
	}

}
