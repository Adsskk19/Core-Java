package com;

public class SubSets {
	public static void main(String[] args) {
		SubSets obj = new SubSets();
		obj.printSubSets("abc");
	}
	void printSubSets(String s) {
		for(int i =0;i<=s.length()-1;i++) {
			for(int j =i+1;j<=s.length();j++) {
				
				System.out.println(s.substring(i,j));
			}
		}
	}
	

}
