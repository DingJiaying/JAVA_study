package dmeo4;
/**
 * 判断是否为守护进程
 * @author ding
 *
 */
public class ThreadDaemon {
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		Thread tt = new Thread( t );
		tt.setDaemon( true ); // 设置后台运行
		tt.start();
		try
		{	// 睡眠1毫秒，避免可能出现的没有输出的现象
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
		for( int i=0; true; ++i )                                    //死循环
		{
			System.out.println( i + "  " + Thread.currentThread().getName()//获取当前线程的名字
					+ "is running." );
		}
	}
}
