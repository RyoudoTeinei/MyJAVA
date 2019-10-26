package ForTest;
import java.io.*;

public class MyDecrypt {
	public static void main(String args[]){
		try{
			File a = new File("C:/MC/test11.txt");
			
			FileInputStream fis = new FileInputStream(a);
			
			int x = fis.available();
			for (int i = 0 ; i < x ; i++){
				System.out.println((char)fis.read()+100);
			}
		}catch(Exception e){}
	}
}
