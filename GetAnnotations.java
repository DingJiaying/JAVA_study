package demo4;
/**
 * ��ϰ������е�Annotation
 * @author ding
 *
 */
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class Info
{
	@Override
	@Deprecated
	@SuppressWarnings( value = "this is a warning" )
	public String toString()
	{
		return "Hello World!";
	}
}
public class GetAnnotations {
	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName( "demo4.Info" );//��ȡ�������ʱ����
		Method toStringMethod = cls.getMethod( "toString" ); //��ȡ����
		// ȡ��ȫ����Annotation
		Annotation ans[] = toStringMethod.getAnnotations();
		
		for( int i=0; i<ans.length; ++i )   //�����ķ�ʽ���д�ӡ
		{
			System.out.println( ans[i] );
		}
	}
}
