package demo4;

interface A{                        //����ӿ�
	public String getInfo();       //���󷽷���Ĭ�ϣ�
}

class B implements A{               //����ӿڵ�ʵ����
	public String  getInfo() {         //��д����
		return "Hello Mr.wang";
	}
}

public class ObjectInterface04 {
	public static void main(String[] args) {
		A a = new B();               //����ת��
		Object obj = a;              //ʹ��Object���գ�����ת��
		A x = (A) obj;               //����ת��
		System.out.println(x.getInfo());
	}
}
