package demo2;
/**
 * ��ϰArrayList�����������͵Ĵ���
 * @author ding
 *
 */
import java.util.*;

public class ArrayListToArray {
	public static void main(String[] args) {
		// ����һ���Ͷ������͵�ArrayList����al���������������༯����Ϊ���ܰѻ������ʹ洢���༯��
				ArrayList<Integer> al = new ArrayList<Integer>();
				// ��ArrayList�м������
				al.add( new Integer( 1 ) );
				al.add( new Integer( 2 ) );
				al.add( new Integer( 3 ) );
				al.add( new Integer( 4 ) );
				System.out.println( "ArrayList �е����� �� " + al );
				// �õ���������
				Object ia[] = al.toArray();
				int sum = 0;
				// ������������
				for( int i = 0; i < ia.length; i++ )
				{
					sum += ( (Integer) ia[i] ).intValue();
				}
				System.out.println( "�����ۼӽ���ǣ� " + sum );
	}
}
