package demo1;
/**
 * ��ϰʹ��ArrayList����
 * @author ding
 *
 */
import java.util.*;
public class ArrayListDemo1 {
	public static void main(String[] args) {
		// ����һ��ArrarList����
		ArrayList<String> al = new ArrayList<String>();
		System.out.println( "a1 ��Ԫ�صĸ�����" + al.size() );
		// ��ArrayList���������������
		al.add( "C" ); // 0λ��
		al.add( "A" ); // 1λ��
		al.add( "E" ); // 2λ��
		al.add( "B" ); // 3λ��
		al.add( "D" ); // 4λ��
		al.add( "F" ); // 5λ��
		// ��A2����ArrayList����ĵ�2��λ��
		al.add( 1, "A2" ); // ����֮������ݣ�C A2 A E B D F
		System.out.println( "a1 ����Ԫ��֮���Ԫ�صĸ�����" + al.size() );
		// ��ʾArraylist����
		System.out.println( "a1 ������: " + al );
		// ��ArrayList���Ƴ�����
		al.remove( "F" );
		al.remove( 2 ); // C A2 E B D
		System.out.println( "a1 ɾ��Ԫ��֮���Ԫ�صĸ���: " + al.size() );
		System.out.println( "a1 ������: " + al );
	}
}
