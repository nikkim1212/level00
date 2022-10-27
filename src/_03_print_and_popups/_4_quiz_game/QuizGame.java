package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int userscore = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String question1 =JOptionPane.showInputDialog("What is the tallest mountain on this planet: ");
				 
				
				// 3.  Use an if statement to check if their answer is correct
				if(question1.equals("Mount Everest")) {
					userscore+=1;
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String question2 =JOptionPane.showInputDialog("What is the smallest country in the world");
		if(question2.equals("Vatican City")) {
			userscore+=1;
		}
		
		String question3 =JOptionPane.showInputDialog("What is the biggest ocean in the world");
		if(question3.equals("The Pacific Ocean")) {
			userscore+=1;
		}
		// After all the questions have been asked, tell the user their fina;l score 
		JOptionPane.showMessageDialog(null, userscore);
	}
}
