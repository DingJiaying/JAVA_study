package demo10;
/**
 * ��ϰͨ���������������༯
 * @author ding
 *
 */

import java.util.*;

public class IteratorDemo {
	public static void main(String[] args) {
		// ����һ��ArrayList����
				ArrayList<String> al = new ArrayList<String>();  //ʵ��������
				// ����Ԫ�ص�ArrayList��
				// ����Ԫ�ص�ArrayList��
				al.add( "Welcome" );
				al.add( "to" );
				al.add( "SEU" );
				
				// ʹ��iterator��ʾa1�е�����
				System.out.print( "a1 ��ԭʼ�����ǣ�" );
				Iterator<String> itr = al.iterator();//���������ܱ�ʵ����������ʵ��������Ķ���
				while( itr.hasNext() )                 //�ж��Ƿ�����һ���Ը�
				{
					Object element = itr.next();       //��ȡ
					System.out.print( element + " " );
				}
				System.out.println();
				
				//��ListIterator���޸�����
				ListIterator<String> litr = al.listIterator();  //��ȡ�б����������
				while(litr.hasNext()) {                    //�ж�
					String element = litr.next();          //��ȡ����
					//��set�����޸�������
					litr.set(element + "+");               //�޸�
				}
				System.out.print("a1���޸�֮������ݣ�");
				itr= al.iterator();
				while (itr.hasNext() ) {
					String element = itr.next();
					System.out.print(element + " ");
				}
				System.out.println();
				
				//�����ǽ��б��е����ݷ������
				System.out.print("���б������");
				//hasPreviours�ɺ���ǰ���
				while(litr.hasPrevious()) {    //��ȡ��һ��Ԫ��
					Object element = litr.previous();
					System.out.print(element + " ");
				}
				System.out.println();
	}

}
