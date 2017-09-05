package demo5;
/**
 * @descript 内部类的练习
 * @author ding
 *
 */
class Outer{                         //外部类
	int score = 100;                //外部类成员变量
	void inst() {                   //外部类成员方法
		Inner in = new Inner();
		in.display();
	}
	public class Inner{               //内部类
		String name = "Mr.wang";      //内部类成员变量
		void display() {              //内部类成员方法
			System.out.println("成绩：score = " + score);
		}
	}
}

public class ObjectInner {
	public static void main(String[] args) {
		Outer outer = new Outer();  //实例化对象
		outer.inst();
	}
}
