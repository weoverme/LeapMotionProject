package com.fit3036project.leapmotion;
import com.leapmotion.leap.*;

public class SimpleLeap {

	public static void main(String args[]) {
		Controller controller = new Controller();
		
		LeapListener listener = new LeapListener();
		
		controller.addListener(listener);
		
		while (true) {
			
		}
	}
}
