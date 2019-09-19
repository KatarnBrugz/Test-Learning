package Binary;
/*
 * Name: Kyle Brugmans
 * Program description:
 * Find the binary value of a decimal number.
 */

public class binary {
	
	// These are the starting Numbers // Start number is user defined //
	
	// newNumber is the constantly changing value which will store the
	// numbers into x1 to x8 //
	
	static int startNumber = 17;
	static int newNumber = startNumber;
	
	static int x1; static int x2; static int x3; static int x4; 
	static int x5; static int x6; static int x7; static int x8;
	
	// ^^ All the data will be stored above ^^ //
	
	public static void InitialNumber( ) {
		System.out.println(newNumber+" is equal to");
		// The initial sentence for the program...//
	}
	
	// public static void FinalNumberBackwards() {
		// System.out.print(" but the number is backwards...");
	
		// No longer relevant but I wanted to keep it for the sake
		// of learning
	
	//}
	
	public static void BinaryNumber() {
		System.out.print(x1);
		System.out.print(x2);
		System.out.print(x3);
		System.out.print(x4+" "); // Spaces out but 4
		System.out.print(x5);
		System.out.print(x6);
		System.out.print(x7);
		System.out.print(x8);
		
		// This will print the ones and zeroes in the
		// proper order
	}
	
	public static void Binary() {
		
		/*
		 * This part of the code is first getting the remainder of
		 * each number during the step by step process.
		 * 
		 * After finding the remainder it then sets a new value
		 * to newNumber so that it can start the process over
		 * with the next half of the original number.
		 */
		
		x8 = newNumber%2;
		newNumber = newNumber/2;
		
		x7 = newNumber%2;
		newNumber = newNumber/2;
		
		x6 = newNumber%2;
		newNumber = newNumber/2;
		
		x5 = newNumber%2;
		newNumber = newNumber/2;
		
		x4 = newNumber%2;
		newNumber = newNumber/2;
		
		x3 = newNumber%2;
		newNumber = newNumber/2;

		x2 = newNumber%2;
		newNumber = newNumber/2;

		x1 = newNumber%2;
		newNumber = newNumber/2;

	}
	
	
	
	public static void main(String[]args) {
		
		InitialNumber();
		
		Binary();
		BinaryNumber();
		
	}
}