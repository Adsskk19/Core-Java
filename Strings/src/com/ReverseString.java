package com;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String input = sc.nextLine();
		
		ReverseString obj = new ReverseString();
		String result = obj.reverse(input);
		System.out.println("Reversed String :"+result);
		
		//System.out.println(s.charAt(1));
				
	}
	
	String reverse(String s) {
		String result = "";
		for (int i = s.length()-1 ;i>=0;i--) {
			char temp = s.charAt(i);
			result +=temp;
			
			//return result; last letter tho end aipodhi
		}
		return result;
		
	}

}
// Input : "FLMEDUTECH"
// Output : "HCETUDEMLF"