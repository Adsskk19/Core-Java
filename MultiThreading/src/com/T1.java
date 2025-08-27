package com;

public class T1 extends Thread{
	
	T2 t2;
	@Override
	public void run() {
		try {
			t2.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		for(int i =1;i<=20;i++) {
			System.out.println("From Thread 1");
		}
	}
}
