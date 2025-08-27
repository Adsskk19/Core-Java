package com.encapsulation;

public class Main {
	public static void main(String[] args) {
//		Student s1 = new Student("David", 21);
//		Student s2 = new Student("Emma", 20);
//		System.out.println(s1.getDetails());
//		System.out.println(s2.getDetails());
		
//		Circle c = new Circle(5);
//		System.out.println("Area: "+c.getArea());
//		Database db1 = Database.getInstance();
//		Database db2 = Database.getInstance();
//		System.out.println(db1.getConnectionS tatus());
//		System.out.println(db1==db2);
		
		
		Order order1 = new Order("ORD123",250);
		System.out.println(order1.getOrderDetails());
		order1.makePayment(250.00);
		System.out.println(order1.getOrderDetails());
		

	}

}

class Student{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getDetails() {
		return "Name:"+name+"Age:"+age;
	}
	
}
class Circle{
	private double radius;
	public Circle(double radius) {
		this.radius= radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
}

class Database{
	private static Database instance;
	private String connection;
	
	private Database() {
		connection = "Connected to Database";
	}
	public static Database getInstance() {
		if(instance==null) {
			instance = new Database();
		}
		return instance;
	}
	public String getConnectionStatus() {
		return connection;
	}
	
}

class Order{
	private String orderId;
	private double amount;
	private boolean isPaid;
	public Order(String orderId, double amount) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.isPaid =false;
	}

	public String getOrderDetails() {
		return "Order [orderId=" + orderId + ", amount=" + amount + ", isPaid=" + isPaid + "]";
	}
	public void makePayment(double amount) {
		if(this.amount==amount) {
			this.isPaid = true;
			System.out.println("Payment done for Order Id:"+orderId);
		}else {
			System.out.println("Invalid amount, Payment failed");
		}
	}
}


