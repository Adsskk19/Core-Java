package com.task;
//Important for interview
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CharacterFrequency {
	
	public static void main(String[] args) {
		ArrayList<Character> chars = new ArrayList<Character>(Arrays.asList('A','B','B','C','A'));
		chars.add('A');
		
		HashMap<Character, Integer> result = new HashMap<Character, Integer>();
		
		for(Character ch :chars) {
			//result.get(ch)==null
			if(!result.containsKey(ch)) {
				result.put(ch, 1);
			}else {
				Integer count = result.get(ch);
				result.put(ch, count+1);
			}
			
		}
		System.out.println(result);
		
	}
}
