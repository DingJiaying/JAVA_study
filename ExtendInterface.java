package demo7;
/**
 * @description ������ļ̳кͽӿڵ�ʵ��
 * @author ding
 *
 */

interface A{   //����ӿ�A
	void print();
}

interface B{  //����ӿ�B
	void get();
}

abstract class C{
	public abstract void fun(); //���������
	
}

class X extends C implements A,B{   //��д
	public void print(){
		System.out.println("���ǽӿ�A�ĺ���");
	}
	
	public void get(){
		System.out.println("���ǽӿ�B�ĺ���");
	}
	
	public void fun() {
		System.out.println("���Ǹ���C�ĺ���");
	}
}

public class ExtendInterface {
	/**
	 * ������
	 */
	public static void main(String[] args) {
		X x = new X();  //ʵ����
		A a = x;
		B b = x;
		C c = x;
		a.print();
		b.get();
		c.fun();		
	}

}
