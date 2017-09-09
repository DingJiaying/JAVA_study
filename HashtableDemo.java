package demo14;
/**
 * 练习Hashtable的使用
 * @author ding
 *
 */
import java.util.*;

public class HashtableDemo {
	public static void main(String[] args) {
		//实例化Hashtable对象，并限定键是String类型，值是Integer类型
		Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
		//集合新增对象
		numbers.put( "one", new Integer( 1 ) );
		numbers.put( "two", new Integer( 2 ) );
		numbers.put( "three", new Integer( 3 ) );
		//根据键获取对应的值
		Integer n = (Integer) numbers.get( "two" );
		if( n != null )
		{
			System.out.println( "two = " + n );
		}
	}
}
