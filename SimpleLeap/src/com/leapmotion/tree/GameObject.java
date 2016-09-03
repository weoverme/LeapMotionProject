package com.leapmotion.tree;

import java.awt.Graphics;

public abstract class GameObject {

	/* Anything in our game will a child of this class
	 */
	
	protected int x, y, z; // can only be accessed from what inherits this class
	protected int velX, velY, velZ;
	
	public GameObject(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	//Getter and Setter for X, Y, Z
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getZ() {
		return z;
	}
	
	//Getter and Setter for Vel X, Y, Z
	public void setVelX(int velX) {
		this.velX = velX;
	}
	public void setVelY(int velY) {
		this.velY = velZ;
	}
	public void setVelZ(int velZ) {
		this.velZ = velZ;
	}
	public int getVelX() {
		return velX;
	}
	public int getVelY() {
		return velY;
	}
	public int getVelZ() {
		return velZ;
	}
}
