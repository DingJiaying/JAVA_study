package demo1;
/**
 * String ���ִ�������
 * @author ding
 *
 */
public class Stringnew {
	public static void main(String[] args) {
		String str1 = "Hello" ; // ֱ�Ӹ�ֵ
	      String str2 = new String("Hello") ; // ���췽����ֵ
	      String str3 = str2 ;    // ���ô���,���ݵ��ǵ�ַ
	      System.out.println(str1 == str2) ;  // ==�Ƚϵ�ַfalse
	      System.out.println(str1 == str3) ;  // ==�Ƚϵ�ַfalse
	      System.out.println(str2 == str3) ;  // ==�Ƚϵ�ַtrue
	      System.out.println(str1.equals(str2)) ; // equals�Ƚ�����true
	      System.out.println(str1.equals(str3)) ; // equals�Ƚ�����true
	      System.out.println(str2.equals(str3)) ; // equals�Ƚ�����true
	}
}
