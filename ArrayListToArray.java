package demo2;
/**
 * 练习ArrayList对于数据类型的处理
 * @author ding
 *
 */
import java.util.*;

public class ArrayListToArray {
	public static void main(String[] args) {
		// 创建一整型对象类型的ArrayList对象al，创建了整数的类集，因为不能把基本类型存储在类集中
				ArrayList<Integer> al = new ArrayList<Integer>();
				// 向ArrayList中加入对象
				al.add( new Integer( 1 ) );
				al.add( new Integer( 2 ) );
				al.add( new Integer( 3 ) );
				al.add( new Integer( 4 ) );
				System.out.println( "ArrayList 中的内容 ： " + al );
				// 得到对象数组
				Object ia[] = al.toArray();
				int sum = 0;
				// 计算数组内容
				for( int i = 0; i < ia.length; i++ )
				{
					sum += ( (Integer) ia[i] ).intValue();
				}
				System.out.println( "数组累加结果是： " + sum );
	}
}
