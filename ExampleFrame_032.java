package demo18;
/**
 * 练习内部窗口
 * @author ding
 *
 */

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.net.*;
import javax.swing.*;

public class ExampleFrame_03 extends JFrame{
	JDesktopPane desktopPane = null;// 定义一个桌面面板对象
	InternalFrame pInFrame = null;// 定义一个人事管理内部窗体对象
	InternalFrame rInFrame = null;// 定义一个账套管理内部窗体对象
	InternalFrame tInFrame = null;// 定义一个待遇报表内部窗体对象
	public static void main(String args[]) {
		ExampleFrame_03 frame = new ExampleFrame_03();//实例化对象
		frame.setVisible(true);
	}
	public ExampleFrame_03() {
		super();
		setTitle("5410实验室");
		setBounds(100, 100, 690, 1149);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 创建桌面面板
		desktopPane = new JDesktopPane();// 创建桌面面板对象
		// 设置内部窗体的拖动模式
		desktopPane.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
		getContentPane().add(desktopPane, BorderLayout.CENTER);
		// 为桌面面板添加背景图片
		final JLabel backLabel = new JLabel(); // 创建一个标签组件对象
		// 获得背景图片的路径
		URL resource = this.getClass().getResource("大背景.JPG");
		ImageIcon icon = new ImageIcon(resource); // 创建背景图片对象
		backLabel.setIcon(icon); // 令标签组件显示背景图片
		// 设置组件的显示位置及大小
		backLabel.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
		// 将标签组件添加到指定索引位置
		desktopPane.add(backLabel, new Integer(Integer.MIN_VALUE));
		// 添加按钮
		final JPanel panel = new JPanel();
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setLayout(flowLayout);
		getContentPane().add(panel, BorderLayout.NORTH);
		
		final JButton personnelButton = new JButton();
		personnelButton.setText("FPGA");
		personnelButton
				.addActionListener(new BAListener(pInFrame, "FPGA"));
		panel.add(personnelButton);
		
		final JButton reckoningButton = new JButton();
		reckoningButton.setText("嵌入式DSP");
		reckoningButton
				.addActionListener(new BAListener(rInFrame, "嵌入式DSP"));
		panel.add(reckoningButton);
		
		final JButton treatmentButton = new JButton();
		treatmentButton.setText("界面");
		treatmentButton
				.addActionListener(new BAListener(tInFrame, "界面"));
		panel.add(treatmentButton);
	}
	
	private class BAListener implements ActionListener {
		InternalFrame inFrame;
		String title;
		public BAListener(InternalFrame inFrame, String title) {
			this.inFrame = inFrame;
			this.title = title;
		}
		public void actionPerformed(ActionEvent e) {
			if (inFrame == null || inFrame.isClosed()) {
				// 获得桌面面板中的所有内部窗体
				JInternalFrame[] allFrames = desktopPane.getAllFrames();
				// 获得桌面面板中拥有内部窗体的数量
				int titleBarHight = 30 * allFrames.length;
				int x = 10 + titleBarHight, y = x;// 设置窗体的显示位置
				int width = 250, height = 180;// 设置窗体的大小
				inFrame = new InternalFrame(title);// 创建指定标题的内部窗体
				// 设置窗体的显示位置及大小
				inFrame.setBounds(x, y, width, height);
				inFrame.setVisible(true);// 设置窗体可见
				desktopPane.add(inFrame);// 将窗体添加到桌面面板中
			}
			try {
				inFrame.setSelected(true);// 选中窗体
			} catch (PropertyVetoException propertyVetoE) {
				propertyVetoE.printStackTrace();
			}
		}
	}
	private class InternalFrame extends JInternalFrame {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public InternalFrame(String title) {
			super();
			setTitle(title);// 设置内部窗体的标题
			setResizable(true);// 设置允许自由调整大小
			setClosable(true);// 设置提供关闭按钮
			setIconifiable(true);// 设置提供图标化按钮
			setMaximizable(true);// 设置提供最大化按钮
			// 获得图片的路径
			URL resource = this.getClass().getResource("in_frame.png"); 
			ImageIcon icon = new ImageIcon(resource); // 创建图片对象
			setFrameIcon(icon); // 设置窗体图标
		}
	}
}
