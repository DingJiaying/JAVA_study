package demo8;
/**
 * ����ģʽ
 * @author ding
 *
 */
interface Fruit 
{   // ����һ��ˮ����׼
    public void eat() ; // ��
}
class Apple implements Fruit 
{
    public void eat() 
    {
        System.out.println("��ƻ����") ;
    }
}
class Orange implements Fruit 
{
    public void eat() 
    {
        System.out.println("�����ӡ�") ;
    }
}
class Factory1 
{ // ���಻��Ҫά�����Ե�״̬
    public static Fruit getInstance(String className) 
    {
        if ("apple".equals(className)) 
        {
            return new Apple() ;
        }
        if ("orange".equals(className))
        {
            return new Orange() ;
        }
        return null ;
    }
}

public class factory {
	public static void main(String args[] ) {  
		String name = "orange";
        Fruit f = Factory1.getInstance(name) ;    // ��ʼ������
        f.eat() ;
    }
}
