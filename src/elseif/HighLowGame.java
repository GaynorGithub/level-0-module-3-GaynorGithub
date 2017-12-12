//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100) + 1;
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for (int i = 0; i < 11; i++) {
			// 1. ask the user for a guess using a pop-up window, and save their response 
					String numGuess = JOptionPane.showInputDialog("Guess a number");
					// 4. convert the users’ answer to an int (Integer.parseInt(string))
					int guess = Integer.parseInt(numGuess);
					// 5. if the guess is correct
					if(guess == random) {
						JOptionPane.showMessageDialog(null, "Wow you won. I am super proud of you. Have a nice life.");
						System.exit(0);
					}
						// 6. win
					// 7. if the guess is high\
					else if(guess > random) {
						JOptionPane.showMessageDialog(null, "That is tooooo high");
					}
						// 8. tell them it's too high
					else if(guess < random) {
						JOptionPane.showMessageDialog(null, "That is tooooo low");
					}
					// 9. if the guess is low
						// 10. tell them it's too low
		}
			JOptionPane.showMessageDialog(null, "You lose you suck you lost the game of life");
			System.exit(0);

		// 12. tell them they lose
	}

}


