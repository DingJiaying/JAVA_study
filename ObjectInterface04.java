package demo4;

interface A{                        //定义接口
	public String getInfo();       //抽象方法（默认）
}

class B implements A{               //定义接口的实现类
	public String  getInfo() {         //覆写方法
		return "Hello Mr.wang";
	}
}

public class ObjectInterface04 {
	public static void main(String[] args) {
		A a = new B();               //向上转型
		Object obj = a;              //使用Object接收，向上转型
		A x = (A) obj;               //向下转型
		System.out.println(x.getInfo());
	}
}
