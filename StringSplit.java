package demo9;
/**
 * �ַ�����ַ��������ز��֮�������
 * @author ding
 *
 */
public class StringSplit {
	public static void main(String[] args) {
		String str = "hello world hello java" ; // �ַ���
        String data[] = str.split(" ") ;   // ���տո���
        for (int i = 0 ; i < data.length ; i ++) 
        {
            System.out.println(data[i]) ;
        }
        System.out.println("-----------");
        String data1[] = str.split(" " , 3) ;   // ���տո���
        for (int i = 0 ; i < data1.length ; i ++) 
        {
            System.out.println(data1[i]) ;
        }
	}
}
