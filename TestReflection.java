package demo2;
/***
 * ��ϰ������ƣ����ݶ����ҵ���
 * @author ding
 *
 */
import java.util.Date;
public class TestReflection {
	public static void main(String[] args) throws Exception {
		Date date = new Date();         //ʵ��������
        Class<?> cls = date.getClass() ;// ͨ��Java������Ƶõ���İ���
        System.out.println(cls);
        System.out.println(cls.getName());
        System.out.println(cls.getTypeName());
	}
}
