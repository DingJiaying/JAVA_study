package demo6;
/**
 * 匿名内部类的练习
 * @author ding
 *
 */
abstract class Bird             //抽象类
{
    private String name;           //成员变量
    public String getName()          //普通的成员方法
    {
        return name;
    }
    public void setName(String name)   
    {
        this.name = name;
    }
    public abstract int fly();          //抽象方法
}
public class AnonymousInnerClass {         //定义测试类
	public void test(Bird bird)           //普通的成员方法
    {
        System.out.println(bird.getName() + "最高能飞 " + bird.fly() + "米");
    }
    public static void main(String[] args)     //主方法
    {
    	AnonymousInnerClass test = new AnonymousInnerClass();
        test.test(new Bird()
        {
            public int fly()
            {
                return 1000;
            }
            public String getName()
            {
                return "小鸟";
            }
        });
    }
}
