package com;

public class T2 extends Thread{
	T1 t1;
	@Override
	public void run() {
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		for(int i =1;i<=20;i++) {
			System.out.println("From Thread 2");	
		}
	}
}
