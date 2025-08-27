package com.optional;

import java.util.Optional;

public class Test {
	
	public static void main(String[] args) {
		
	
	User user = new User(19,"Kiran");
	User user2 = new User(20,null);
	
	Optional<String> email = user.getUserEmailById(210);
	email.ifPresentOrElse(e-> System.out.println(e), ()->System.out.println("No value"));;
	
	Optional<Object> empty = Optional.empty();
	System.out.println(empty);
	
	Optional<String> of = Optional.of("FLM");
	System.out.println(of.get());
	
	Optional<Object> ofNullable = Optional.ofNullable(null);
	ofNullable.ifPresent(n->System.out.println(n));
	//it will not give null pointer exception if we give null value it skips.
	
	Optional<String> name = Optional.of("Kiran");
	Optional<Integer> map = name.map(String::length);
			//map(n->n.length());
	
	System.out.println(map.get());
	
	
	
	} 

}
