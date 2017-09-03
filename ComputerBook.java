package demo5;

public class ComputerBook  extends Book{
	int info = 100;    //属性名与父类一致
	
	public void print() {
		System.out.println(info);
		System.out.println(super.info);
	}
}
