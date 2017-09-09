package demo12;
/**
 * ��ϰHashMap��ʹ��
 * @author ding
 *
 */
import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		// ����HashMap����,�޶�����String���ͣ�ֵ��Double����
				HashMap<String, Double> hm = new HashMap<String, Double>();
				// ����Ԫ�ص�HashMap��
				hm.put( "John Doe", new Double( 3434.34 ) );
				hm.put( "Tom Smith", new Double( 123.22 ) );
				hm.put( "Jane Baker", new Double( 1378.00 ) );
				hm.put( "Todd Hall", new Double( 99.22 ) );
				hm.put( "Ralph Smith", new Double( -19.08 ) );
				// ���ذ���ӳ������ļ��ϣ�����ӳ�����ֵ
				Set<Entry<String, Double>> set = hm.entrySet();
				// ��Iterator�õ�HashMap�е�������꿴������ֵ�����ٸ���
				Iterator<Entry<String, Double>> i = set.iterator();
				// ��ʾԪ��
				while( i.hasNext() )
				{
					// Map.Entry���Բ���ӳ�������
					Map.Entry<String, Double> me = (Map.Entry<String, Double>) i.next();
					//��ȡ��
					System.out.print( me.getKey() + ": " );
					//��ȡֵ
					System.out.println( me.getValue() );
				}
				System.out.println();
				// ��John Doe�е�ֵ����1000
				double balance = ( (Double) hm.get( "John Doe" ) ).doubleValue();
				// ���µ�ֵ�滻���ɵ�ֵ
				hm.put( "John Doe", new Double( balance + 1000 ) );
				System.out.println( "John Doe's ���ڵ��ʽ�" + hm.get( "John Doe" ) );
	}
}
