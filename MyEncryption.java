package ForTest;
import java.io.*;

public class MyEncryption {
	public static void main(String args[]){
		try{
			File a = new File("C:/MC/text.txt");
			File b = new File("C:/MC/test11.txt");
			
			FileInputStream fis = new FileInputStream(a);
			FileOutputStream fos = new FileOutputStream(b);
			
			int x = fis.available();
			for (int i = 0 ; i < x ; i++){
				fos.write((char)fis.read()-100);
			}
		}catch(Exception e){}
	}
}
