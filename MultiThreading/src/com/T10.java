package com;

public class T10 extends Thread{
	
	@Override
	public void run(){
		Thread.currentThread().setPriority(10);
		for(int i=1;i<=10;i++) {
			System.out.println("T10");
		}
	}
}
