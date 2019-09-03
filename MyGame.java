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
		//将用户输入的字符存入keyC中
		char keyC = arg0.getKeyChar();
		//扫描整个数组，看看有没有匹配的字符
		for(int i = 0 ; i < 10 ; i ++){
			for(keyC++c[i]){
				//找到力
				y[i]
			}
		}
	}
}
