package com;

public class DeadLock {
	public static void main(String[] args) {
		T1 t1 = new T1();
		T2 t2 = new T2();
		
		t1.t2=t2;
		t2.t1=t1;
		//initialized instance variable with T2 class object
		//t1.t2 is instance variable in T1 class
		//it is T2 class type hence we passed t2 object.
		//To avoid NullpointerException
		t1.start();
		t2.start();
	}

}
