package ForSave;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyChat implements ActionListener {
	JTextField txtUser = new JTextField() ;
	JPasswordField txtPass = new JPasswordField();
	public static void main(String args[]){
		JFrame w = new JFrame() ;
		w.setSize(600,414);
		w.setResizable(false);
		w.getContentPane().setBackground(Color.lightGray);
		
		JLabel labUser = new JLabel("用户名:") ;
		JLabel labPass = new JLabel("密码:") ;
		
		final JTextField txtUser = new JTextField() ;
        final JPasswordField txtPass = new JPasswordField() ;

		
		JButton btnLogin = new JButton("登录") ;
		JButton btnReg = new JButton("注册") ;
		JButton btnCancel = new JButton("取消") ;
		btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtUser.setText("请填写用户名");
                txtPass.setText("请填写密码");
            }
        });
		
		MyChat e = new MyChat() ;
		btnLogin.addActionListener(e);
		btnReg.addActionListener(e);
		btnCancel.addActionListener(e);

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
		
		w.setLayout(new BorderLayout()) ;
		
		w.add(panInput , BorderLayout.CENTER) ;
		w.add(panButton1 , BorderLayout.SOUTH) ;
	
        ImageIcon w1 = new ImageIcon("D:\\JAVA\\Material\\MyChat!.png") ;
		JLabel labIcon = new JLabel(w1);
		
		Dimension dim = new Dimension(600,270);
		labIcon.setPreferredSize(dim);

		w.add(labIcon , BorderLayout.NORTH);

		
		w.setVisible(true);
		}

	public void actionPerformed(ActionEvent arg0) {
		System.out.println("事件响应") ;
		// TODO Auto-generated method stub
		
	}
}


