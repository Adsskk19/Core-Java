package com;

public class Reverse {
	public static void main(String[] args) {
		String s = "Java";
		String rev = "";
		//""
		//"a"
		//"av" , "ava" , "avaJ"
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		System.out.println(rev);
		//StringBuffer s3 ="Kiran"; //not possible
		StringBuffer s2 = new StringBuffer("JAVA PROGRAMMING");
		System.out.println(s2.reverse());
	}

}
