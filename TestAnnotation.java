package demo1;
/**
 * ��ϰ�Զ��� ����������Annotation��ʹ��
 * @author ding
 *
 */
@interface MyAnnotation{     //�Զ���ע��
	
}
public class TestAnnotation {
	// ʹ���Զ����MyAnnotation Annotation
    @MyAnnotation
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
