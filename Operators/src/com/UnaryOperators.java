package com;

public class UnaryOperators {
	public static void main(String[] args) {
		long a = 10;
		long b = -20;
		
		System.out.println(+a);
		
		System.out.println(-b);
		
		boolean res = false;
		System.out.println(!res); //true
		boolean isRes = !res;
		System.out.println(isRes);
		
		a = 15;
		b = 20;
		
		System.out.println("Gap");
		System.out.println(a);
		System.out.println(a++); //15 ++ 15+1 = 16
		System.out.println(a); //16
		System.out.println(++a);
		
		System.out.println(b); //20
		System.out.println(--b); //19
		System.out.println(b--); //19
		System.out.println(b);  //18
		
		System.out.println(" another type");
		a = 20;
		long add = a++ + ++a;
		System.out.println(add);
		
		a= 10;
		b = 15;
		long value = --b + a++ - --a;
		//14 +10 - (11 -> --11 = -10)
		//14 + 10- 10 = 14 only
		System.out.println(value);
		
		a =5;
		b =10;
		long value2 = a++ + --b * ++a;
		// a++ + 9 * 7
		System.out.println(value2);
		
	}

}
