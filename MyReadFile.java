package ForTest;
import java.io.*;

public class MyReadFile {
	public static void main(String args[]){
		try{
			File inFile = new File("C:/MC/text.txt");
			File outFile = new File("C:/MC/test1.txt");
			
			FileReader fr = new FileReader(inFile) ;
			BufferedReader br = new BufferedReader(fr) ;
			
			FileWriter fw = new FileWriter(outFile) ;
			PrintWriter pw = new PrintWriter(fw) ;
			
			while(br.ready()){
				System.out.println(br.readLine()) ;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
