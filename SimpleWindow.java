package demo1;
/**
 * 创建一个窗口并且添加一个标签组件
 * @author ding
 *
 */
import java.awt.*;           //导入awt包
import javax.swing.*;        //导入swing包

public class SimpleWindow  extends JFrame{    //定义一个JFrame的继承类
	//private static final long serialVersionUID = 1L;
		public void CreateJFrame(String title) { // 定义一个CreateJFrame()方法
			JFrame jf = new JFrame(title); // 实例化一个JFrame对象
			Container container = jf.getContentPane(); // 获取一个容器
			JLabel jl = new JLabel("这是测试的第一个窗体"); // 创建一个JLabel标签
			
			jl.setHorizontalAlignment(SwingConstants.CENTER);// 使标签上的文字居中
			container.add(jl); // 将标签添加到容器中
			container.setBackground(Color.white);//设置容器的背景颜色
			jf.setVisible(true); // 使窗体可视
			jf.setSize(200, 150); // 设置窗体大小
			// 设置窗体关闭方式
			jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}
		
		public static void main(String args[]){//在主方法中调用createJFrame()方法
			new SimpleWindow().CreateJFrame("创建最基础的JFrame窗体");
		}
}
