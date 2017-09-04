package demo8;
/**
 * 工厂模式
 * @author ding
 *
 */
interface Fruit 
{   // 定义一个水果标准
    public void eat() ; // 吃
}
class Apple implements Fruit 
{
    public void eat() 
    {
        System.out.println("吃苹果。") ;
    }
}
class Orange implements Fruit 
{
    public void eat() 
    {
        System.out.println("吃橘子。") ;
    }
}
class Factory1 
{ // 此类不需要维护属性的状态
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
        Fruit f = Factory1.getInstance(name) ;    // 初始化参数
        f.eat() ;
    }
}
