package demo7;
/**
 * �ַ����滻����
 * @author ding
 *
 */
public class StringReplace {
	public static void main(String[] args) {
		String str = "helloworld" ; // �ַ���
        System.out.println(str.replaceAll("o","***"));  //�����Ӵ����ֵ�λ�ö��滻
        System.out.println(str.replaceFirst("l","_"));  //�滻��һ�γ����ַ��Ӵ�
	}
}
