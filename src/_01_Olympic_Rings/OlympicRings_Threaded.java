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
	
	
	Thread r1 = new Thread(()->drawCircle(rob1));
	Thread r2 = new Thread(()->drawCircle(rob2));
	Thread r3 = new Thread(()->drawCircle(rob3));
	Thread r4 = new Thread(()->drawCircle(rob4));
	Thread r5 = new Thread(()->drawCircle(rob5));
	
	r1.start();
	r2.start();
	r3.start();
	r4.start();
	r5.start();
	
}
public static void drawCircle(Robot r){
	r.penDown();
	r.turn(-90);
	for(int i = 0; i<25; i++){
		r.move(45);
		r.turn(15);
	}
}

}

