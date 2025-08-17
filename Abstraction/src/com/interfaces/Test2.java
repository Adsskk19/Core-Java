package com.interfaces;

public class Test2 {
	
	public static void main(String[] args) {
		Vi obj = new Vi();
		long imei=obj.IMEI();
		System.out.println("IMEI:"+imei);
		long aadhar =obj.aadharNum();
		System.out.println("Aadhar Num:"+aadhar);
    	long num=obj.number();
    	System.out.println("Vi number:"+num);
    	
    	BSNL bsnl = new BSNL();
    	long numb=bsnl.number();
    	System.out.println("BSNL number:"+numb);
    	
//parent reference variable holding child class object
//useful in spring boot
    	
    	Sim sim1 = new Vi();
    	System.out.println(sim1.number());
    	Sim sim2 = new BSNL();
    	System.out.println(sim2.number());	
    	System.out.println(sim1.a);
    	
    	
    	
    	
    	
	}
	
}
