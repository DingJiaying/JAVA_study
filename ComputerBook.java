package demo5;

public class ComputerBook  extends Book{
	int info = 100;    //�������븸��һ��
	
	public void print() {
		System.out.println(info);
		System.out.println(super.info);
	}
}
