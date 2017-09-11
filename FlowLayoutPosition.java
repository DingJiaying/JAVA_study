package demo5;
/**
 * 练习流布局管理，从左到右摆放那个，当组件填满一行之后自动换行
 * @author ding
 *
 */
import java.awt.*;
import javax.swing.*;

public class FlowLayoutPosition extends JFrame{
	public FlowLayoutPosition() {
		setTitle("本窗体使用流布局管理器"); // 设置窗体标题
		Container c = getContentPane();
		// 设置窗体使用流布局管理器，使组件右对齐，并且设置组件之间的水平间隔与垂直间隔
		setLayout(new FlowLayout(2, 10, 10));
		for (int i = 0; i < 10; i++) { // 在容器中循环添加10个按钮
			c.add(new JButton("i" + i));
		}
		setSize(200, 200); // 设置窗体大小
		setVisible(true); // 设置窗体可见
		// 设置窗体关闭方式
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new FlowLayoutPosition();
	}
}
