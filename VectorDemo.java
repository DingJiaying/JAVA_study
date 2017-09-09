package demo4;
/**
 * 练习VectorDemo的使用
 * @author ding
 *
 */

import java.util.*;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();  //定义集合对象，限定类型
		v.add( "A" );
		v.add( "B" );
		v.add( "C" );
		v.add( "D" );
		v.add( "E" );
		v.add( "F" );
		Enumeration<String> e = v.elements();//了可以获得所有的对象
		while( e.hasMoreElements() )    //测试此枚举中是否还有更多的元素
		{
			System.out.print( e.nextElement() + "  " );//获得此枚举中的更多的元素
		}
	}
}
