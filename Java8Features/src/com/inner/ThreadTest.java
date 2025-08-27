package com.inner;

public class ThreadTest {
	
	public static void main(String[] args) {
		
//		Runnable t1 = new Thread1();
//		//t1.start(); when extends Thread
//		Thread t = new Thread(t1);
//		t.start();
		
		Runnable t2 = new Runnable() {
			@Override
			public void run(){
				System.out.println(Thread.currentThread().getName());
				System.out.println("From thread 2");
			}
		};	
		Thread th2 = new Thread(t2);
		th2.start();
		
		Runnable t3 =()->{
			System.out.println("From thread 3...");	
		};
		//lambda
		Thread th3 = new Thread(t3);
		th3.start();
		
		//lambda
		Thread th4 = new Thread(()->{System.out.println("From Thread 4");});
		th4.start();
	}
}
//class Thread1 implements Runnable{
//	
//	@Override
//	public void run() {
//		System.out.println(Thread.currentThread().getName());
//		System.out.println("From Thread");
//	}
//}
