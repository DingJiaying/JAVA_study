package demo7;
/**
 * ��ϰRunnable��ʹ��
 * @author ding
 *
 */
public class RunnableThread {
	public static void main( String args[] )
    {
        TestThread t = new TestThread();  //ʵ�����Զ�����࣬�Զ�����߳�Ϊ���ṩ��һ���µĻ���
        new Thread( t ).start();    // ʹ��Thread���start���������߳�
        for( int i = 0; i < 5; i++ )
        {
            System.out.println( "main �߳�������" );           
            try
            {
                Thread.sleep(1000);     // ˯��1��
            }
            catch( InterruptedException e )
            {
                e.printStackTrace();
            }
        }
    }
}
class TestThread implements Runnable     //����Runnable ��ʵ����
{
    public void run()                 //��дRunnable��run����
    {
        for( int i = 0; i < 5; i++ )
        {
            System.out.println( "TestThread ������" );
            
            try
            {
                Thread.sleep(1000);     // ˯��1��
            }
            catch( InterruptedException e )
            {
                e.printStackTrace();
            }
        }
    }
}
