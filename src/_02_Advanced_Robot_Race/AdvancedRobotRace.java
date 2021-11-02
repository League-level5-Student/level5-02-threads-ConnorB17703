package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
public static void main(String[] args) {
	Thread r1 = new Thread(()->{
		Robot rob1 = new Robot(500,1000);
		race(rob1, 1);
	});
	Thread r2 = new Thread(()->{
		Robot rob2 = new Robot(700,1000);
		race(rob2, 2);
	});
	Thread r3 = new Thread(()->{
		Robot rob3 = new Robot(900,1000);
		race(rob3, 3);
	});
	Thread r4 = new Thread(()->{
		Robot rob4 = new Robot(1100,1000);
		race(rob4, 4);
	});
	Thread r5 = new Thread(()->{
		Robot rob5 = new Robot(1300,1000);
		race(rob5, 5);
	});
	

	
	r1.start();
	r2.start();
	r3.start();
	r4.start();
	r5.start();
	
}
public static void race(Robot r, int num){
	Random ran = new Random();
	while(r.getY() > 0){
		int ranNum = ran.nextInt(50);
		r.move(ranNum);
		if(r.getY() <= 0){
			JOptionPane.showMessageDialog(null, num + " has won the race!");
		}
	}
}

}
