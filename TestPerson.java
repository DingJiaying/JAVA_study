/**

 * @ClassName: TestPerson

 * @Description: ������ڲ����÷���

 * @author: YuHong & Kehr

 * @date: 2014��2��10�� ����3:17:18


 */

class Person
{
	private String name;
	private int age;

	private void talk()
	{
		System.out.println( "���ǣ�" + name + "  ���꣺" + age + "��" );
	}

	public void say()
	{
		talk();
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge( int age )
	{
		this.age = age;
	}

}

public class TestPerson
{
	public static void main( String[] args )
	{
		// ������ʵ����һ��Person����p
		Person p = new Person();
		// ��p�е����Ը�ֵ
		p.setName( "kehr" );
		// �����ｫp�����е��������Ը�ֵΪ22��
		p.setAge( 22 );
		// ����Person���е�say()����
		p.say();
	}

}

