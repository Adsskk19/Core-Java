package com;

public class ThreadTest {
	public static void main(String[] args) {
		
		
		T10 t10 = new T10();

		T11 t11 = new T11();
		Thread t = new Thread(t11);
		t10.start();
		t.start();
		
		
	}

}
