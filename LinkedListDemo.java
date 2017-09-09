package demo3;
/**
 * 练习LinkedList的使用
 * @author ding
 *
 */
import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		// 创建LinkedList对象
				LinkedList<String> LL = new LinkedList<String>();
				// 加入元素到LinkedList中
				LL.add( "F" );
				LL.add( "F" );
				LL.add( "D" );
				LL.add( "E" );
				LL.add( "C" );
				// 在链表的最后一个位置加上数据
				LL.addLast( "Z" );
				// 在链表的第一个位置上加入数据
				LL.addFirst( "A" );
				// 在链表第二个元素的位置上加入数据
				LL.add( 1, "A2" );
				System.out.println( "LL 最初的内容：" + LL );
				// 从linkedlist中移除元素
				LL.remove( "F" );     //按照标签进行删除
				System.out.println( "删除元素F后的LL 内容：" + LL );
				LL.remove( 2 );    //按照序号进行删除
				System.out.println( "从LL中移除第二个元素后的内容之后：" + LL );
				// 移除第一个和最后一个元素
				LL.removeFirst();
				LL.removeLast();
				System.out.println( "LL 移除第一个和最后一个元素之后的内容：" + LL );
				// 取得并设置值
				Object val = LL.get( 2 );  // set找到相应的下标，修改相应的内容
				LL.set( 2, (String) val + " Changed" );  
				System.out.println( "LL 被改变之后：" + LL );
	}
}
