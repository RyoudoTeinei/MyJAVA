package ForTest;
import java.io.*;

public class MyIO {
	public static void main(String args[]){
		try{
			//��������Դ
			File a = new File("C:/MC/text.txt") ;
			File y = new File("C:/MC/text2.txt");
			
			//�����ܵ�
			FileInputStream fis = new FileInputStream(a) ;
			FileOutputStream fos = new FileOutputStream(y) ;
			
			//�����ܵ�
			int x = fis.available();
			for (int i = 0 ; i < x; i++){
				System.out.println(fis.read());
			}
		}catch(Exception e){}
	}
}
