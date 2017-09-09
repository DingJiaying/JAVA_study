package demo13;
/**
 * ��ϰTreeMap��ʹ�ã���Ȼ˳������
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
		// ����һ��TreeMap���󣬲��޶�����String���ͣ�ֵ��Double����
				TreeMap<String, Double> tm = new TreeMap<String, Double>(
						new Employee() );
				// ��Map�����в���Ԫ��
				tm.put( "Z������", new Double( 3534.34 ) );
				tm.put( "L������", new Double( 126.22 ) );
				tm.put( "W������", new Double( 1578.40 ) );
				tm.put( "Z������", new Double( 99.62 ) );
				tm.put( "S������", new Double( -29.08 ) );
				Set<Entry<String, Double>> set = tm.entrySet();
				Iterator<Entry<String, Double>> itr = set.iterator();
				while( itr.hasNext() )
				{
					Map.Entry<String, Double> me = (Map.Entry<String, Double>) itr.next();
					System.out.print( me.getKey() + ": " );
					System.out.println( me.getValue() );
				}
				System.out.println();
				double balance = ( (Double) tm.get( "Z������" ) ).doubleValue();
				tm.put( "Z������", new Double( balance + 2000 ) );
				System.out.println( "�������µ��ʽ���Ϊ�� " + tm.get( "Z������" ) );
	}
}
