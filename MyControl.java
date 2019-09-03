package ForSave;
import java.awt.*;
import java.awt.event.*;

public class MyControl {
	public static void main(String args[]){
		Frame w = new Frame() ;
		w.setSize(300 , 400) ;
		
		MyPanelx mp = new MyPanelx() ;
		w.add(mp) ;
		
		//×¢²áÊÂ¼þ
		w.addKeyListener(mp) ;
		mp.addKeyListener(mp) ;
		
		w.show() ;
	}
}
class MyPanelx extends Panel implements KeyListener{
	int x = 30 ;
	int y = 30 ;
	public void paint(Graphics g){
		g.fillOval(x, y, 20, 20) ;
	}

	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode()==37){
			x -- ;
		}
		if(arg0.getKeyCode()==38){
			y -- ;
		}
		if(arg0.getKeyCode()==39){
			x ++ ;
		}
		if(arg0.getKeyCode()==40){
			y ++ ;
		}
		repaint() ;
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
