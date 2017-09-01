/**

 * @ClassName: TestPerson

 * @Description: 在类的内部调用方法

 * @author: YuHong & Kehr

 * @date: 2014年2月10日 下午3:17:18


 */

class Person
{
	private String name;
	private int age;

	private void talk()
	{
		System.out.println( "我是：" + name + "  今年：" + age + "岁" );
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
		// 声明并实例化一个Person对象p
		Person p = new Person();
		// 给p中的属性赋值
		p.setName( "kehr" );
		// 在这里将p对象中的年龄属性赋值为22岁
		p.setAge( 22 );
		// 调用Person类中的say()方法
		p.say();
	}

}

