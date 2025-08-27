package com;


public class WaitNotify {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getPriority());
		Thread5 t5 = new Thread5();//New
		t5.start();//Runnable
		//Thread.sleep(1000);//Blocked
		//t5.join();//Blocked
		
		synchronized(t5) {
			t5.wait();
			System.out.println(t5.count);
		}
		
	}
}
class Thread5 extends Thread{

	int count =0;
	
	@Override
	public void run() {
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setName("Thread Hero ");
		System.out.println(Thread.currentThread().getName());
		
		synchronized(this) {
			for(int i=1;i<=1000;i++) {
				count++;
			}
			this.notify();
		}
		
	}

}
