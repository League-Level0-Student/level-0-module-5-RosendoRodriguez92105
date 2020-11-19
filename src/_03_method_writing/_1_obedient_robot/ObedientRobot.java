package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *     Have the robot draw a square.
    Put this code into a drawSquare() method.
    Have the robot draw a triangle.
    Put this code into a drawTriangle() method.
    Have the robot draw a circle.
    Put this code into a drawCircle() method.
    Ask the user which shape they want. Draw the appropriate shape depending on their answer (call the right method).
    Ask the user which color they want. Give them some choices so you don't have to accomodate every possible color. Color the the shape depending on their answer. 


		 */
		String shape =JOptionPane.showInputDialog("What shape do you want ?");
		String color =JOptionPane.showInputDialog("Do you want red, blue, or green");
		
		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(255,0,0);
		}
		if(color.equalsIgnoreCase("green")) {
			rob.setPenColor(152,251,152);
		}
		if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor(12,41,126);
		}
		
		rob.penDown();
		rob.setSpeed(200);
		if (shape.equalsIgnoreCase("circle")) {
			drawCircle();
		}
		else if (shape.equalsIgnoreCase("square")) {
			drawSquare();
		}
		else if (shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}
		else {
			JOptionPane.showMessageDialog(null, "not available");
		}
		
		
		// how do i put it in a method?

		  }
			//  Every method has a method signature which is the first line of the method
		//    <return type (can be void)>  <name of the method (what it does)>   (<parameters>) {
		//  next comes the code.....
		//  }
		
		
static void drawSquare() {
for(int i = 0;i<4; i++) {
rob.move(100);
rob.turn(90);
  }
}
static void drawTriangle() {
	for (int i=0;i<3;i++) {
		rob.move(100);
		rob.turn(120);
	}
}
static void drawCircle() {
	for(int i=0;i<360; i++) {
		rob.move(1);
		rob.turn(1);
	}
}

}
