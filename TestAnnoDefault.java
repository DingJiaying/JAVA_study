package demo3;
/**
 * ��ϰ��������ע����Ĭ��ֵ��ע��
 * @author ding
 *
 */
@interface AnnotationDef
{
    public String key() default "var1";   
    public String value() default "test";
}
public class TestAnnoDefault {  //��Ĭ��ֵ��һ����Ҫ��ֵ
	@AnnotationDef() 
	public static void main( String[] args )
	{
	        System.out.println( "Hello World." );
	    }
}
