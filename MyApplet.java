package demo1;
/**
 * ����java����İ�
 * @author ding
 *
 */
import java.applet.*;//����java.applet�����а�
import java.awt.*;//����java.awt�����а�

public class MyApplet extends Applet{
	public void paint(Graphics g)
    {
        g.drawString("���磬��ã�", 30, 30);// ���һ����
        g.drawLine(50, 50, 100, 100);// ��һ����
    }
}
