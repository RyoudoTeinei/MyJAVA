package ForTest;
import java.io.*;

public class MyKey {
	public static void main(String[] args){
		try {
			File f = new File("C:/MC/key.key");
			
			FileOutputStream fos = new FileOutputStream(f) ;
			
			for (int i = 0; i < 128;i++){
				fos.write((int)(Math.random()*128)) ;
			}
		}catch (Exception e){}
	}
}
