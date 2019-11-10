package _00_welcome;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {

	private static final Color color = null;

	public static void main(String[] args) {

		// START HERE
		Robot bani = new Robot();
		bani.penDown();
		bani.setRandomPenColor();
		int distance = 200;
		bani.setSpeed(20);
		for (int i = 0; i < 40; i++) {
			bani.move(distance);
			bani.turn(120);
			distance = distance - 10;
			bani.move(200);
		}bani.hide();

	}
}
