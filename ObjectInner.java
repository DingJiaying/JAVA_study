package demo5;
/**
 * @descript �ڲ������ϰ
 * @author ding
 *
 */
class Outer{                         //�ⲿ��
	int score = 100;                //�ⲿ���Ա����
	void inst() {                   //�ⲿ���Ա����
		Inner in = new Inner();
		in.display();
	}
	public class Inner{               //�ڲ���
		String name = "Mr.wang";      //�ڲ����Ա����
		void display() {              //�ڲ����Ա����
			System.out.println("�ɼ���score = " + score);
		}
	}
}

public class ObjectInner {
	public static void main(String[] args) {
		Outer outer = new Outer();  //ʵ��������
		outer.inst();
	}
}
