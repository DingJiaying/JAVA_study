package demo3;
/**
 * ��ϰLinkedList��ʹ��
 * @author ding
 *
 */
import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		// ����LinkedList����
				LinkedList<String> LL = new LinkedList<String>();
				// ����Ԫ�ص�LinkedList��
				LL.add( "F" );
				LL.add( "F" );
				LL.add( "D" );
				LL.add( "E" );
				LL.add( "C" );
				// ����������һ��λ�ü�������
				LL.addLast( "Z" );
				// ������ĵ�һ��λ���ϼ�������
				LL.addFirst( "A" );
				// ������ڶ���Ԫ�ص�λ���ϼ�������
				LL.add( 1, "A2" );
				System.out.println( "LL ��������ݣ�" + LL );
				// ��linkedlist���Ƴ�Ԫ��
				LL.remove( "F" );     //���ձ�ǩ����ɾ��
				System.out.println( "ɾ��Ԫ��F���LL ���ݣ�" + LL );
				LL.remove( 2 );    //������Ž���ɾ��
				System.out.println( "��LL���Ƴ��ڶ���Ԫ�غ������֮��" + LL );
				// �Ƴ���һ�������һ��Ԫ��
				LL.removeFirst();
				LL.removeLast();
				System.out.println( "LL �Ƴ���һ�������һ��Ԫ��֮������ݣ�" + LL );
				// ȡ�ò�����ֵ
				Object val = LL.get( 2 );  // set�ҵ���Ӧ���±꣬�޸���Ӧ������
				LL.set( 2, (String) val + " Changed" );  
				System.out.println( "LL ���ı�֮��" + LL );
	}
}
