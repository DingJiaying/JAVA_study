package demo9;
/**
 * 练习按钮组件
 * @author ding
 *
 */
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;

public class JButtonTest extends JFrame{
	public JButtonTest() {
		URL url = JButtonTest.class.getResource("imageButtoo.jpg");
		Icon icon = new ImageIcon(url);
		setLayout(new GridLayout(1, 2, 1, 1)); // 设置网格布局管理器三行两列，网格之间的水平距离和垂直距离
		Container c = getContentPane(); // 创建容器
		for (int i = 0; i < 2; i++) {
			// 创建按钮，同时设置按钮文字与图标
			JButton J = new JButton("button" + i, icon);
			c.add(J); // 在容器中添加按钮
			if (i % 2 == 0) {
				J.setEnabled(false); // 设置其中一些按钮不可用，偶数的按钮不可用
			}
		}
		JButton jb = new JButton(); // 实例化一个没有文字与图片的按钮
		jb.setMaximumSize(new Dimension(90, 30)); // 设置按钮与图片相同大小
		jb.setIcon(icon); // 为按钮设置图标
		jb.setHideActionText(true);
		jb.setToolTipText("图片按钮"); // 设置按钮提示为文字
		jb.setBorderPainted(false); // 设置按钮边界不显示
		jb.addActionListener(new ActionListener() { // 为按钮添加监听事件
					public void actionPerformed(ActionEvent e) {
						// 弹出确认对话框
						JOptionPane.showMessageDialog(null, "弹出对话框");
					}
				});
		c.add(jb); // 将按钮添加到容器中
		
		setTitle("创建带文字与图片的按钮");
		setSize(350, 150);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new JButtonTest();
	}
}
