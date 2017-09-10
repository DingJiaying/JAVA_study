package demo4;
/**
 * 练习获得所有的Annotation
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
		Class<?> cls = Class.forName( "demo4.Info" );//获取类的运行时对象
		Method toStringMethod = cls.getMethod( "toString" ); //获取方法
		// 取得全部的Annotation
		Annotation ans[] = toStringMethod.getAnnotations();
		
		for( int i=0; i<ans.length; ++i )   //遍历的方式进行打印
		{
			System.out.println( ans[i] );
		}
	}
}
