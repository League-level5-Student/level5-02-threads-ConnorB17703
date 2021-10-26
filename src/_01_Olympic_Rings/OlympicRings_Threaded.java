package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	Robot rob1 = new Robot(500,500);
	Robot rob2 = new Robot(700,700);
	Robot rob3 = new Robot(900,500);
	Robot rob4 = new Robot(1100,700);
	Robot rob5 = new Robot(1300,500);
	
	
	rob1.setSpeed(10);
	rob2.setSpeed(10);
	rob3.setSpeed(10);
	rob4.setSpeed(10);
	rob5.setSpeed(10);
	
	
	Thread r1 = new Thread(()->rob1.);
	
	
	//You stopped here. Must make code to draw into circle then put that code into thread.
}
}

