package demo6;
/**
 * �ַ������ҷ���
 * @author ding
 *
 */
public class StringSearch {
	public static void main(String[] args) {
		String str = "**hello$$world##" ; // �ַ���
        if (str.contains("hello"))     {    // ����hello�Ƿ����
            System.out.println("���ݴ��ڣ��Ѳ��ҵ���") ;
        }
        if (str.indexOf("l") != -1)    {   // ����hello�Ƿ����
            System.out.println("���ݴ��ڣ��ַ���λ�ã�" + str.indexOf("l")) ;
        }
        if (str.indexOf("o",6) != -1)        { // ��ָ��λ�ÿ�ʼ����
            System.out.println("���ݴ��ڣ��ַ���λ�ã�" + str.indexOf("o",6)) ;
        }
        if (str.lastIndexOf("w",12) != -1)   { // ��ָ��λ�ôӺ���ǰ��ʼ���ң�����
            System.out.println("���ݴ��ڣ��ַ���λ�ã�" + str.lastIndexOf("w",12)) ;
        }
        System.out.println(str.startsWith("**")) ;
        System.out.println(str.startsWith("$$",7)) ;
        System.out.println(str.endsWith("##")) ;
	}
}
