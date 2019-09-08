package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    Polymorph [] p = {new BluePolymorph(10,10,10,10),new RedMorph(50,50,50,50), new MovingMorph(30,300,20,20), new CircleMorph(200,100,30,30), new MouseMorph(20,20,100,100), new ImageMorph(10,400,30,30), new MessageMorph(10,250,20,20)};
    
   /* Polymorph bluePoly;
    Polymorph redPoly;
    Polymorph movePoly;
    */
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
    /* bluePoly.draw(g);
   	 redPoly.draw(g);
   	 movePoly.draw(g);*/
   	 for(Polymorph m:p) {
   		 m.draw(g);
   		 m.update();
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	
   	 
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("moved");
		// TODO Auto-generated method stub
		p[3].setx(e.getX());
		p[3].sety(e.getY());
	}
}
