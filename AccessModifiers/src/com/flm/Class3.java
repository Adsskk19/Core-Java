package com.flm;

import com.Class1;

public class Class3 extends Class1 {
	public static void main(String[] args) {
		Class1 obj = new Class1();
		System.out.println("From Class 3: "+obj.a);
	    obj.hi();
	    //obj.c; /The field Class1.c is not visible
	    
	  //obj.bye();
	    
	    Class3 obj2 = new Class3();
	    System.out.println("From Class 3: "+obj2.c);
	    //why protected variable is accessed here?
	    //because Class3 is a child of Class1
	    
	  //  System.out.println("From Class 3: "+obj2.d);
	    // Not accessible
	}
	
	
}
