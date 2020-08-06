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
		
		for (int i = 0; i < 7; i++) {
			build(100);
			
		}
		build("small", "green");
		build("medium", "red");
		build("large", "blue");
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
	 void build(String size, String color) {
			int height = 0;
		 if(size.equals("small")) {
			 height = 60;
		 } else if (size.equals("medium")) {
			 height = 120;
		 } else if (size.equals("large")) {
			 height = 250;
		 }
		 if (color.equals("red")) {
			 builder.setPenColor(Color.red);
		 } else if (color.equals("green")) {
			 builder.setPenColor(Color.green);
		 } else if (color.equals("blue")) {
			 builder.setPenColor(Color.blue);
		 } else if (color.equals("yellow")) {
			 builder.setPenColor(Color.yellow);
		 }
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
 
