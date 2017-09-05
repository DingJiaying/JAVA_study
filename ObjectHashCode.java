package demo3;
/**
 * @description 练习hashCode
 * @author ding
 *
 */
class Person {
    int id;//编号
    String name ;//姓名
    public Person(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }
    public int hashCode()//覆写hashCode方法
    {
        return id * (name.hashCode());
    }
    public boolean equals(Object o)//覆写equals方法
    {
        Person p = (Person) o;
        return (this.id == p.id) && (this.name.equals(p.name));
    }
}
public class ObjectHashCode 
{
    public static void main(String args[]) 
    {
        Person p1 = new Person(1, "小刚");
        Person p2 = new Person(1, "小刚");
        Person p3 = new Person(2, "小刘");
        System.out.println(p1.equals(p2));//输出p1与p2比较的结果
        System.out.println(p1.equals(p3));//输出p1与p3比较的结果
        System.out.println(p1.hashCode());//输出p1的hashCode
        System.out.println(p2.hashCode());//输出p2的hashCode
        System.out.println(p3.hashCode());//输出p2的hashCode

    }
}