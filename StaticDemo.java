package demo10;
/**
 * ��ϰstatic���εĹ�������
 * @author ding
 *
 */
class Person{
    String name;
    static String city = "�й�";  //���ж�����й����
    int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String talk()
    {
        return "���ǣ�" + this.name + "�����꣺" + this.age + "�꣬���ԣ�" + city;
    }
}

public class StaticDemo {
	 public static void main(String[] args) {
	        Person p1 = new Person("����", 25);
	        Person p2 = new Person("����", 30);
	        Person p3 = new Person("����", 35);
	        System.out.println("�޸�֮ǰ��Ϣ��" + p1.talk());
	        System.out.println("�޸�֮ǰ��Ϣ��" + p2.talk());
	        System.out.println("�޸�֮ǰ��Ϣ��" + p3.talk());
	        System.out.println("  ************* �޸�֮����Ϣ **************");
	        // �޸ĺ����Ϣ
	        p1.city = "Ӣ��";
	        System.out.println("�޸�֮����Ϣ��" + p1.talk());
	        System.out.println("�޸�֮����Ϣ��" + p2.talk());
	        System.out.println("�޸�֮����Ϣ��" + p3.talk());
	    }
}
