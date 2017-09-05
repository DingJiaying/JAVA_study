package demo8;
/**
 * 练习this的使用，指向当前对象
 * @author ding
 *
 */
class Person
{
    String name;
    int age;
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    boolean compare(Person p)
    {
        if (this.name.equals(p.name) && this.age == p.age)
        {
            return true;
        } else
        {
            return false;
        }
    }
}

public class ThisCompareDemo {
	public static void main(String[] args)
    {
        Person p1 = new Person("张三", 30);
        Person p2 = new Person("张三", 30);
        System.out.println(p1.compare(p2) ? "相等,是同一人!" : "不相等,不是同一人!");
    }
}
