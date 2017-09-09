package demo9;
/**
 * 练习TreeSet的使用，默认升序排列
 * @author ding
 *
 */

import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		// 创建一TreeSet对象
				TreeSet<String> ts = new TreeSet<String>();
				// 加入元素到TreeSet中
				ts.add("C");
				ts.add("A");
				ts.add("B");
				ts.add("E");
				ts.add("F");
				ts.add("D");
				System.out.println(ts);
	}
}
