package _02_Advanced_Robot_Race;

import java.util.Random;


import javax.swing.JOptionPane;


import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
public static void main(String[] args) {
	
	Robot rob1 = new Robot(500,1000);
	Thread r1 = new Thread(()->{
		Random ran = new Random();
		while(rob1.getY() > 0){
			int ranNum = ran.nextInt(50);
			rob1.move(ranNum);
			if(rob1.getY() <= 0){
				JOptionPane.showMessageDialog(null, 1 + " has won the race!");
				System.exit(0);
			}
		}
	});
	Robot rob2 = new Robot(700,1000);
	Thread r2 = new Thread(()->{
		
		Random ran = new Random();
		while(rob2.getY() > 0){
			int ranNum = ran.nextInt(50);
			rob2.move(ranNum);
			if(rob2.getY() <= 0){
				JOptionPane.showMessageDialog(null, 2 + " has won the race!");
				System.exit(0);
			}
		}
	});
	Robot rob3 = new Robot(900,1000);
	Thread r3 = new Thread(()->{
		
		Random ran = new Random();
		while(rob3.getY() > 0){
			int ranNum = ran.nextInt(50);
			rob3.move(ranNum);
			if(rob3.getY() <= 0){
				JOptionPane.showMessageDialog(null, 3 + " has won the race!");
				System.exit(0);
			}
		}
	});
	Robot rob4 = new Robot(1100,1000);
	Thread r4 = new Thread(()->{
		
		Random ran = new Random();
		while(rob4.getY() > 0){
			int ranNum = ran.nextInt(50);
			rob4.move(ranNum);
			if(rob4.getY() <= 0){
				JOptionPane.showMessageDialog(null, 4 + " has won the race!");
				System.exit(0);
			}
		}
	});
	Robot rob5 = new Robot(1300,1000);
	Thread r5 = new Thread(()->{
		
		Random ran = new Random();
		while(rob5.getY() > 0){
			int ranNum = ran.nextInt(50);
			rob5.move(ranNum);
			if(rob5.getY() <= 0){
				JOptionPane.showMessageDialog(null, 5 + " has won the race!");
				System.exit(0);
			}
		}
	});
	

	
	r1.start();
	r2.start();
	r3.start();
	r4.start();
	r5.start();
	
}
//public static void race(Robot r, int num){
//	Random ran = new Random();
//	while(r.getY() > 0){
//		int ranNum = ran.nextInt(50);
//		r.move(ranNum);
//		if(r.getY() <= 0){
//			JOptionPane.showMessageDialog(null, num + " has won the race!");
//		}
//	}
//}

}
