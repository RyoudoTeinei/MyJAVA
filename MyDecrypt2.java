package ForTest;
import java.io.*;

public class MyDecrypt2 {
	public static void main(String[] args){
		try{
			//¶ÁÈ¡ÃÜ³×key.key
			int key[] = new int[128] ;
			File keyFile = new File("C:/MC/key.key");
			
			FileInputStream keyFis = new FileInputStream(keyFile) ;
			
			for (int i = 0; i < 128;i++) {
				key[i] = keyFis.read();
			}
			File f = new File("C:/MC/text114514.txt") ;
			
			FileInputStream fis = new FileInputStream(f);
			
			int length = fis.available() ;
			for (int i = 0;i < length; i++){
				System.out.print((char)(fis.read()-key[i%128]));
			}
		}catch(Exception e){}
		
	}

}
