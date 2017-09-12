package demo12;
/**
 * 尝试开发一个新窗体
 * @author ding
 *
 */
import java.awt.*;
import javax.swing.*;

public class UseCase1 extends JFrame{
	private JComboBox<String> comboBox;
	public static void main(String[] args) {
		new UseCase1();

	}
	public UseCase1() {
		super();
		setVisible(true);
		setSize(200,150);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);//设置下拉列表
		comboBox = new JComboBox<>();
		comboBox.addItem("红");
		comboBox.addItem("黄");
		comboBox.addItem("蓝");
		comboBox.addItem("黑");
		getContentPane().add(comboBox, BorderLayout.NORTH);

		final JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);

		final JCheckBox checkBox = new JCheckBox();  //单选框
		checkBox.setText("男");
		panel.add(checkBox);

		final JCheckBox checkBox_1 = new JCheckBox();
		checkBox_1.setText("女");
		panel.add(checkBox_1);

		final JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.SOUTH);

		final JButton okButton = new JButton();   //确定
		okButton.setText("确定");
		panel_1.add(okButton);

		final JButton button_1 = new JButton();
		button_1.setText("取消");
		panel_1.add(button_1);
	}
}
