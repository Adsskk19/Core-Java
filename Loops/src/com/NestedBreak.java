package com;

public class NestedBreak {
	public static void main(String[] args) {
		//Labels
		bayata:// outer loop ki outer ane peru petti break tho break chesaam
		for(int i =1;i<=2;i++ ) {
			inner:
			for(int j =1;j<=3;j++ ) {
				if(j==2) {
					//break bayata;
					//continue inner;
				}
				System.out.println("i :"+ i+ " ,"+"j :" +j);
			}
			
		}
	}

}
