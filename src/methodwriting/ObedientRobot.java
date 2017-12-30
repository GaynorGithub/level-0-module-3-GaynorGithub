package methodwriting;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		String shape = JOptionPane.showInputDialog("Choose and object, Square, Triangle, or Circle.");
		if(shape.equalsIgnoreCase("square")) {
			drawSquare();
		}
		else if(shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}
		else if(shape.equalsIgnoreCase("circle")) {
			drawCircle();
		}
	}
	
	static void drawSquare() {
		Robot rob = new Robot("mini");
		String color = JOptionPane.showInputDialog("Choose a color, red, blue, or green.");
		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(255, 0, 0);
		}
		else if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor(0, 0, 255);
		}
		else if(color.equalsIgnoreCase("green")) {
			rob.setPenColor(0, 255, 0);
		}
		rob.setSpeed(10);
		for (int i = 0; i < 4; i++) {
			rob.penDown();
			rob.move(100);
			rob.turn(90);
			rob.penUp();
		}
	}
	
	static void drawTriangle() {
		Robot rob = new Robot("mini");
		String color = JOptionPane.showInputDialog("Choose a color, red, blue, or green.");
		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(255, 0, 0);
		}
		else if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor(0, 0, 255);
		}
		else if(color.equalsIgnoreCase("green")) {
			rob.setPenColor(0, 255, 0);
		}
		rob.setSpeed(10);
		rob.penDown();
		rob.turn(30);
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.turn(120);
		rob.move(100);
		rob.penUp();
		
	}
	
	static void drawCircle() {
		Robot rob = new Robot("mini");
		String color = JOptionPane.showInputDialog("Choose a color, red, blue, or green.");
		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(255, 0, 0);
		}
		else if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor(0, 0, 255);
		}
		else if(color.equalsIgnoreCase("green")) {
			rob.setPenColor(0, 255, 0);
		}
		rob.setSpeed(10);
		for (int i = 0; i < 180; i++) {
			rob.penDown();
			rob.move(2);
			rob.turn(2);
			rob.penUp();
		}
	}
}
