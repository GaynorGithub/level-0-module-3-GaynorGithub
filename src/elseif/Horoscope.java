package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String zodiac = JOptionPane.showInputDialog("What is your zodiac sign");
	if(zodiac.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null, "I find you intriguing");
	}
	else if(zodiac.equalsIgnoreCase("Taurus")) {
		JOptionPane.showMessageDialog(null, "You are an interesting person");
	}
	else if(zodiac.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null, "You are thought provoking");
	}
	else if(zodiac.equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null, "You are the master of disease");
	}
	else if(zodiac.equalsIgnoreCase("Leo")) {
		JOptionPane.showMessageDialog(null, "You are the coolest person ever");
	}
	else if(zodiac.equalsIgnoreCase("Virgo")) {
		JOptionPane.showMessageDialog(null, "You are cool I suppose");
	}
	else if(zodiac.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null, "All you need is love");
	}
	else if(zodiac.equalsIgnoreCase("Scorpio")) {
		JOptionPane.showMessageDialog(null, "Give some money to the homeless");
	}
	else if(zodiac.equalsIgnoreCase("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "Lottery numbers 35,76,3,6,12,46 Power number: 3");
	}
	else if(zodiac.equalsIgnoreCase("Capricorn")) {
		JOptionPane.showMessageDialog(null, "You are an okay person");
	}
	else if(zodiac.equalsIgnoreCase("Aquarius")) {
		JOptionPane.showMessageDialog(null, "you are interesting");
	}
	else if(zodiac.equalsIgnoreCase("Pisces")) {
		JOptionPane.showMessageDialog(null, "I think you might have bad luck today");
	}
	else {
		JOptionPane.showMessageDialog(null, "THAT IS NOT A STAR SIGN!!!");
	}
	System.exit(0);
	
}
}
