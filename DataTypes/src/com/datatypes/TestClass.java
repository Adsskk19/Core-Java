package com.datatypes;

public class TestClass {
	public static void main(String[] args) {
		byte byteValue = 127;
		short shortValue = 32000;
		int intValue = 1234567789;
		long longValue = 7800765479009999997L;// L must l is also fine
		
		float floatValue = 1.123456789f; //ending f must & mandatory
		//1234568 rounding off
		double doubleValue = 1.1234567890123456789;
		//after 15th place rounding off
		
		char character = 'A'; //only one character
		boolean booleanValue = true;
		
		System.out.println(byteValue);
		System.out.println(shortValue);
		System.out.println(intValue);
		System.out.println(longValue);
		System.out.println(floatValue);
		System.out.println(doubleValue);
		System.out.println(character);
		System.out.println(booleanValue);

	}

}
