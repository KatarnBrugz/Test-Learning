package com.seven;

import java.util.*;

public class UserInteger {
	
	static int UserInput;
	
	public static void NumberInput() {
		
		@SuppressWarnings("resource")
		Scanner intergetScanner = new Scanner(System.in);
		System.out.println("Enter in a interger");
		
		UserInput = (intergetScanner.nextInt())%2;
	}
	
	public static void NumberChecker() {
		
		switch(UserInput) {
		case 0: System.out.print("Your number is even");
		break;
		case 1: System.out.print("Your number is odd");
		}
	}
	
	public static void main(String args[]) {
		
		NumberInput();
		NumberChecker();
		
	}
}
