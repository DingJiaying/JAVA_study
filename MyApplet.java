package demo1;
/**
 * 导入java自身的包
 * @author ding
 *
 */
import java.applet.*;//导入java.applet中所有包
import java.awt.*;//导入java.awt中所有包

public class MyApplet extends Applet{
	public void paint(Graphics g)
    {
        g.drawString("世界，你好！", 30, 30);// 输出一行字
        g.drawLine(50, 50, 100, 100);// 画一条线
    }
}
