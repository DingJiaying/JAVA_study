package demo9;
/**
 * ��ϰthis���ù��췽��
 * @author ding
 *
 */
class Person{
    String name;                       //��Ա����
    int age;                           //��Ա����
    public Person()                    //�޲ι��췽��
    {
        System.out.println("1. public Person()");
    }
    public Person(String name, int age)   //�вι��췽��
    {
        // ���ñ������޲ι��췽��
        this();
        this.name = name;
        this.age = age;
        System.out.println("2. public Person(String name,int age)");
    }
}

public class ThisConstructor {
	public static void main(String[] args) {
        new Person("����", 25);
    }
}
