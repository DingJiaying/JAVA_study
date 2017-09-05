package demo11;
/**
 * 练习静态方法的使用
 * @author ding
 *
 */
class Person{
    String name;                         //定义name属性
    private static String city = "中国"; //定义静态属性city
    int age;                            //定义age属性
    public Person(String name, int age) //声明一个有参的构造方法
    {
        this.name = name;
        this.age = age;
    }
    public String talk()                //声明了一个talk()方法
    {
        return "我是：" + this.name + "，今年：" + this.age + "岁，来自：" + city;
    }
    public static void setCity(String c)//声明一个静态方法
    {
        city = c;                       
    }
}

public class StaticMethod {
	public static void main(String[] args)
    {
        Person p1 = new Person("张三", 25);
        Person p2 = new Person("李四", 30);
        Person p3 = new Person("王五", 35);
        System.out.println("修改之前信息：" + p1.talk());
        System.out.println("修改之前信息：" + p2.talk());
        System.out.println("修改之前信息：" + p3.talk());
        System.out.println("   **************修改之后信息**************");
        // 修改后的信息
        Person.setCity("英国");
        System.out.println("修改之后信息：" + p1.talk());
        System.out.println("修改之后信息：" + p2.talk());
        System.out.println("修改之后信息：" + p3.talk());
    }
}
