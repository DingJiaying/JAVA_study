package demo4;
/**
 * �ַ������ַ������໥ת��,�任��Сд
 * @author ding
 *
 */
public class StringArray {
	public static void main(String[] args) {
		String str = "hellojava" ;
        char data[]= str.toCharArray() ;  // ���ַ�����Ϊ�ַ�����
        for (int x = 0 ; x < data.length ;x ++) 
        {
            System.out.print(data[x] + "��") ;
            data[x] -= 32 ; // Сд��Ϊ��д
        }
        System.out.println() ;
        System.out.println("��ȫ���ַ������Ϊ�ַ�����" + new String(data)) ;
        // ȡ�ò������ݵ�ʱ����Ҫ���ÿ�ʼ���ȡ�õĳ���
        System.out.println("�������ַ������Ϊ�ַ�����" + new String(data,5,4)) ;
	}
}
