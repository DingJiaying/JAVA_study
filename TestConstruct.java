
public class TestConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(12);       
        p.show( "Java 构造方法的使用演示！" );
	}

}
class Person 
{
    public Person(int x)
    {   
        a = x;   //用构造方法的参数x来初始化私有变量a
        System.out.println( "构造方法被调用..." );
        System.out.println( "a = " + a );
    }

    public void show( String msg )
    {
        System.out.println( msg );
    }
     
    private int a;
}
