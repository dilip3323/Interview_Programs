package com.qa.java.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class OccurancesOfWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am a java Developer and I am prod of it.";
		
		String newstr = str.replaceAll(" ", "");
		
		char[] chars = newstr.toCharArray();
		int i;
		
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		for(Character c:chars) {
			
	if(	hmap.containsKey(c)) {
		
		i =hmap.get(c);
		hmap.put(c, ++i);	
	}
	else{
		hmap.put(c, 1);
	}	
	}
		
	/*
	 * Iterator<Entry<Character, Integer>> itpair = hmap.entrySet().iterator();
	 * while(itpair.hasNext()) { Entry<Character,Integer> entry =itpair.next();
	 * System.out.println("Character " +entry.getKey()+ ": "+entry.getValue() );
	 * 
	 * }
	 */
		
		hmap.forEach((k,v)->System.out.println("Character " +k+ ": "+v));;
		
		
		
	}
}
