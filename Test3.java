package demo3;

public class Test {
	/**
	 * @description �������ʹ��
	 * @param args
	 */
	public static void main(String[] args) {
		Student stu = new Student("С��", 10, "ѧ��");//ʵ����
		System.out.println(stu.talk());        //���÷�������ӡ
		
		Worker worker = new Worker("����", 30, "����");  //ʵ����
		System.out.println(worker.talk());     //���÷�������ӡ
		}
}
