package demo7;
/**
 * @description ����������
 * @author ding
 *
 */
public class FunPoly {
	
	void sum(int i) {
		System.out.println("���ֺ�Ϊ"+i);
	}
	
	void sum(int i, int j) {
		System.out.println("���ֺ�Ϊ"+(i+j));
	}
/**
 * ������
 */
	public static void main(String[] agrs) {
		FunPoly fp = new FunPoly();
		fp.sum(1);
		fp.sum(1,2);
	}
}
