package eightOne;

import java.util.Scanner;

public class Sequence {
	
	static int sequence;
	
	public static void initalization() {
		
		System.out.println("Enter an integer:");
		
		Scanner declareSequence = new Scanner(System.in);
		sequence = declareSequence.nextInt();
		
	}
	
	public static void formula() {
		
		if (sequence <= 0) {
			sequence = 0;
		}
		switch (sequence) {
		case 0:
			System.out.println("Put in a real number you twat");
			break;
		default:
		int num1 = 0; int num2 = 1; int threshhold;
		
		System.out.print(num1 + " " + num2);
		
		for (int i = 0; i<=sequence; i++) {
			
			threshhold = num1 + num2;
			num1 = num2;
			num2 = threshhold;
			System.out.print(" "+ threshhold);
		}
	}
		
}

	public static void main(String args[]) {
		
		initalization();
		formula();
		
	}
	
}
