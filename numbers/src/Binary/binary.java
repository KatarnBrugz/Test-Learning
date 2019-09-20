package Binary;
/*
 * Name: Kyle Brugmans
 * Program description:
 * Find the binary value of a decimal number.
 */

import javax.swing.JOptionPane;

public class binary {
	
	// These are the starting Numbers // Start number is user defined //
	
	// newNumber is the constantly changing value which will store the
	// numbers into x1 to x8 //
	
	static int startNumber;
	static int newNumber;
	
	static int x1; static int x2; static int x3; static int x4; 
	static int x5; static int x6; static int x7; static int x8;
	static int x9; static int x10; static int x11; static int x12;
	static int x13; static int x14; static int x15; static int x16;
	
	// ^^ All the data will be stored above ^^ //
	
	public static void InitialNumber( ) {
		System.out.println("Pick a number anywhere between 65535 and"
				+ " 0.\nThis program will find the binary for any of the"
				+ "chosen decimal values.\n");
		System.out.println("The number you choose is "+startNumber+"\n");
		System.out.println("Decimal "+newNumber+" in binary equal to:");
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
		System.out.print(x8+" ");
		System.out.print(x9);
		System.out.print(x10);
		System.out.print(x11);
		System.out.print(x12+" ");
		System.out.print(x13);
		System.out.print(x14);
		System.out.print(x15);
		System.out.print(x16);
		
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
		
		// Example using the number 8
		
		x16 = newNumber%2;
		newNumber = newNumber/2; // 8/2 = 4 = R 0
		
		x15 = newNumber%2;
		newNumber = newNumber/2; // 4/2 = 2 = R 0
		
		x14 = newNumber%2;
		newNumber = newNumber/2; // 2/2 = 1 = R 0
		
		x13 = newNumber%2;
		newNumber = newNumber/2; // 1/2 = 0.5 = R 1
		
		x12 = newNumber%2;
		newNumber = newNumber/2; // 0/2 = R 0
		
		x11 = newNumber%2;
		newNumber = newNumber/2; // 0/2 = R 0
		
		x10 = newNumber%2;
		newNumber = newNumber/2; // 0/2 = R 0
		
		x9 = newNumber%2;
		newNumber = newNumber/2; // 0/2 = R 0
		
		x8 = newNumber%2;
		newNumber = newNumber/2; // 0/2 = R 0
		
		x7 = newNumber%2;
		newNumber = newNumber/2; // 0/2 = R 0
		
		x6 = newNumber%2;
		newNumber = newNumber/2; // 0/2 = R 0
		
		x5 = newNumber%2;
		newNumber = newNumber/2; // 0/2 = R 0
		
		x4 = newNumber%2; 
		newNumber = newNumber/2; // 0/2 = R 0
		
		x3 = newNumber%2;
		newNumber = newNumber/2; // 0/2 = R 0

		x2 = newNumber%2;
		newNumber = newNumber/2; // 0/2 = R 0

		x1 = newNumber%2;
		newNumber = newNumber/2; // 0/2 = R 0
		
		// The code should be 0000 0000 1000 BIN = 8 DEC
		// We read for binary going upwards
	}
	
	public static void PopUpBinary() {
		JOptionPane.showMessageDialog(null,
				"Decimal "+startNumber+" in binary equal to:\n"+x1+""+x2+""+x3+""+x4+" "+
				x5+""+x6+""+x7+""+x8+" "+x9+""+x10+""+x11+""+x12+" "+x13+""+
				x14+""+x15+""+x16);
	}
	
	public static void PopUpOption( ) {
		
		startNumber = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Any number from 0 to 65535", "Pick a number",
				JOptionPane.PLAIN_MESSAGE));
		
		newNumber = startNumber;
	}
	
	public static void main(String[]args) {
		
		PopUpOption();
		
		InitialNumber();
		
		Binary();
		BinaryNumber();
		
		PopUpBinary();
		
	}
}