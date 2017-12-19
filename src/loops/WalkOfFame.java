
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot("mini");
		int starSize = 30;
		// 1. Set the X position of the robot so that it starts on the left. 
		rob.moveTo(0, 300);
		rob.setSpeed(10);
		// You also need to show the robot to see the result of this line.
		rob.penDown();
		// 2. Make the robot draw a star shape. Hint: 144.
		
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 5; j++) {
				rob.move(starSize);
				rob.turn(144);
			}
			rob.turn(90);
			rob.penUp();
			rob.move(50);
			rob.turn(-90);
			rob.penDown();
		}
		
		
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
