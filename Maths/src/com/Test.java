package com;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		
		System.out.println(Math.abs(-10));
		System.out.println(Math.max(10,128));
		System.out.println(Math.min(10,128));
		
		System.out.println(Math.round(5.7));
		System.out.println("Ceil.."+Math.ceil(5.1));//next possible value
		System.out.println("floor.."+Math.floor(5.9));//Before value 
		
		System.out.println("Power.."+Math.pow(2,3));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.cbrt(125));
		
		
		System.out.println(Math.tan(Math.PI/4));
		
		System.out.println(Math.random()); //0.0 to 1.0
		System.out.println("Math Random");
		System.out.println((int)(Math.random()*100));
		
		
		Random random = new Random();
		System.out.println(random.nextInt(10,15));
		
		
		
		
	}

}
