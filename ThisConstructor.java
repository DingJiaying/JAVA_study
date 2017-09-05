package demo9;
/**
 * 练习this调用构造方法
 * @author ding
 *
 */
class Person{
    String name;                       //成员变量
    int age;                           //成员变量
    public Person()                    //无参构造方法
    {
        System.out.println("1. public Person()");
    }
    public Person(String name, int age)   //有参构造方法
    {
        // 调用本类中无参构造方法
        this();
        this.name = name;
        this.age = age;
        System.out.println("2. public Person(String name,int age)");
    }
}

public class ThisConstructor {
	public static void main(String[] args) {
        new Person("张三", 25);
    }
}
