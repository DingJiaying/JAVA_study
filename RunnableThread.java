package demo7;
/**
 * 练习Runnable的使用
 * @author ding
 *
 */
public class RunnableThread {
	public static void main( String args[] )
    {
        TestThread t = new TestThread();  //实例化自定义的类，自定义的线程为他提供了一个新的机会
        new Thread( t ).start();    // 使用Thread类的start方法启动线程
        for( int i = 0; i < 5; i++ )
        {
            System.out.println( "main 线程在运行" );           
            try
            {
                Thread.sleep(1000);     // 睡眠1秒
            }
            catch( InterruptedException e )
            {
                e.printStackTrace();
            }
        }
    }
}
class TestThread implements Runnable     //定义Runnable 的实现类
{
    public void run()                 //覆写Runnable的run方法
    {
        for( int i = 0; i < 5; i++ )
        {
            System.out.println( "TestThread 在运行" );
            
            try
            {
                Thread.sleep(1000);     // 睡眠1秒
            }
            catch( InterruptedException e )
            {
                e.printStackTrace();
            }
        }
    }
}
