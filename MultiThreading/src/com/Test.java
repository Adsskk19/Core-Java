package com;

public class Test {

	public static void main(String[] args) {

		String name = Thread.currentThread().getName();
		System.out.println(name);

		// mythread.run();
		Test test = new Test();
		MyThread1 mythread = new MyThread1();
		MyThread2 mythread2 = new MyThread2();
		Runnable mythread3 = new MyThread3();

		
		Thread t3 = new Thread(mythread3);
		
		
		
		mythread.start();
		mythread2.start();
		t3.start();	
		test.sayBye();
		//sayHi();

	}

	public static void sayHi() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hiii");
		}
	}

	public static void sayBye() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("Byee");
		}
	}

}
