package ForTest;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class MyChatPart2 extends JFrame implements ActionListener{
	JTextField txtMess = new JTextField() ;
	JComboBox cmbUser = new JComboBox() ;
	JTextArea txtContent = new JTextArea() ;
	MyChatPart2{
		this.setSize(400,600) ;
		this.setResizable(false) ;
		this.getContentPane().setBackground(Color.white);
		
		JTextField txtMess = new JTextField() ;
		
		JComboBox cmbUser = new JComboBox() ;
		JButton btnSend = new JButton("����") ;
		
		JTextArea txtContent = new JTextArea() ;
		
		JScrollPane spContent = new JScrollPane(txtContent) ;//������
		
		//����
		butSend.addActionListener(this) ;
		
		//С���
		JPanel panSmall = new JPanel() ;
		panSmall.setLayout(new GridLayout(1 , 2)) ;
		
		panSmall.add(cmbUser) ;
		panSmall.add(btnSend) ;
		
		//�����
		JPanel panBig = new JPanel() ;
		panBig.setLayout(new GridLayout(2 ,2));
		
		panBig.add(txtMess) ;
		panBig.add(panSmall) ;
		
		w.setLayout(new BorderLayout());
		w.add(panBig , BorderLayout.NORTH);
		w.add(spContent , BorderLayout.CENTER) ;
		
		w.setVisible(true);
		}
}
