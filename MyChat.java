package ForTest;
import java.awt.*;

import javax.swing.*;

public class MyChat {
	public static void main(String args[]){
		JFrame w = new JFrame() ;
		w.setSize(400,650);
		
		JLabel labUser = new JLabel("用户名") ;
		JLabel labPass = new JLabel("密码") ;
		
		JTextField txtUser = new JTextField() ;
		JPasswordField txtPass = new JPasswordField() ;
		
		JButton btnLogin = new JButton("登录") ;
		JButton btnReg = new JButton("注册") ;
		JButton btnCancel = new JButton("取消") ;
		
		JPanel panInput = new JPanel() ;
        panInput.setLayout(new GridLayout(2 , 9)) ;
		
		panInput.add(labUser) ;
		panInput.add(txtUser) ;
		
		panInput.add(labPass) ;
		panInput.add(txtPass) ;
		
		JPanel panButton1 = new JPanel() ;
		panButton1.setLayout(new FlowLayout()) ;
		
		panButton1.add(btnLogin);
		panButton1.add(btnReg);
		panButton1.add(btnCancel);
		
		w.setLayout(new BorderLayout()) ;
		
		w.add(panInput , BorderLayout.CENTER) ;
		w.add(panButton1 , BorderLayout.SOUTH) ;
	
		w.setLocationRelativeTo(null);
		w.setResizable(false);// 
		
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 10, 10);
        w.setLayout(fl);
        
		ImageIcon w1 = new ImageIcon("C:\\Users\\35425\\Downloads\\36a3c90aa143067caf39ce60e7506467.jpg") ;
		JLabel labIcon = new JLabel(w1);
		
		Dimension dim = new Dimension(300,400);
		labIcon.setPreferredSize(dim);

		w.add(labIcon);

		
		w.setVisible(true);
		}
	}


