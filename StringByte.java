package demo5;
/**
 * �ַ������ֽ��໥ת��
 * @author ding
 *
 */
public class StringByte {
	public static void main(String[] args) {
		String str = "hellojava" ;      // ֱ�Ӹ�ֵ�������ַ���
        byte data[]  = str.getBytes() ; // ���뽫�ַ�����Ϊbyte�ֽ�����
        for (int x = 0 ; x < data.length ; x ++)
        {
            data[x] -= 32 ;
        }
        System.out.println(new String(data)) ;//��ȫ����byte�����Ϊ�ַ���
        System.out.println(new String(data,5,4)) ;//�����ֵ�byte�����Ϊ�ַ���
	}
}
