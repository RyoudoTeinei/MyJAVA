package ForTest;
import java.awt.Dimension;
import java.awt.FlowLayout;
 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
 
 //1.定义Login类，
public class Login {
 
	
	 // 1.在类中定义主函数
	public static void main(String[] args) {
		// 2.在主函数中，实例化Login类的对象，调用初始化界面的方法。
		Login login = new Login();
		login.initUI();
 
	}
 
	
	// 1.在类中定义初始化界面的方法；
	 
	public void initUI() {
		// 3.在initUI方法中，实例化JFrame类的对象。
		JFrame frame = new JFrame();
		// 4.设置窗体对象的属性值：标题、大小、显示位置、关闭操作、布局、禁止调整大小、可见、...
		frame.setTitle("Login");// 设置窗体的标题
		frame.setSize(400, 650);// 设置窗体的大小，单位是像素
		frame.setDefaultCloseOperation(3);// 设置窗体的关闭操作；3表示关闭窗体退出程序；2、1、0
		frame.setLocationRelativeTo(null);// 设置窗体相对于另一个组件的居中位置，参数null表示窗体相对于屏幕的中央位置
		frame.setResizable(false);// 设置禁止调整窗体大小
 
		// 实例化FlowLayout流式布局类的对象，指定对齐方式为居中对齐，组件之间的间隔为5个像素
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 10, 10);
        frame.setLayout(fl);
 

		ImageIcon icon = new ImageIcon("C:\\Users\\35425\\Pictures\\Uplay\\彩虹六号：围攻\\彩虹六号：围攻2019-8-16-1-34-44.jpg");

		JLabel labIcon = new JLabel(icon);

		Dimension dim = new Dimension(400,300);
		labIcon.setPreferredSize(dim);
		
		frame.add(labIcon);
 
		
		
		
		frame.setVisible(true);// 设置窗体为可见
	}
 
}
