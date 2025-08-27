package com.task;

public class PaymentGateway {
	
	//Method overloading //compile time/static /Early Binding PolyMorphism
	public static void main(String []args) {
		PaymentGateway.pay(35000);
		PaymentGateway.pay(1234456677l, 4500);
		PaymentGateway.pay("saikiran@ybl", 4567);
		PaymentGateway.pay("saikiran111", "1234SAIKIRAN", 56086);
	}
	
	static void pay(int amount) {
		if(amount!=0) {
			System.out.println("Payment done with COD!"); 
		}
	}
	static void pay(long cardNumber,int amount) {
		if(cardNumber!=0&&amount!=0) {
			System.out.println("Payment Succesful with Debit Card!"); 
		}
	}
	static void pay(String upiID,int amount) {
		if(upiID!=null&&amount!=0) {
			System.out.println("Payment done with UPI"); 
		}
	}
	static void pay(String userId,String password,int amount) {
		if(userId=="saikiran111"&&password=="1234SAIKIRAN") {
			if(amount!=0) {
				System.out.println("Payment done with NetBanking");
			}
			 
		}
	}
}
