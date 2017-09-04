package demo7;
/**
 * @description 抽象类的继承和接口的实现
 * @author ding
 *
 */

interface A{   //定义接口A
	void print();
}

interface B{  //定义接口B
	void get();
}

abstract class C{
	public abstract void fun(); //定义抽象类
	
}

class X extends C implements A,B{   //覆写
	public void print(){
		System.out.println("这是接口A的函数");
	}
	
	public void get(){
		System.out.println("这是接口B的函数");
	}
	
	public void fun() {
		System.out.println("这是父类C的函数");
	}
}

public class ExtendInterface {
	/**
	 * 主方法
	 */
	public static void main(String[] args) {
		X x = new X();  //实例化
		A a = x;
		B b = x;
		C c = x;
		a.print();
		b.get();
		c.fun();		
	}

}
