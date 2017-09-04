package demo6;

public class x implements A,B{  //定义子类，实践类
	
	public void print() {   //覆写接口A的方法
		System.out.println("你好");
	}

	public void get(){     //覆写接口B的方法
		System.out.println(INFO);
	}
}
