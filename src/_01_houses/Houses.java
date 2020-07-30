package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot builder = new Robot("mini");
	public void run() {
		
		int x =20;
		int y = 500;
		builder.setX(x);
		builder.setY(y);
		builder.penDown();
		builder.setSpeed(50);
		builder.setPenWidth(10);
		
		for (int i = 0; i < 9; i++) {
			build(100);
		}
	}
	 void build(int height) {
		builder.move(height);
		builder.turn(90);
		builder.move(40);
		builder.turn(90);
		builder.move(height);
		builder.setPenColor(Color.green);
		builder.turn(-90);
		builder.move(35);
		builder.setPenColor(Color.black);
		builder.turn(270);
	}
}
 
