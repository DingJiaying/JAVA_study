package demo3;
/**
 * 练习带变量的注解有默认值的注解
 * @author ding
 *
 */
@interface AnnotationDef
{
    public String key() default "var1";   
    public String value() default "test";
}
public class TestAnnoDefault {  //有默认值不一定需要赋值
	@AnnotationDef() 
	public static void main( String[] args )
	{
	        System.out.println( "Hello World." );
	    }
}
