package ForTest;
import java.awt.Dimension;
import java.awt.FlowLayout;
 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
 
 //1.����Login�࣬
public class Login {
 
	
	 // 1.�����ж���������
	public static void main(String[] args) {
		// 2.���������У�ʵ����Login��Ķ��󣬵��ó�ʼ������ķ�����
		Login login = new Login();
		login.initUI();
 
	}
 
	
	// 1.�����ж����ʼ������ķ�����
	 
	public void initUI() {
		// 3.��initUI�����У�ʵ����JFrame��Ķ���
		JFrame frame = new JFrame();
		// 4.���ô�����������ֵ�����⡢��С����ʾλ�á��رղ��������֡���ֹ������С���ɼ���...
		frame.setTitle("Login");// ���ô���ı���
		frame.setSize(400, 650);// ���ô���Ĵ�С����λ������
		frame.setDefaultCloseOperation(3);// ���ô���Ĺرղ�����3��ʾ�رմ����˳�����2��1��0
		frame.setLocationRelativeTo(null);// ���ô����������һ������ľ���λ�ã�����null��ʾ�����������Ļ������λ��
		frame.setResizable(false);// ���ý�ֹ���������С
 
		// ʵ����FlowLayout��ʽ������Ķ���ָ�����뷽ʽΪ���ж��룬���֮��ļ��Ϊ5������
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 10, 10);
        frame.setLayout(fl);
 

		ImageIcon icon = new ImageIcon("C:\\Users\\35425\\Pictures\\Uplay\\�ʺ����ţ�Χ��\\�ʺ����ţ�Χ��2019-8-16-1-34-44.jpg");

		JLabel labIcon = new JLabel(icon);

		Dimension dim = new Dimension(400,300);
		labIcon.setPreferredSize(dim);
		
		frame.add(labIcon);
 
		
		
		
		frame.setVisible(true);// ���ô���Ϊ�ɼ�
	}
 
}
