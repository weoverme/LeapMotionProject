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
		
		//Retrieve an InteractionBox reference
		InteractionBox box = frame.interactionBox();

		if (!frame.fingers().isEmpty()) {
			//Retrieve the vector of the frontmost finger's tip
			Vector frontmost = frame.fingers().frontmost().tipPosition();
			//Normalise the frontmost vector to a 0..1 scale
			frontmost = box.normalizePoint(frontmost);
			
			//Print out the vector. L, Front and bottom are 0.
			System.out.println("Frontmost Finger normalised coordinates (X|Y|Z):" 
					+ frontmost.getX() + "|" + frontmost.getY() + "|" + frontmost.getZ());
		} //end if
		/*
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
			
			System.out.println("Second Frontmost Finger data:" 
					+ "\nTip Position (X|Y|Z): "
					+ frame.fingers().get(0).tipPosition().getX()
					+ frame.fingers().get(0).tipPosition().getY()
					+ frame.fingers().get(0).tipPosition().getZ());
			
		}
		*/
		
	}
}
