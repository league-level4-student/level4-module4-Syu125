package _03_polymorphs;

import java.awt.Graphics;
import java.awt.event.MouseMotionListener;

public abstract class Polymorph {
	private int x;
	private int y;
	private int width;
	private int height;
	int degree = 0;

	Polymorph(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getx() {
		return this.x;
	}

	public int gety() {
		return this.y;
	}

	public int getwidth() {
		return this.width;
	}

	public int getheight() {
		return this.height;
	}

	public void setx(int x) {
		this.x = x;
	}

	public void sety(int y) {
		this.y = y;
	}

	public void setwidth(int width) {
		this.width = width;
	}

	public void setheight(int height) {
		this.height = height;
	}

	public void update() {

		if (this.getClass().getSimpleName().equals("MovingMorph")) {
			this.x += 10;
		}
		if (this.getClass().getSimpleName().equals("CircleMorph")) {
			this.x += Math.cos(this.degree) * 50;
			this.y += Math.sin(this.degree) * 50;
		}
		
		this.degree++;
	}

	public abstract void draw(Graphics g);

}
