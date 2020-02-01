package ForSave;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.* ;

public class MyChatPart2 extends JFrame implements ActionListener{
	JTextField txtMess = new JTextField() ;
	JComboBox cmbUser = new JComboBox() ;
	JTextArea txtContent = new JTextArea() ;
	MyChatPart2(){
		this.setSize(400,600) ;
		this.getContentPane().setBackground(Color.white);
		
		JButton btnSend = new JButton("发送") ;
		
		JScrollPane spContent = new JScrollPane(txtContent) ;//滚动条
		
		//监听
		btnSend.addActionListener(this) ;
		
		//小面板
		JPanel panSmall = new JPanel() ;
		panSmall.setLayout(new GridLayout(1 , 2)) ;
		
		panSmall.add(cmbUser) ;
		panSmall.add(btnSend) ;
		
		//大面板
		JPanel panBig = new JPanel() ;
		panBig.setLayout(new GridLayout(2 ,1));
		
		panBig.add(txtMess) ;
		panBig.add(panSmall) ;
		
		this.setLayout(new BorderLayout());
		this.add(panBig , BorderLayout.NORTH);
		this.add(spContent , BorderLayout.CENTER) ;
		
		//读
		try{
			File f = new File("D:/LIFE IS SHORT,I USE JAVA") ;
			
			FileReader fr = new FileReader(f) ;
			BufferedReader br = new BufferedReader(fr) ;
			
			while(br.ready()){
				txtContent.append(br.readLine()+"\n");
				
			}
		}catch(Exception e){}
		
	}
	

	public void actionPerformed(ActionEvent arg0) {
		txtContent.append(txtMess.getText()+"\n");
		
		try{
			File f = new File("D:/LIFE IS SHORT,I USE JAVA");
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw) ;
			
			pw.println(txtMess.getText());
			
			pw.close();
		}catch(Exception e){}
		txtMess.setText("");
		
	}
	    	

}
