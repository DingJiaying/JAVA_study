package dmeo10;
/**
 * 练习下拉列表组件
 * @author ding
 *
 */
import java.awt.*;
import javax.swing.*;

public class JComboBoxModelTest extends JFrame{
	JComboBox<String> jc = new JComboBox<>(new MyComboBox());  //这里应用了JDK7的新特性
	JLabel jl = new JLabel("请选择住宅区");        //设置标题文本
	
	public JComboBoxModelTest() {
		setSize(new Dimension(160, 180));
		setVisible(true);
		setTitle("在窗口中设置下拉列表框");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(jl);
		cp.add(jc);
	}
	
	public static void main(String[] args) {
		new JComboBoxModelTest();
	}
}

class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String> {
	private static final long serialVersionUID = 1L;
	String selecteditem = null;
	String[] test = { "橘园A", "橘园B", "橘园C", "橘园D" };
	
	public String getElementAt(int index) {      //根据索引返回值
		return test[index];
	}
	
	public int getSize() {                   //返回下拉列表框中项目的数目
		return test.length;
	}
	
	public void setSelectedItem(Object item) {  //设置下拉列表框项目
		selecteditem = (String) item;
	}
	
	public Object getSelectedItem() {       //获取下拉列表框中的项目
		return selecteditem;
	}
	
	public int getIndex() {
		for (int i = 0; i < test.length; i++) {
			if (test[i].equals(getSelectedItem()))
				return i;
		}
		return 0;
	}
}
