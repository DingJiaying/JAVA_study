package demo3;
/**
 * @description ��ϰhashCode
 * @author ding
 *
 */
class Person {
    int id;//���
    String name ;//����
    public Person(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }
    public int hashCode()//��дhashCode����
    {
        return id * (name.hashCode());
    }
    public boolean equals(Object o)//��дequals����
    {
        Person p = (Person) o;
        return (this.id == p.id) && (this.name.equals(p.name));
    }
}
public class ObjectHashCode 
{
    public static void main(String args[]) 
    {
        Person p1 = new Person(1, "С��");
        Person p2 = new Person(1, "С��");
        Person p3 = new Person(2, "С��");
        System.out.println(p1.equals(p2));//���p1��p2�ȽϵĽ��
        System.out.println(p1.equals(p3));//���p1��p3�ȽϵĽ��
        System.out.println(p1.hashCode());//���p1��hashCode
        System.out.println(p2.hashCode());//���p2��hashCode
        System.out.println(p3.hashCode());//���p2��hashCode

    }
}