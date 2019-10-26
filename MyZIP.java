package ForTest;
import java.io.*;

public class MyZIP {
	public static void main(String args[]){
		try{
			File inFile = new File("C:/Program Files/Java/jdk1.8.0_221/src.zip");
			File outFile = new File("C:/MC/src.zip");
			
			FileInputStream fis = new FileInputStream(inFile);
			FileOutputStream fos = new FileOutputStream(outFile);
			
			byte[] a = new byte[8192];
			int length = fis.available()/8192 ;
			for (int i = 0; i < length ; i ++ ){
				fis.read(a) ;
				fos.write(a) ;
			}
			int size = fis.read(a);
			fos.write(a , 0, size);
		}catch(Exception e){}
	}
}
