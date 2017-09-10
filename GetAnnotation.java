package demo5;
/**
 * ���ָ����Annotation
 * @author ding
 *
 */

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation
{
	public String key();

	public String value();
}

class Info
{
	@Override
	@Deprecated
	@SuppressWarnings( value = "" )
	@MyAnnotation( key = "one", value = "test" )
	public String toString()
	{
		return "hello";
	}
}

public class GetAnnotation {
	public static void main( String[] args ) throws Exception
	{
		Class<?> cls = Class.forName( "demo5.Info" );   //��ȡ����ʱ��Ķ���
		Method toStringMethod = cls.getMethod( "toString" );  //��ȡ����
		
		// �жϸ÷������Ƿ���ָ�����͵�Annotation����
		if( toStringMethod.isAnnotationPresent( MyAnnotation.class ) )  //�ж�
		{
			MyAnnotation my = null; // ����Annotation�Ķ���
			my = toStringMethod.getAnnotation( MyAnnotation.class );//��ȡָ�����͵�ע��
			String key = my.key();  //��ȡ�ֶΣ�������
			String value = my.value();
			System.out.println( key + " --> " + value );
		}
		
	}
}
