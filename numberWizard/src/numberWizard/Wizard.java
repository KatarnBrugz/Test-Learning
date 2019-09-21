package numberWizard;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Wizard {
	
	static int min = 1;
	static int max = 1000;
	static int guess = (min+max)/2;
	
	static int answer;
	
	static int i = 0;
	
	public static int options;
	
	public static void Intialization() {
		
		JOptionPane.showMessageDialog(null, 
				"Pick a number from "
				+min+" to "+max
				+".\nKeep this number to "
				+ "yourself.",
				"Number",
				JOptionPane.ERROR_MESSAGE);
	}
	
	public static void IsThisYourNumber() {
		Object[] options = {"Lower",
        "Correct", "Higher"};
		
		int answer = (JOptionPane.showOptionDialog(null,
			    "Is "+guess+" your number?",
			    "Is the number higher or lower?",
			    JOptionPane.YES_NO_CANCEL_OPTION,
			    JOptionPane.QUESTION_MESSAGE,
			    null,     //do not use a custom Icon
			    options,  //the titles of buttons
			    options[0])); //default button title
			if (answer == 2) {
			
			min = guess;
			guess = (min+max)/2;
			System.out.println(guess); //higher
			
		} else if (answer== 1) {
			
			i = 1;
			System.out.println("Your number is "
					+guess+"!"); //correct
			
		} else {
			
			max = guess;
			guess = (min+max)/2;
			System.out.println(guess); //lower
		}
	}
		
			
	
	public static void main(String[]args) {
		
		Intialization();
		
		while(i!=1) {
		IsThisYourNumber();
		
		}
		
		JOptionPane.showMessageDialog(null, "Your number is "+guess
				+"!");
		
	}
}
