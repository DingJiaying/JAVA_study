package demo12;
/**
 * 练习HashMap的使用
 * @author ding
 *
 */
import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		// 创建HashMap对象,限定键是String类型，值是Double类型
				HashMap<String, Double> hm = new HashMap<String, Double>();
				// 加入元素到HashMap中
				hm.put( "John Doe", new Double( 3434.34 ) );
				hm.put( "Tom Smith", new Double( 123.22 ) );
				hm.put( "Jane Baker", new Double( 1378.00 ) );
				hm.put( "Todd Hall", new Double( 99.22 ) );
				hm.put( "Ralph Smith", new Double( -19.08 ) );
				// 返回包含映射中项的集合，返回映射键和值
				Set<Entry<String, Double>> set = hm.entrySet();
				// 用Iterator得到HashMap中的内容鼠标看出访问值类型再复制
				Iterator<Entry<String, Double>> i = set.iterator();
				// 显示元素
				while( i.hasNext() )
				{
					// Map.Entry可以操作映射的输入
					Map.Entry<String, Double> me = (Map.Entry<String, Double>) i.next();
					//获取键
					System.out.print( me.getKey() + ": " );
					//获取值
					System.out.println( me.getValue() );
				}
				System.out.println();
				// 让John Doe中的值增加1000
				double balance = ( (Double) hm.get( "John Doe" ) ).doubleValue();
				// 用新的值替换掉旧的值
				hm.put( "John Doe", new Double( balance + 1000 ) );
				System.out.println( "John Doe's 现在的资金：" + hm.get( "John Doe" ) );
	}
}
