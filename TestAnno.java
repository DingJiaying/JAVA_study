package demo2;
/**
 * ��ϰ��������ע��û��Ĭ��ֵ��ע��
 * @author ding
 *
 */
@interface AnnotationVar
{
    public String key();   //�Զ���ע�⣬һ��Ҫ������
    public String value();
}

public class TestAnno {
	//�����Զ���Annotation�ж��������� ����
	//������Ҫʹ�ñ�����=ֵ����ʽΪ������ֵ
	@AnnotationVar( key="var1",value="test" )//���Ÿ���
    public static void main( String[] args )
    {
        System.out.println( "Hello World." );
    }
}
