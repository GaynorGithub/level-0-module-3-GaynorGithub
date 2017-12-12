package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String questionOne = JOptionPane.showInputDialog("Are you happy?");
	if(questionOne.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	}
	else if(questionOne.equalsIgnoreCase("no")) {
		String questionTwo = JOptionPane.showInputDialog("Do you want to be happy?");
		if(questionTwo.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Change something");
		}
		else if(questionTwo.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
	}
	System.exit(0);

}
}
