package dmeo11;
/**
 * ��ϰ�б���ʹ��
 * @author ding
 *
 */
import java.awt.*;
import javax.swing.*;

public class JListTest extends JFrame {
	public JListTest() {
		Container cp = getContentPane();
		
		cp.setLayout(null);
		JList<String> jl = new JList<>(new MyListModel());//Ӧ����JDK7��������
		JScrollPane js = new JScrollPane(jl);
		js.setBounds(10, 10, 100, 100); //setBounds(x,y,width,height); x:���������X���ϵ���� y:���������Y���ϵ���� width:����ĳ��� height:�����
		cp.add(js);
		setTitle("һ������Ҫ��������");//���ڵı���
		setSize(200, 150);//���ڵĴ�С
		setVisible(true);//�����Ƿ�ɼ�
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new JListTest();

		
	}
}

class MyListModel extends AbstractListModel<String> {

	private String[] contents = { "�緹", "�緹", "��" };//�������õ�����
	
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

