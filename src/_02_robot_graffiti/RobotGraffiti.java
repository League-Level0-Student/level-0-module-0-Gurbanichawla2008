package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot bani=new Robot();
		bani.moveTo(200, 300);
		bani.penDown();
		bani.setRandomPenColor();
		bani.hide();
		bani.setSpeed(20);
		bani.move(200);
		bani.turn(90);
		bani.move(100);
		bani.turn(90);
		bani.move(100);
		bani.turn(90);
		bani.move(100);
		bani.turn(180);
		bani.move(150);
		bani.turn(90);
		bani.move(150);
		bani.turn(90);
		bani.move(150);
        bani.turn(90);
        bani.move(320);
	}
}
