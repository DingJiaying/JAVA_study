package demo8;
/**
 * 练习使用HashSetDemo进行排序和存储
 * @author ding
 *
 */

import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		// 创建HashSet对象
				HashSet<String> hs = new HashSet<String>();
				// 加入元素到HastSet中
				hs.add( "B" );
				hs.add( "A" );
				hs.add( "D" );
				hs.add( "E" );
				hs.add( "C" );
				hs.add( "F" );
				System.out.println( hs );
	}

}
