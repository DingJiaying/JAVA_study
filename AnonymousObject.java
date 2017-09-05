package demo7;
/**
 * @descript 练习匿名对象
 * @author ding
 *
 */
class Person
{
    private String name = "张三";
    private int age = 25;
    public String talk()
    {
        return "我是：" + name + "，今年：" + age + "岁";
    }
}
public class AnonymousObject {
	public static void main(String[] args) {
		/*Person p = new Person();
		System.out.println(p.talk());
		*/
        System.out.println(new Person().talk());
    }
}
