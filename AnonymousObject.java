package demo7;
/**
 * @descript ��ϰ��������
 * @author ding
 *
 */
class Person
{
    private String name = "����";
    private int age = 25;
    public String talk()
    {
        return "���ǣ�" + name + "�����꣺" + age + "��";
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
