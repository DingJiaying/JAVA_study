
public class TestConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(12);       
        p.show( "Java ���췽����ʹ����ʾ��" );
	}

}
class Person 
{
    public Person(int x)
    {   
        a = x;   //�ù��췽���Ĳ���x����ʼ��˽�б���a
        System.out.println( "���췽��������..." );
        System.out.println( "a = " + a );
    }

    public void show( String msg )
    {
        System.out.println( msg );
    }
     
    private int a;
}
