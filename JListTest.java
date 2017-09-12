package dmeo11;
/**
 * 练习列表框的使用
 * @author ding
 *
 */
import java.awt.*;
import javax.swing.*;

public class JListTest extends JFrame {
	public JListTest() {
		Container cp = getContentPane();
		
		cp.setLayout(null);
		JList<String> jl = new JList<>(new MyListModel());//应用了JDK7的新特性
		JScrollPane js = new JScrollPane(jl);
		js.setBounds(10, 10, 100, 100); //setBounds(x,y,width,height); x:组件在容器X轴上的起点 y:组件在容器Y轴上的起点 width:组件的长度 height:组件的
		cp.add(js);
		setTitle("一天最重要的三件事");//窗口的标题
		setSize(200, 150);//窗口的大小
		setVisible(true);//窗口是否可见
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new JListTest();

		
	}
}

class MyListModel extends AbstractListModel<String> {

	private String[] contents = { "早饭", "午饭", "晚饭" };//表内设置的文字
	
	public String getElementAt(int x) {
		if (x < contents.length)
			return contents[x++];
		else
			return null;
	}	
	public int getSize() {
		return contents.length;
	}
}

