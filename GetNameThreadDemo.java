package demo1;
/**
 * ����̵߳�����
 * @author ding
 *
 */
public class GetNameThreadDemo extends Thread{  //�̳�Thread��
	public void run()                   //��дThread���run����
	{
		for( int i = 0; i < 5; ++i )
		{
			printMsg();
			
			try
			{
				Thread.sleep(1000);		// ˯��1��
			}
			catch( InterruptedException e )
			{
				e.printStackTrace();
			}
		}
	}

	public void printMsg()
	{
		// ������д˴�����̵߳�����
		Thread t = Thread.currentThread();   //��ȡ��ǰ�߳�
		String name = t.getName();       //��ȡ��ǰ�̵߳�����
		System.out.println( "name = " + name );
	}

	public static void main( String[] args )
	{
		GetNameThreadDemo t1 = new GetNameThreadDemo();//����ʵ�����̶߳���
		t1.start();                                //�����߳�
		for( int i = 0; i < 5; ++i )
		{
			t1.printMsg();                       //�����˴�ӡ����
			
			try
			{
				Thread.sleep(1000);		// ˯��1��
			}
			catch( InterruptedException e )
			{
				e.printStackTrace();
			}
		}
	}
}
