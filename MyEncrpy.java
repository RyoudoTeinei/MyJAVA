package ForTest;
import java.io.*;

public class MyEncrpy {
	public static void main(String[] args){
		try {
			//¶ÁÃÜ³×
			int key[] = new int[128] ;
			File keyFile = new File("C:/MC/key.key");
			
			FileInputStream keyFis = new FileInputStream(keyFile) ;
			
			for (int i = 1;i < 128;i++){
				key[i] = keyFis.read();
			}
		
		//¼ÓÃÜ
		File inFile = new File("C:/MC/text.txt");
		File outFile = new File("C:/MC/text114514.txt");
		
		FileInputStream fis = new FileInputStream(inFile);
		FileOutputStream fos = new FileOutputStream(outFile);
		
		int length = fis.available();
		for (int i = 0; i < length; i++) {
			fos.write(fis.read()+key[i%128]) ;
		}
		}catch (Exception e) {}
	}
}


