package demo11;
/**
 * ��ϰ��̬������ʹ��
 * @author ding
 *
 */
class Person{
    String name;                         //����name����
    private static String city = "�й�"; //���徲̬����city
    int age;                            //����age����
    public Person(String name, int age) //����һ���вεĹ��췽��
    {
        this.name = name;
        this.age = age;
    }
    public String talk()                //������һ��talk()����
    {
        return "���ǣ�" + this.name + "�����꣺" + this.age + "�꣬���ԣ�" + city;
    }
    public static void setCity(String c)//����һ����̬����
    {
        city = c;                       
    }
}

public class StaticMethod {
	public static void main(String[] args)
    {
        Person p1 = new Person("����", 25);
        Person p2 = new Person("����", 30);
        Person p3 = new Person("����", 35);
        System.out.println("�޸�֮ǰ��Ϣ��" + p1.talk());
        System.out.println("�޸�֮ǰ��Ϣ��" + p2.talk());
        System.out.println("�޸�֮ǰ��Ϣ��" + p3.talk());
        System.out.println("   **************�޸�֮����Ϣ**************");
        // �޸ĺ����Ϣ
        Person.setCity("Ӣ��");
        System.out.println("�޸�֮����Ϣ��" + p1.talk());
        System.out.println("�޸�֮����Ϣ��" + p2.talk());
        System.out.println("�޸�֮����Ϣ��" + p3.talk());
    }
}
