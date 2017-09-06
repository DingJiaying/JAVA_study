package demo4;
/**
 * 使用反射机制的工厂模式，无参的构造方法
 * @author ding
 *
 */

interface Book {
    public String getTitle() ; //定义接口
}

class MathBook implements Book {   //定义接口的实现类
    @Override
    public String getTitle() 
    {
        return "数学类图书。" ;
    }
}

class ComputerBook implements Book   //定义接口的实现类
{
    @Override
    public String getTitle()
    {
        return "计算机类图书。" ;
    }
}

class Factory {
    public static Book getInstance(String className)
    {
        Book book = null ;
        try {
            book = (Book) Class.forName(className).newInstance() ;  //通过反射得到对应的类的对象
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
