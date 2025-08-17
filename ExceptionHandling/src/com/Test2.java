package com;

public class Test2 {
	
	
	public static void main(String[] args) {
		
		int result = calculate();
		System.out.println(result);
		
	}
	
	static int calculate() {
		
		try {
			int a =10/0;
			return a;
		}
		catch(ArithmeticException e){
			System.out.println(e);
			return 0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("From Finally..");
			return 2;
		}
		
		
	}
	

}
