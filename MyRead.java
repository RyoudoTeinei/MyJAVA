package ForTest;
import java.io.*;

public class MyRead {
	public static void main(String args[]){
		try{
			File f = new File("C:/work/test2.txt") ;
			
			FileInputStream fis = new FileInputStream(f) ;
			
			System.out.println(fis.read());
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
