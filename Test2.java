package demo8;
/**
 * ������
 * @author ding
 *
 */
public class Test {
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		Zoo z;  //���常�����
		fish f = new fish();  //ʵ�����������
		Hprse h = new Hprse();
		Bird b = new Bird();
		z = f;  //���ำֵ�����࣬����ת��
		z.Move();
		z = h;
		z.Move();
		z = b;
		z.Move();
	}
}
