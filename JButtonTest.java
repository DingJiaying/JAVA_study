package demo9;
/**
 * ��ϰ��ť���
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
		setLayout(new GridLayout(1, 2, 1, 1)); // �������񲼾ֹ������������У�����֮���ˮƽ����ʹ�ֱ����
		Container c = getContentPane(); // ��������
		for (int i = 0; i < 2; i++) {
			// ������ť��ͬʱ���ð�ť������ͼ��
			JButton J = new JButton("button" + i, icon);
			c.add(J); // ����������Ӱ�ť
			if (i % 2 == 0) {
				J.setEnabled(false); // ��������һЩ��ť�����ã�ż���İ�ť������
			}
		}
		JButton jb = new JButton(); // ʵ����һ��û��������ͼƬ�İ�ť
		jb.setMaximumSize(new Dimension(90, 30)); // ���ð�ť��ͼƬ��ͬ��С
		jb.setIcon(icon); // Ϊ��ť����ͼ��
		jb.setHideActionText(true);
		jb.setToolTipText("ͼƬ��ť"); // ���ð�ť��ʾΪ����
		jb.setBorderPainted(false); // ���ð�ť�߽粻��ʾ
		jb.addActionListener(new ActionListener() { // Ϊ��ť��Ӽ����¼�
					public void actionPerformed(ActionEvent e) {
						// ����ȷ�϶Ի���
						JOptionPane.showMessageDialog(null, "�����Ի���");
					}
				});
		c.add(jb); // ����ť��ӵ�������
		
		setTitle("������������ͼƬ�İ�ť");
		setSize(350, 150);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new JButtonTest();
	}
}
