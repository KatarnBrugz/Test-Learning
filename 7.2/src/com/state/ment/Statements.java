package com.state.ment;

import java.util.*;

public class Statements {
	
	static int max = 100;
	static int min = 0;
	static int mark1, mark2;
	
	public static void userInput() {
		
		Scanner numberInput = new Scanner(System.in);
		
		String error = "ERROR - MARKS MUST BE BETWEEN " + max + " AND " + min;
		
		mark1 = numberInput.nextInt();
		mark2 = numberInput.nextInt();
		double average = (mark1 + mark2) / 2;
		
		if ((mark1 >= min && mark1 <= max) && (mark2 >= min && mark2 <= max)) {
			System.out.println((int)average);
		} else {
			System.out.println(error);
		}
	}

	public static void main(String[] args) {
	
	userInput();
		
	}

}
