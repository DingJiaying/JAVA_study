package demo4;
/**
 * ʹ�÷�����ƵĹ���ģʽ���޲εĹ��췽��
 * @author ding
 *
 */

interface Book {
    public String getTitle() ; //����ӿ�
}

class MathBook implements Book {   //����ӿڵ�ʵ����
    @Override
    public String getTitle() 
    {
        return "��ѧ��ͼ�顣" ;
    }
}

class ComputerBook implements Book   //����ӿڵ�ʵ����
{
    @Override
    public String getTitle()
    {
        return "�������ͼ�顣" ;
    }
}

class Factory {
    public static Book getInstance(String className)
    {
        Book book = null ;
        try {
            book = (Book) Class.forName(className).newInstance() ;  //ͨ������õ���Ӧ����Ķ���
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        return book ;
    }
}

public class TestFactory01 {
	public static void main(String args[]) throws Exception {
        Book book = Factory.getInstance("demo4.ComputerBook") ;
        System.out.println(book.getTitle());
    }
}
