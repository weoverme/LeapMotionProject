package com.fit3036project.leapmotion;

import com.leapmotion.leap.*;

public class LeapListener extends Listener {

	public void onFrame(Controller controller) {
		/**
		 * 
		 * Once the Controller object is registered with the LeapListener,
		 * this method will be called every time a new frame is received from
		 * Leap.
		 * 
		 */
		Frame frame = controller.frame();
		
		//Collect tracking data from hands
		if (!frame.hands().isEmpty()) {
			System.out.println("First Hand data:" 
					+ "\nPalm Position (X|Y|Z): " 
					+ frame.hand(0).palmPosition().getX() + "|" 
					+ frame.hand(0).palmPosition().getY() + "|"
					+ frame.hand(0).palmPosition().getZ());
			}
		//Collect tracking data from (frontmost) fingers
		if (!frame.fingers().isEmpty()) {
			System.out.println("Frontmost Finger data:" 
					+ "\nTip Position (X|Y|Z): "
					+ frame.fingers().frontmost().tipPosition().getX()
					+ frame.fingers().frontmost().tipPosition().getY()
					+ frame.fingers().frontmost().tipPosition().getZ());
		}
		
	}
}
