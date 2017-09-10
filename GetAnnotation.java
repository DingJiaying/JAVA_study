package demo5;
/**
 * 获得指定的Annotation
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
		Class<?> cls = Class.forName( "demo5.Info" );   //获取运行时类的对象
		Method toStringMethod = cls.getMethod( "toString" );  //获取方法
		
		// 判断该方法上是否有指定类型的Annotation存在
		if( toStringMethod.isAnnotationPresent( MyAnnotation.class ) )  //判断
		{
			MyAnnotation my = null; // 声明Annotation的对象
			my = toStringMethod.getAnnotation( MyAnnotation.class );//获取指定类型的注解
			String key = my.key();  //获取字段，带（）
			String value = my.value();
			System.out.println( key + " --> " + value );
		}
		
	}
}
