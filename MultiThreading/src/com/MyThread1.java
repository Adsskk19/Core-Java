package com;

public class MyThread1 extends Thread{
	
	@Override
	public void run() {
		Thread.currentThread().setName("MyThread");
		String name = Thread.currentThread().getName();
		System.out.println(name);
		
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("Thread 1");
		}
		
	}
	

}
