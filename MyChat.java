package ForSave;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import book_src.QQLogin;
import book_src.QQMain;

public class MyChat extends JFrame implements ActionListener {
	JTextField txtUser = new JTextField() ;
	JPasswordField txtPass = new JPasswordField();
	public MyChat() {
		
		this.setSize(600,414);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.lightGray);
		
		JLabel labUser = new JLabel("用户名:") ;
		JLabel labPass = new JLabel("密码:") ;
		
		JButton btnLogin = new JButton("登录") ;
		JButton btnReg = new JButton("注册") ;
		JButton btnCancel = new JButton("取消") ;
		
		
		btnLogin.addActionListener(this);
		btnReg.addActionListener(this);
		btnCancel.addActionListener(this);

		JPanel panInput = new JPanel() ;
        panInput.setLayout(new GridLayout(2 , 2)) ;
		
		panInput.add(labUser) ;
		panInput.add(txtUser) ;
		
		panInput.add(labPass) ;
		panInput.add(txtPass) ;
		
		JPanel panButton1 = new JPanel() ;
		panButton1.setLayout(new FlowLayout()) ;
		
		panButton1.add(btnLogin);
		panButton1.add(btnReg);
		panButton1.add(btnCancel);
		
		this.setLayout(new BorderLayout()) ;
		
		this.add(panInput , BorderLayout.CENTER) ;
		this.add(panButton1 , BorderLayout.SOUTH) ;
	
        ImageIcon w1 = new ImageIcon("D:\\JAVA\\Material\\MyChat!.png") ;
		JLabel labIcon = new JLabel(w1);
		
		Dimension dim = new Dimension(600,270);
		labIcon.setPreferredSize(dim);

		this.add(labIcon , BorderLayout.NORTH);

		this.setVisible(true);
		}
	public static void main(String args[]){
		MyChat w = new MyChat() ;
		w.setVisible(true) ;
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("登录")){
			String user = txtUser.getText() ;
			String pass = txtPass.getText() ;
			if(user.equals("aaa")&&pass.equals("111")){
				MyChatPart2 w = new MyChatPart2() ;
				w.setVisible(true) ;
				this.setVisible(false) ;
			}		}
		if(arg0.getActionCommand().equals("注册")){
			System.out.println("用户点击了注册") ;
		}
		if(arg0.getActionCommand().equals("取消")){
			System.out.println("用户点击了取消") ;
			this.setVisible(false);
		}
	}
}




