package eightOne;

import java.util.Scanner;

public class AddTen {
	
	static double x;
	static double total;
	static int i;
	
	public static void lessThanZero() {
			--i;
			if (x == 0) {
				System.out.println("Please enter a postive number");
			}
			addingTech();
		}
	
	public static void addingTech() {
		
		Scanner userNumberInpuScanner = new Scanner(System.in);
		
		total = 0;
			for (i = 0; i <= 9; i++) {
				double x = userNumberInpuScanner.nextDouble();
				if (x<=0) {
					lessThanZero();
				} else {
				total = total + x;
			}
		}
	}

	public static void main(String[] args) {
		
		addingTech();
		
		System.out.println((int)total);
	}

}
