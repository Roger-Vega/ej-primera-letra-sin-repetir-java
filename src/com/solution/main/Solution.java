package com.solution.main;

public class Solution {
	
	public static String First_not_repeating_char(String string){
		String[] stringSplited = string.split("");
		int counter;
		for(int i=0; i<stringSplited.length; i++){
			counter = 0;
			for(String c:stringSplited) {
				if(stringSplited[i].equals(c)) {
					counter++;
				}
				if(counter > 1) break;
			}
			if(counter == 1) return stringSplited[i];
		}
		return "_";
	}

}
