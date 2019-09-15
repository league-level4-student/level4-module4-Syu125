package _03_polymorphs;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph{
	File f = new File("emoji.jpg");
	BufferedImage i;
	ImageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		try {
			i = ImageIO.read(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(i, getx(), gety(), getwidth(), getheight(), null);
	}

}
