package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.green);
		g.fillRect(getx(), gety(), getwidth(), getheight());
		update();
	}

}
