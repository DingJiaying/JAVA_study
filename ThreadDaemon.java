package dmeo4;
/**
 * �ж��Ƿ�Ϊ�ػ�����
 * @author ding
 *
 */
public class ThreadDaemon {
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		Thread tt = new Thread( t );
		tt.setDaemon( true ); // ���ú�̨����
		tt.start();
		try
		{	// ˯��1���룬������ܳ��ֵ�û�����������
			Thread.sleep( 1 );
		}
		catch( InterruptedException e )
		{
			e.printStackTrace();
		}
}	
}
class ThreadTest implements Runnable
{
	public void run()
	{
		for( int i=0; true; ++i )                                    //��ѭ��
		{
			System.out.println( i + "  " + Thread.currentThread().getName()//��ȡ��ǰ�̵߳�����
					+ "is running." );
		}
	}
}
