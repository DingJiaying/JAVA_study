package demo7;
/**
 * @description 方法的重载
 * @author ding
 *
 */
public class FunPoly {
	
	void sum(int i) {
		System.out.println("数字和为"+i);
	}
	
	void sum(int i, int j) {
		System.out.println("数字和为"+(i+j));
	}
/**
 * 主方法
 */
	public static void main(String[] agrs) {
		FunPoly fp = new FunPoly();
		fp.sum(1);
		fp.sum(1,2);
	}
}
