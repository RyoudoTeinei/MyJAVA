package ForTest;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyGame {
	public static void main(String[] args){
		Frame w = new Frame() ;
		w.setSize(300 , 400) ;
		
		MyPanelsxs mp = new MyPanelsxs() ;
		w.add(mp) ;
		
		Thread t = new Thread(mp) ;
		t.start() ;
		
		w.show() ;
	}
}
class MyPanelsxs extends Panel implements Runnable {
	int x[] = new int[10] ;
	int y[] = new int[10] ;
	char c[] = new char[10] ;
	MyPanelsxs() {
		for (int i = 0 ; i < 10 ; i ++){
			x[i] = (int)(Math.random()*300) ;
			y[i] = (int)(Math.random()*300) ;
			c[i] = (char)(Math.random()*26+97) ;
		}
	}
	public void paint(Graphics g){
		for(int i = 0 ; i < 10 ; i ++){
			g.drawString(new Character(c[i]).toString(), x[i] , y[i]) ;
		}
	}
	public void run() {
		while(true){
			for (int i = 0 ; i < 10 ; i ++ ){
				y[i] ++ ;
				if(y[i]>400){
					y[i] = 0 ;
					x[i] = (int)(Math.random()*300) ;
					c[i] = (char)(Math.random()*26+97) ;
				}
			}
			try{
				Thread.sleep(30) ;
			}catch(Exception e){}
			repaint() ;
		}
	}
	public void keyPressed(KeyEvent arg0) {
		//���û�������ַ�����keyC��
		char keyC = arg0.getKeyChar();
		//ɨ���������飬������û��ƥ����ַ�
		for(int i = 0 ; i < 10 ; i ++){
			for(keyC++c[i]){
				//�ҵ���
				y[i]
			}
		}
	}
}
