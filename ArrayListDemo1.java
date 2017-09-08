package demo1;
/**
 * 练习使用ArrayList对象
 * @author ding
 *
 */
import java.util.*;
public class ArrayListDemo1 {
	public static void main(String[] args) {
		// 创建一个ArrarList对象
		ArrayList<String> al = new ArrayList<String>();
		System.out.println( "a1 中元素的个数：" + al.size() );
		// 向ArrayList对象中添加新内容
		al.add( "C" ); // 0位置
		al.add( "A" ); // 1位置
		al.add( "E" ); // 2位置
		al.add( "B" ); // 3位置
		al.add( "D" ); // 4位置
		al.add( "F" ); // 5位置
		// 把A2加在ArrayList对象的第2个位置
		al.add( 1, "A2" ); // 加入之后的内容：C A2 A E B D F
		System.out.println( "a1 加入元素之后的元素的个数：" + al.size() );
		// 显示Arraylist数据
		System.out.println( "a1 的内容: " + al );
		// 从ArrayList中移除数据
		al.remove( "F" );
		al.remove( 2 ); // C A2 E B D
		System.out.println( "a1 删除元素之后的元素的个数: " + al.size() );
		System.out.println( "a1 的内容: " + al );
	}
}
