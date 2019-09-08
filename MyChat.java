package ForTest;

import java.awt.*;

import java.awt.event.*;

import javax.swing.* ;



public class MyChat {
	public static void main(String args[]) {
		JFrame w = new JFrame() ;
		w.setSize(400 , 300) ;
		w.getContentPane().setBackground(Color.GRAY) ;
		
		JButton x = new JButton("OK") ;
		w.add(x) ;
		
		MyPanelesss mp = new MyPanelesss() ;
		w.add(mp) ;
		
		w.addMouseListener(mp) ;
		mp.addMouseListener(mp) ;
		
		w.setVisible(true) ;
	}
}
class MyPanelesss extends Panel implements MouseListener{
	boolean x = true ;
	public void paint(Graphics g){
		super.paint(g) ;
		if(x){//为了上方而做的两条白线
		g.setColor(Color.WHITE);
		g.drawLine(80,100,80,170);
		g.drawLine(80, 100, 270, 100);
		//下面的黑线
		g.setColor(Color.BLACK);
		g.drawLine(80,170,270,170);
		g.drawLine(270, 100, 270, 170);
		}else{
			g.setColor(Color.WHITE);
			g.drawLine(80,170,270,170);
			g.drawLine(270, 100, 270, 170);
			g.setColor(Color.BLACK);
			g.drawLine(80,100,80,170);
			g.drawLine(80, 100, 270, 100);
		}
	}

	public void addMouseListener(MyPanelesss mp) {
		// TODO Auto-generated method stub
		
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
	
	}
	
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void mousePressed(MouseEvent arg0) {
		if(arg0.getX()>80&&arg0.getX()<270&&arg0.getY()>100&&arg0.getY()<170){
			x = false ;
			repaint() ;
			}
	
		// TODO Auto-generated method stub
	}		
	public void mouseReleased(MouseEvent arg0) {
		x = true ;
		repaint() ;
		// TODO Auto-generated method stub
		
	}
    
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
