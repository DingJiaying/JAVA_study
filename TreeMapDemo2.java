package demo13;
/**
 * 练习TreeMap的使用，自然顺序排序
 * @author ding
 *
 */

import java.util.*;
import java.util.Map.Entry;

class Employee implements Comparator<Object>
{
	public int compare( Object a, Object b )
	{
		int k;
		String aStr, bStr;
		aStr = (String) a;
		bStr = (String) b;
		k = aStr.compareTo( bStr );
		if( k == 0 )
			return aStr.compareTo( bStr );
		else
			return k;
	}
}

public class TreeMapDemo2 {
	public static void main(String[] args) {
		// 创建一个TreeMap对象，并限定键是String类型，值是Double类型
				TreeMap<String, Double> tm = new TreeMap<String, Double>(
						new Employee() );
				// 向Map对象中插入元素
				tm.put( "Z、张三", new Double( 3534.34 ) );
				tm.put( "L、李四", new Double( 126.22 ) );
				tm.put( "W、王五", new Double( 1578.40 ) );
				tm.put( "Z、赵六", new Double( 99.62 ) );
				tm.put( "S、孙七", new Double( -29.08 ) );
				Set<Entry<String, Double>> set = tm.entrySet();
				Iterator<Entry<String, Double>> itr = set.iterator();
				while( itr.hasNext() )
				{
					Map.Entry<String, Double> me = (Map.Entry<String, Double>) itr.next();
					System.out.print( me.getKey() + ": " );
					System.out.println( me.getValue() );
				}
				System.out.println();
				double balance = ( (Double) tm.get( "Z、张三" ) ).doubleValue();
				tm.put( "Z、张三", new Double( balance + 2000 ) );
				System.out.println( "张三最新的资金数为： " + tm.get( "Z、张三" ) );
	}
}
