package demo1;
/**
 * ����һ�����ڲ������һ����ǩ���
 * @author ding
 *
 */
import java.awt.*;           //����awt��
import javax.swing.*;        //����swing��

public class SimpleWindow  extends JFrame{    //����һ��JFrame�ļ̳���
	//private static final long serialVersionUID = 1L;
		public void CreateJFrame(String title) { // ����һ��CreateJFrame()����
			JFrame jf = new JFrame(title); // ʵ����һ��JFrame����
			Container container = jf.getContentPane(); // ��ȡһ������
			JLabel jl = new JLabel("���ǲ��Եĵ�һ������"); // ����һ��JLabel��ǩ
			
			jl.setHorizontalAlignment(SwingConstants.CENTER);// ʹ��ǩ�ϵ����־���
			container.add(jl); // ����ǩ��ӵ�������
			container.setBackground(Color.white);//���������ı�����ɫ
			jf.setVisible(true); // ʹ�������
			jf.setSize(200, 150); // ���ô����С
			// ���ô���رշ�ʽ
			jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}
		
		public static void main(String args[]){//���������е���createJFrame()����
			new SimpleWindow().CreateJFrame("�����������JFrame����");
		}
}
