package demo4;
/**
 * ��ϰVectorDemo��ʹ��
 * @author ding
 *
 */

import java.util.*;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();  //���弯�϶����޶�����
		v.add( "A" );
		v.add( "B" );
		v.add( "C" );
		v.add( "D" );
		v.add( "E" );
		v.add( "F" );
		Enumeration<String> e = v.elements();//�˿��Ի�����еĶ���
		while( e.hasMoreElements() )    //���Դ�ö�����Ƿ��и����Ԫ��
		{
			System.out.print( e.nextElement() + "  " );//��ô�ö���еĸ����Ԫ��
		}
	}
}
