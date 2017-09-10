package demo2;
/**
 * 练习带变量的注解没有默认值的注解
 * @author ding
 *
 */
@interface AnnotationVar
{
    public String key();   //自定义注解，一定要带（）
    public String value();
}

public class TestAnno {
	//由于自定义Annotation中定义了两个 变量
	//所以需要使用变量名=值的形式为变量赋值
	@AnnotationVar( key="var1",value="test" )//逗号隔开
    public static void main( String[] args )
    {
        System.out.println( "Hello World." );
    }
}
