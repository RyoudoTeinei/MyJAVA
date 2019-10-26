package ForTest;
import java.io.*;

public class MyIO {
	public static void main(String args[]){
		try{
			//定义数据源
			File a = new File("C:/MC/text.txt") ;
			File y = new File("C:/MC/text2.txt");
			
			//建立管道
			FileInputStream fis = new FileInputStream(a) ;
			FileOutputStream fos = new FileOutputStream(y) ;
			
			//操作管道
			int x = fis.available();
			for (int i = 0 ; i < x; i++){
				System.out.println(fis.read());
			}
		}catch(Exception e){}
	}
}
