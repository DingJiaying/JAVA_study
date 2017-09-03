package demo8;
/**
 * 测试类
 * @author ding
 *
 */
public class Test {
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		Zoo z;  //定义父类对象
		fish f = new fish();  //实例化子类对象
		Hprse h = new Hprse();
		Bird b = new Bird();
		z = f;  //子类赋值给父类，向上转型
		z.Move();
		z = h;
		z.Move();
		z = b;
		z.Move();
	}
}
