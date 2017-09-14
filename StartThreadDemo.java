package demo3;
/**
 * �ж��߳��Ƿ�����
 * @author ding
 *
 */
public class StartThreadDemo extends Thread{
	public void run()
	{
		for( int i = 0; i < 5; ++i )
		{
			printMsg();
		}
	}

	public void printMsg()
	{
		// ������д˴�����̵߳�����
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println( "name = " + name );
	}

	public static void main( String[] args )
	{
		StartThreadDemo t = new StartThreadDemo();
		t.setName( "test Thread" );
		System.out.println( "����start()����֮ǰ , t.isAlive() = " + t.isAlive() );
		t.start();
		System.out.println( "�յ���start()����ʱ , t.isAlive() = " + t.isAlive() );
		for( int i = 0; i < 5; ++i )
		{
			t.printMsg();
		}
		// ���������������ǲ��̶��ģ���ʱ���false����ʱ���true
		System.out.println( "main()��������ʱ , t.isAlive() = " + t.isAlive() );
	}
}
