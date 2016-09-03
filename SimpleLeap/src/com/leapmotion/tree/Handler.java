package com.leapmotion.tree;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
	/* 
	 * 
	 * Handler will maintain, update and render all objects on the screen
	 * 
	 */

	LinkedList<GameObject> object = new LinkedList<GameObject>(); 
	
	public void tick() {
		// Loop each GameObject in LinkedList
		for(int i=0; i<object.size(); i++) {
			//localise a GameObject
			GameObject tempObject = object.get(i);
			tempObject.tick();
		}
	}
	
	public void render(Graphics g) {
		for (int i=0; i<object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.render(g);
		}
 	}
	
	public void addObject(GameObject object) {
		this.object.add(object);
	}
	
	public void removeObject(GameObject object) {
		this.object.remove(object);
	}
}
