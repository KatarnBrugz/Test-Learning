package eightOne;

import java.util.Scanner;

public class Sequence {
	
	static int sequence;
	
	public static void initalization() {
		
		// First you select your sequence number
		// Choosing how many times you want the
		// Formula to run on for
		
		System.out.println("Enter an integer:");
		
		// Creating the scanner for input
		Scanner declareSequence = new Scanner(System.in);
		
		// The sequence becomes the inputed integer
		sequence = declareSequence.nextInt();
		
	}
	
	public static void formula() {
		
		// Checking whether or not the number is 0 or negative
		// If its a negative it'll set the negative to 0
		if (sequence <= 0) {
			sequence = 0;
		}
		
		// We set it to zero so that case 0 can be triggered properly
		switch (sequence) {
		
		case 0: // Was not a positive number
			System.out.println("Put in a real number you twat");
			break;
			
		default: // Will always trigger as long as its a positive number
		int num1 = 0; int num2 = 1; int threshhold;
		// Declare all the numbers to add together, threshold becomes
		// The save point
		
		System.out.print(num1 + " " + num2);
		
		for (int i = 0; i<=sequence; i++) {
			
			threshhold = num1 + num2; // The save is the next INT
			num1 = num2; // becomes the previous larger INT
			num2 = threshhold; // becomes the the largest INT
			
			System.out.print(" "+ threshhold);
			// print out all the information
		}
	}
		
}

	public static void main(String args[]) {
		
		initalization();
		formula();
		
	}
	
}
