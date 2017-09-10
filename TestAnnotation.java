package demo1;
/**
 * 练习自定义 不带变量的Annotation的使用
 * @author ding
 *
 */
@interface MyAnnotation{     //自定义注解
	
}
public class TestAnnotation {
	// 使用自定义的MyAnnotation Annotation
    @MyAnnotation
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
