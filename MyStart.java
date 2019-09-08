package ForSave;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyStart {
	public static void main(String args[]) {
		
		Frame w = new Frame() ;
		w.setSize(300 , 400) ;
		
		MyPanelex mp = new MyPanelex() ;
		w.add(mp) ;
		
		w.addMouseMotionListener(mp) ;
		mp.addMouseMotionListener(mp) ;
		
		w.show() ;
	}
}
class MyPanelex extends Panel implements MouseMotionListener{
	int x = 40 ;
	int y = 40 ;
	public void paint(Graphics g){
		g.fillOval(x , y , 200 , 200) ;
	}

	public void mouseDragged(MouseEvent arg0) {
		x = arg0.getX() ;
		y = arg0.getY() ;
		repaint() ;
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

