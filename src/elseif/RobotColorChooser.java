
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot r2 = new Robot("mini");
		//3. ask the user what color they would like the robot to draw
		
		//4. use an if/else statement to set the pen color that the user requested
		
		for (int i = 0; i < 10; i++) {
			String newColor = JOptionPane.showInputDialog("What color do you want?");
			if(newColor.equalsIgnoreCase("red")) {
				Color red = new Color(255, 0, 0);
				r2.setPenColor(red);
			}
			else if(newColor.equalsIgnoreCase("orange")) {
				Color orange = new Color(232, 130, 6);
				r2.setPenColor(orange);
			}
			else if(newColor.equalsIgnoreCase("yellow")) {
				Color yellow = new Color(255, 229, 0);
				r2.setPenColor(yellow);
			}
			else if(newColor.equalsIgnoreCase("green")) {
				Color green = new Color(0, 255, 0);
				r2.setPenColor(green);
			}
			else if(newColor.equalsIgnoreCase("blue")) {
				Color blue = new Color(0, 0, 255);
				r2.setPenColor(blue);
			}
			else if(newColor.equalsIgnoreCase("purple")) {
				Color purple = new Color(203, 0, 255);
				r2.setPenColor(purple);
			}
			else if(newColor.equalsIgnoreCase("Andrew")) {
				Color andrew = new Color(18, 234, 223);
				r2.setPenColor(andrew);
			}
			else {
				r2.setRandomPenColor();
			}
			r2.setPenWidth(10);
		    //1. make the robot draw a shape (this will take more than one line of code)
			
			r2.setSpeed(10);
			r2.penDown();
			r2.move(100);
			r2.turn(90);
			r2.move(100);
			r2.turn(90);
			r2.move(100);
			r2.turn(90);
			r2.move(100);
			r2.turn(80);
		}
        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	}
}
